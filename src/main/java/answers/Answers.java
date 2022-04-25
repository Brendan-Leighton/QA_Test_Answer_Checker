package answers;

import helper.Print;
import helper.Answer;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.util.HashMap;
import java.util.Map;

/**
 * WEB DRIVER QUESTION'S ANSWERS
 */
public class Answers {

    // COMMENTED CODE - left here in case needed later.
    // ANSWER CLASSES separated.
//    Answers_API_Overview api = new Answers_API_Overview();
//    Answers_JavaOOP_Overview javaOOP = new Answers_JavaOOP_Overview();
//    Answers_Selenium_Overview selenium = new Answers_Selenium_Overview();
//    Answers_Selenium_WebDriverCode seleniumWebDriverCode = new Answers_Selenium_WebDriverCode();
//    Answers_Selenium_WebDriverMethods seleniumWebDriverMethods = new Answers_Selenium_WebDriverMethods();
//    Answers_Selenium_WebDriverSubMethods_Manage seleniumWebDriverSubMethodsManage = new Answers_Selenium_WebDriverSubMethods_Manage();
//    Answers_Selenium_WebDriverSubMethods_Navigate seleniumWebDriverSubMethodsNavigate = new Answers_Selenium_WebDriverSubMethods_Navigate();
//    Answers_Selenium_WebDriverSubMethods_SwitchTo seleniumWebDriverSubMethodsSwitchTo = new Answers_Selenium_WebDriverSubMethods_SwitchTo();
//    Answers_Selenium_WebDriverWaits seleniumWebDriverWaits = new Answers_Selenium_WebDriverWaits();
//    Answers_Selenium_WebElementMethods seleniumWebElementMethods = new Answers_Selenium_WebElementMethods();
//    Answers_TestNG_Overview testNGOverview = new Answers_TestNG_Overview();

    // ANSWER CLASSES - add new answer classes here
    iAnswers[] answerClasses = new iAnswers[]{
            new Answers_API_Overview(),
            new Answers_JavaOOP_Overview(),
            new Answers_Selenium_Overview(),
            new Answers_Selenium_WebDriverCode(),
            new Answers_Selenium_WebDriverMethods(),
            new Answers_Selenium_WebDriverSubMethods_Manage(),
            new Answers_Selenium_WebDriverSubMethods_Navigate(),
            new Answers_Selenium_WebDriverSubMethods_SwitchTo(),
            new Answers_Selenium_WebDriverWaits(),
            new Answers_Selenium_WebElementMethods(),
            new Answers_TestNG_Overview()
    };


    // FIELDS
    private static Map<String, Answer> answers = null;

    // METHODS
    public Map<String, Answer> getAnswers() {
        if (answers == null) answers = mapAnswers();
        return answers;
    }

    private Map<String, Answer> mapAnswers() {
        // SETUP
        Map<String, Answer> result = new HashMap<>();

        // INTERACT
        for (iAnswers answerClass : answerClasses) {
            for (Answer answer : answerClass.answers) {
                result.put(answer.getId(), answer);
            }
        }

        // RETURN
        return result;
    }

    public static int checkAnswers(XSSFRow headers, XSSFRow usersAnswers, int startingColumn) {
        // SETUP
        int questionCount = answers.size();

        // TRACKERS
        int score = 0;
        int questionNumber = 1;
        int answerIndex = 0;

        // CACHE
        Answer currCorrectAnswer;

        // loop column cells (each cell is an answer provided by the test taker)
        for (int colNum = startingColumn; colNum < questionCount + startingColumn; colNum++) {
            // SETUP
            String usersAnswer = usersAnswers.getCell(colNum) == null ? null : usersAnswers.getCell(colNum).toString();
            // null check
            if (usersAnswer == null) continue;
            String answerID = usersAnswer.substring(0, 6);
            System.out.println("answerID: " + answerID);
            currCorrectAnswer = answers.get(answerID);

            // PRINT
            Print.question(
                    questionNumber,
                    currCorrectAnswer == null ? headers.getCell(colNum).toString() : currCorrectAnswer.getQuestion(),
                    usersAnswer,
                    currCorrectAnswer.getDefinition());

            // CORRECT ANSWERS - SUB METHODS
            String[] subMethods = currCorrectAnswer.getSubMethods();
            boolean isCaseSensitive = currCorrectAnswer.isCaseSensitive();

            // TRACKERS
            questionNumber++;
            answerIndex++;

            // null check
            if (subMethods == null) continue;
            usersAnswer = isCaseSensitive ? usersAnswer : usersAnswer.toLowerCase();

            // CHECK ANSWERS
            for (String method : subMethods) {

                method = isCaseSensitive ? method : method.toLowerCase();

                if (usersAnswer.contains(method)) {
                    Print.methodFound(method);
                    score++;
                }
                else Print.methodNotFound(method);
            }
            System.out.println("Current Score: " + score);
        }

        // RETURN
        return score;
    }
}