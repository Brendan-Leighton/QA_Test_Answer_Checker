package answers;
// CUSTOM HELPERS
import helper.Answer;

/**
 * Answers & Questions for Selenium's WebDriver.switchTo().
 * Define the method and list any sub-methods.
 */
public class Answers_Selenium_WebDriverSubMethods_SwitchTo extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[] {
                new Answer(
                        "STM001",
                        "Define activeElement() and list its sub-methods.",
                        "Gets the element that has focus. If no elements are being focused on then returns the <body>."),

                new Answer(
                        "STM002",
                        "Define alert() and list its sub-methods.",
                        "Switches to currently active alert modal."),

                new Answer(
                        "STM003",
                        "Define defaultContent() and list its sub-methods.",
                        "Moves the driver focus to the main document."),

                new Answer(
                        "STM004",
                        "Define frame() and list its sub-methods.",
                        "Frame(int index) = Select a frame by it's index. Zero-based.\n" +
                                "Frame(String nameOfId) = Select a frame by it's name or ID.\n" +
                                "Frame(WebElement frame) = Select a frame by its iframe element."),

                new Answer( // 44 =
                        "STM005",
                        "Define window() and list its sub-methods.",
                        "Focuses the driver on the window with the given handle.")
        };
    }
}