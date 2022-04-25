package answers;

import helper.Answer;

/**
 * Questions & Answers for Selenium's WebDriver.
 * Define what the method does and list its sub-methods.
 */
public class Answers_Selenium_WebDriverMethods extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[] {
                new Answer(
                        "WDM001",
                        "WDM001: Define: FindElement() and findElements(), and list sub-methods of a WebElement.",
                        "Find the 1st WebElement using the given locator. ## Find all elements on the page that match the given locator.",
                        new String[]{
                                "clear()", "getAttribute()", "findElements()", "click()", "getText()", "sendKeys()", "findElement()", "isDisplayed()", "getTagName()", "isSelected()", "getSize()", "getLocation()", "getCSSValue()", "getRect()", "isEnabled()", "submit()"},
                        true),
                new Answer(
                        "WDM002",
                        "Define: manage() and list its sub-methods.",
                        "Allows us to access the WebDrivers' options ",
                        new String[]{
                                "window()", "timeouts()"},
                        true),
                new Answer(
                        "WDM003",
                        "Define: navigate() and list its sub-methods.",
                        "Lets the WebDriver navigate to a given URL as well as giving it access to the Browsers history.",
                        new String[]{
                                "back()", "forward()", "refresh()", "to()"},
                        true),
                new Answer(
                        "WDM004",
                        "Define: get() and list its sub-methods.",
                        "Open a page by it's URL, Selenium waits for the page to load before executing another command."),
                new Answer(
                        "WDM005",
                        "Define: quit() and list its sub-methods.",
                        "Closes the browser and all it's windows."),

                new Answer(
                        "WDM006",
                        "Define: switchTo() and list its sub-methods.",
                        "Moves the WebDrivers focus to a different Frame or Window.",
                        new String[]{
                                "activeElement()", "alert()", "defaultContent()", "frame()", "parentFrame()", "window()"},
                        true),

                new Answer(
                        "WDM007",
                        "Define: getCurrentUrl() and list its sub-methods.",
                        "Get the URL of the page that's currently being viewed by the browser."),

                new Answer(
                        "WDM008",
                        "Define: close() and list its sub-methods.",
                        "Closes current window, or quits the browser if the current window is the last window."),

                new Answer(
                        "WDM009",
                        "Define: getWindowHandles() and list its sub-methods.",
                        "Gives a set of window handles (like IDs) that correspond to each window that's open in the browser."),

                new Answer(
                        "WDM010",
                        "Define: getWindowHandle() and list its sub-methods.",
                        "Gets the ID of the current window."),

                new Answer(
                        "WDM011",
                        "Define: getPageSource() and list its sub-methods.",
                        "Gets the HTML of the page."),

                new Answer(
                        "WDM012",
                        "Define: getTitle() and list its sub-methods.",
                        "Get the title of the current page.")
        };
    }
}