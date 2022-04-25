package answers;
// CUSTOM HELPERS
import helper.Answer;

/**
 * Broad / Overview Selenium Questions
 */
public class Answers_Selenium_Overview extends iAnswers {

    // CONSTRUCTOR : only 1
    public Answers_Selenium_Overview() {
        super(); // calls SetAnswers
    }

    // QUESTIONS & ANSWERS
    @Override
    public void SetAnswers() {
        answers = new Answer[] {
                new Answer(
                        "BOQ001",
                        "Is a WebDriver a Class or an Interface?",
                        "Interface",
                        new String[] {"Interface"}),

                new Answer(
                        "BOQ002",
                        "What are some WebDriver methods?",
                        null,
                        new String[]{"close()", "quit()", "manage()", "findElement()", "findElements()", "navigate()", "get()", "switchTo()", "getCurrentUrl()", "getWindowHandles()", "getWindowHandle()", "getPageSource()", "getTitle()"},
                        true),


                new Answer(
                        "BOQ003",
                        "What are some SHARED driver capabilities?",
                        null,
                        new String[]{
                                "browserName()", "browserVersion()", "pageLoadStrategy()", "platformName()", "acceptInsecureCerts()", "timeouts()", "unhandledPromptBehavior()", "setWindowRect()", "strictFileIntractability()", "proxy()"},
                        true),
                new Answer(
                        "BOQ004",
                        "What locator strategies are you aware of?",
                        null,
                        new String[]{
                                "xpath", "x-path", "x path",
                                "cssSelector", "css-selector", "css selector",
                                "id",
                                "name",
                                "tag name", "tag-name", "tagName",
                                "link text", "link-text", "linkText",
                                "partial link text", "partial-link-text", "partialLinkText", "partial-link text", "partial link-text"
                        })
        };
    }
}