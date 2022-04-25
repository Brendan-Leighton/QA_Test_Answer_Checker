package answers;

import helper.Answer;

/**
 * Answers & Questions for Selenium's WebDriver.manage().
 * Define the method and list any sub-methods.
 */
public class Answers_Selenium_WebDriverSubMethods_Manage extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[]{
                new Answer(
                        "MAM001",
                        "Define: window() and list its sub-methods.",
                        "Allows managing the current window and size.",
                        new String[]{
                                "fullscreen()", "getPosition()", "getSize()", "maximize()", "setPosition()", "setSize()"},
                        true),

                new Answer(
                        "MAM002",
                        "Define: timeouts() and list its sub-methods.",
                        "Allows us to adjust the time between driver actions.",
                        new String[]{
                                "implicitlyWait()", "setScriptTimeout()", "pageLoadTimeout()"},
                        true)
        };
    }
}