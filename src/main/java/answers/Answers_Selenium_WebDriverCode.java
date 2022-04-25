package answers;
// CUSTOM HELPER
import helper.Answer;

/**
 * Answers & Questions for Selenium's WebDriver.
 * Test syntax knowledge by writing code.
 */
public class Answers_Selenium_WebDriverCode extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[] {
                new Answer(
                        "WDC001",
                        "WDC001: Write the code to create a web driver. Call the driver \"driver\" and use Chrome's web driver. Don't add options. Don't add imports. Just write as a single line of code.",
                        "WebDriver driver = new ChromeDriver();",
                        new String[]{"WebDriver driver = new ChromeDriver();"}),

                new Answer(
                        "WDC002",
                        "WDC002: Using the \"driver\" you created in the last question, how can you navigate to \"www.google.com\"? For simplicity, don't save the URL in a variable, just pass it to the method as-is. There are 2 methods that can get this done, try to write both.",
                        null,
                        new String[]{
                                "driver.navigate().to(\"www.google.com\");",
                                "driver.get(\"www.google.com\");"},
                        true),

                new Answer(
                        "WDC003",
                        "WDC003: Lets say you have a String that came from the text of a web-element and you want to verify it, how would you write that code? Constraints: you have 2 variables that don't need to be initialized (\"actualText\" and \"expectedText\"). These are variable names so they don't have the quotes around them. What line of code could you write to verify these Strings are equal?",
                        null,
                        new String[]{
                                "Assert.assertEquals(actualText, expectedText);",
                                "Assert.assertEquals(expectedText, actualText);",
                                "Assert.assertTrue(actualText.equals(expectedText));",
                                "Assert.assertTrue(expectedText.equals(actualText));",
                                "Assert.assertSame(actualText.equals(expectedText));",
                                "Assert.assertSame(expectedText.equals(actualText));"
                        },
                        true),

                new Answer(
                        "WDC004",
                        "WDC004:  If a page is taking a long time to load and is causing your test(s) to fail, what could you use to make your test not execute until the page loads?",
                        null,
                        new String[]{
                                "implicitwait",
                                "explicitwait",
                                "implicit-wait",
                                "explicit-wait",
                                "implicit wait",
                                "explicit wait",

                                "WebDriverWait",
                                "web driver wait",
                                "WebDriver wait",
                                "web-driver-wait",
                                "web-driver wait"
                        })
        };
    }
}