package answers;
// CUSTOM HELPERS
import helper.Answer;

/**
 * Answers & Questions for Selenium's WebDriverWaits.
 */
public class Answers_Selenium_WebDriverWaits extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[]{
                new Answer(
                        "SEW001",
                        "SEW001: Which wait is Static?",
                        "helper.Answer:\n" +
                                "1. Thread.sleep()\n" +
                                "\n" +
                                "or\n" +
                                "\n" +
                                "2. Thread.sleep(10)\n" +
                                "The \"10\" can be any number given.",
                        new String[]{"Thread.sleep()"},
                        true),

                new Answer(
                        "SEW002",
                        "SEW002: Which wait is Dynamic?",
                        null,
                        new String[]{
                                "Implicit",
                                "Explicit",
                                "Fluent"
                        }),

                new Answer(
                        "SEW003",
                        "SEW003: What is the difference between Explicit wait and Implicit wait?",
                        "The difference is\n" +
                                "- the maximum time the wait will occur (implicit is a set time while explicit could be the set time or possibly shorter if a condition is met)\n" +
                                "- Number of occurrences. Implicit wait last for the entire program while explicit wait only runs once.\n" +
                                "\n" +
                                "Implicit Wait:\n" +
                                "Stops the program execution until the specified time runs out. Is set before tests run and lasts for the life of the program, waiting between each action.\n" +
                                "\n" +
                                "Explicit Wait:\n" +
                                "Stops the program execution until a condition resolves (element becomes clickable) or the specified time runs out. Only runs once when it is called."),

                new Answer(
                        "SEW004",
                        "SEW004: Why should you use Implicit wait when there is Explicit wait?",
                        "helper.Answer:\n" +
                                "1. Implicit wait for certain amount of time, before throwing an exception.\n" +
                                "2. While Explicit wait do not until a certain conditions."),

                new Answer(
                        "SEW005",
                        "SEW005: What is Fluent wait?",
                        "helper.Answer:\n" +
                                "Looks for a web element repeatedly at regular intervals until timeout happens or until the object is found."),

                new Answer(
                        "SEW006",
                        "SEW006: What is the difference between Fluent wait and Explicit wait?",
                        "helper.Answer:\n" +
                                "1. Fluent wait - same as explicit wait, BUT using\n" +
                                ".pollingEvery(timeout, SECONDS) --> the frequency of time on which it will check that particular element\n" +
                                ".ignoring(Exception.class) --> ignore test class .")
        };
    }
}