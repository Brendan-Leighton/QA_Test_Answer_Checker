package answers;
// CUSTOM HELPERS
import helper.Answer;

/**
 * Answers & Questions for Selenium's WebDriver.switchTo().
 * Define the method and list any sub-methods.
 */
public class Answers_Selenium_WebDriverSubMethods_Navigate extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[] {
                new Answer(
                        "NAM001",
                        "Define back() and list its sub-methods.",
                        "Move back 1 \"item\" in the browser's history."),

                new Answer(
                        "NAM002",
                        "Define forward() and list its sub-methods.",
                        "Move forward 1 \"item\" in the browsers history."),

                new Answer(
                        "NAM003",
                        "Define refresh() and list its sub-methods.",
                        "Refresh current page."),

                new Answer(
                        "NAM004",
                        "Define to(String) / to(Url) and list its sub-methods.",
                        "Loads a new page.")
        };
    }
}