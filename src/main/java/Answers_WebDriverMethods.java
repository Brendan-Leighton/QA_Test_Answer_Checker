import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 * WEB DRIVER QUESTION'S ANSWERS
 */
public class Answers_WebDriverMethods {

    public static Answer[] getAnswers() {
        return new Answer[]{
                // WEB-DRIVERS BROAD / OVERVIEW
                new Answer(
                        "Is a WebDriver a Class or an Interface?",
                        "Interface"),

                new Answer(
                        "What are some WebDriver methods?",
                        null,
                        new String[]{"close()", "quit()", "manage()", "findElement()", "findElements()", "navigate()", "get()", "switchTo()", "getCurrentUrl()", "getWindowHandles()", "getWindowHandle()", "getPageSource()", "getTitle()"}),


                new Answer(
                        "What are some SHARED driver capabilities?",
                        null,
                        new String[]{
                                "browserName()", "browserVersion()", "pageLoadStrategy()", "platformName()", "acceptInsecureCerts()", "timeouts()", "unhandledPromptBehavior()", "setWindowRect()", "strictFileIntractability()", "proxy()"}),

                //
                // WEB-DRIVER'S METHODS DEFINED & THEIR SUB-METHODS
                //

                new Answer(
                        "Define: FindElement() and list its sub-methods.",
                        "Find the 1st WebElement using the given locator.",
                        new String[]{
                                "clear()", "getAttribute()", "findElements()", "click()", "getText()", "sendKeys()", "findElement()", "isDisplayed()", "getTagName()", "isSelected()", "getSize()", "getLocation()", "getCSSValue()", "getRect()", "isEnabled()", "submit()"}),
                new Answer(
                        "Define: manage() and list its sub-methods.",
                        "Allows us to access the WebDrivers' options ",
                        new String[]{
                                "window()", "timeouts()"}),
                new Answer(
                        "Define: findElements() and list its sub-methods.",
                        "Find all elements on the page that match the given locator.",
                        new String[]{
                                "clear()", "getAttribute()", "findElements()", "click()", "getText()", "sendKeys()", "findElement()", "isDisplayed()", "getTagName()", "isSelected()", "getSize()", "getLocation()", "getCSSValue()", "getRect()", "isEnabled()", "submit()"}),
                new Answer(
                        "Define: navigate() and list its sub-methods.",
                        "Lets the WebDriver navigate to a given URL as well as giving it access to the Browsers history.",
                        new String[]{
                                "back()", "forward()", "refresh()", "to()"}),
                new Answer(
                        "Define: get() and list its sub-methods.",
                        "Open a page by it's URL, Selenium waits for the page to load before executing another command."),
                new Answer(
                        "Define: quit() and list its sub-methods.",
                        "Closes the browser and all it's windows."),

                new Answer(
                        "Define: switchTo() and list its sub-methods.",
                        "Moves the WebDrivers focus to a different Frame or Window.",
                        new String[]{
                                "activeElement()", "alert()", "defaultContent()", "frame()", "parentFrame()", "window()"}),

                new Answer(
                        "Define: getCurrentUrl() and list its sub-methods.",
                        "Get the URL of the page that's currently being viewed by the browser."),

                new Answer(
                        "Define: close() and list its sub-methods.",
                        "Closes current window, or quits the browser if the current window is the last window."),

                new Answer(
                        "Define: getWindowHandles() and list its sub-methods.",
                        "Gives a set of window handles (like IDs) that correspond to each window that's open in the browser."),

                new Answer(
                        "Define: getWindowHandle() and list its sub-methods.",
                        "Gets the ID of the current window."),

                new Answer(
                        "Define: getPageSource() and list its sub-methods.",
                        "Gets the HTML of the page."),

                new Answer(
                        "Define: getTitle() and list its sub-methods.",
                        "Get the title of the current page."),

                //
                // manage() Sub-Methods & Definition
                //

                new Answer(
                        "Define: window() and list its sub-methods.",
                        "Allows managing the current window and size.",
                        new String[]{
                                "fullscreen()", "getPosition()", "getSize()", "maximize()", "setPosition()", "setSize()"}),

                new Answer(
                        "Define: timeouts() and list its sub-methods.",
                        "Allows us to adjust the time between driver actions.",
                        new String[]{
                                "implicitlyWait()", "setScriptTimeout()", "pageLoadTimeout()"}),

                //
                // findElement() and findElements() Sub-Methods & Definition
                //

                new Answer(
                        "Define: clear() and list its sub-methods.",
                        "Clear the \"value\" attribute from a text input."),

                new Answer(
                        "Define: getAttribute() and list its sub-methods.",
                        "Gets the current value of the given attribute name, or null if attribute wasn't set."),

                new Answer(
                        "Define: findElements(). No need to list the sub-methods as they're already listed in this section.",
                        "Find all elements on the page that match the given locator."),

                new Answer(
                        "Define: click() and list its sub-methods.",
                        "Click the WebElement."),

                new Answer(
                        "Define: getText() and list its sub-methods.",
                        "Get the text of this element and its child elements. Doesn't work for elements hidden by CSS."),

                new Answer(
                        "Define: sendKeys() and list its sub-methods.",
                        "Simulates typing into an element. All keys on a keyboard are being considered as \"typing\"."),

                new Answer(
                        "Define: findElement(). No need to list the sub-methods as they're already listed in this section.",
                        "Find 1st WebElement using the given locator."),

                new Answer(
                        "Define: isDisplayed() and list its sub-methods.",
                        "Tells if an element is displayed."),

                new Answer(
                        "Define: getTagName() and list its sub-methods.",
                        "Define: Get the HTML elements' name. ie input, main, div."),

                new Answer(
                        "Define: isSelected() and list its sub-methods.",
                        "Tells if the WebElement is selected/checked. Checkboxes, selects in an option, and radio buttons.\n"),

                new Answer(
                        "Define: isSelected() and list its sub-methods.",
                        "Tells if the WebElement is selected/checked. works on checkbox-elements, select-tags in an option-tag, and radio-button-elements.\n"),

                new Answer(
                        "Define: getSize() and list its sub-methods.",
                        "Gets the width and height of the element."),

                new Answer(
                        "Define: getLocation() and list its sub-methods.",
                        "Gets the position of the top-left corner of the element."),

                new Answer(
                        "Define: getCssValue() and list its sub-methods.",
                        "Get the value of the given CSS property."),

                new Answer(
                        "Define: getRect() and list its sub-methods.",
                        "Gets the location and size of the element. Equivalent to getSize() and getLocation()."),

                new Answer(
                        "Define: isEnabled() and list its sub-methods.",
                        "Returns false for disabled input elements, true otherwise."),

                new Answer(
                        "Define: submit() and list its sub-methods.",
                        "Submits the form if the current element is a form, or if the current element is within a form. Selenium waits until the new page is loaded before continuing."),

                //
                // driver.navigate() Sub-methods & Definition
                //

                new Answer(
                        "Define back() and list its sub-methods.",
                        "Move back 1 \"item\" in the browser's history."),

                new Answer(
                        "Define forward() and list its sub-methods.",
                        "Move forward 1 \"item\" in the browsers history."),

                new Answer(
                        "Define refresh() and list its sub-methods.",
                        "Refresh current page."),

                new Answer(
                        "Define to(String) / to(Url) and list its sub-methods.",
                        "Loads a new page."),

                //
                // driver.switchTo() Sub-methods & Definition
                //

                new Answer(
                        "Define activeElement() and list its sub-methods.",
                        "Gets the element that has focus. If no elements are being focused on then returns the <body>."),

                new Answer(
                        "Define alert() and list its sub-methods.",
                        "Switches to currently active alert modal."),

                new Answer(
                        "Define defaultContent() and list its sub-methods.",
                        "Moves the driver focus to the main document."),

                new Answer(
                        "Define frame() and list its sub-methods.",
                        "Frame(int index) = Select a frame by it's index. Zero-based.\n" +
                                "Frame(String nameOfId) = Select a frame by it's name or ID.\n" +
                                "Frame(WebElement frame) = Select a frame by its iframe element."),

                new Answer( // 44 =
                        "Define window() and list its sub-methods.",
                        "Focuses the driver on the window with the given handle."),
        };
    }

    public static int checkAnswers(XSSFRow spreadSheetRow, int startingColumn) {
        // SETUP
        Answer[] answers = getAnswers();
        int questionCount = answers.length;

        // TRACKERS
        int score = 0;
        int questionNumber = 1;
        int answerIndex = 0;

        // loop column cells
        for (int colNum = startingColumn; colNum < questionCount + startingColumn; colNum++) {
            // SETUP
            String usersAnswer = spreadSheetRow.getCell(colNum) == null ? null : spreadSheetRow.getCell(colNum).toString();

            // PRINT
            System.out.println(
                            "\n" +
                            "***" +
                            "\n\n" +
                            "Question " + questionNumber + ":\n" +
                            "\n" +
                            answers[answerIndex].getQuestion() + "\n" +
                            "User's Answer:\n" +
                            "\n" +
                            usersAnswer
            );

            // CORRECT ANSWERS - SUB METHODS
            String[] subMethods = answers[answerIndex].getSubMethods();

            // TRACKERS
            questionNumber++;
            answerIndex++;

            // SKIP IF null
            if (subMethods == null || usersAnswer == null) continue;

            // CHECK ANSWERS
            for (String method : subMethods) {
                System.out.print("looking for: " + method);
                if (usersAnswer.contains(method)) {
                    System.out.print(" * found");
                    score++;
                }
                System.out.print("\n");                 // make a line break after the previous 2 prints
            }
            System.out.println("Current Score: " + score);
        }

        System.out.println("WebDriver method score: " + score);

        // RETURN
        return score;
    }
}
