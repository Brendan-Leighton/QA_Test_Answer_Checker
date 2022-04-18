import org.apache.poi.xssf.usermodel.XSSFRow;

/**
 * WEB DRIVER QUESTION'S ANSWERS
 */
public class Answers_WebDriverMethods {

    public static Answer[] getAnswers() {
        return new Answer[]{
                // WEB-DRIVERS BROAD / OVERVIEW
                new Answer(
                        "BOQ001",
                        "Is a WebDriver a Class or an Interface?",
                        "Interface"),

                new Answer(
                        "BOQ002",
                        "What are some WebDriver methods?",
                        null,
                        new String[]{"close()", "quit()", "manage()", "findElement()", "findElements()", "navigate()", "get()", "switchTo()", "getCurrentUrl()", "getWindowHandles()", "getWindowHandle()", "getPageSource()", "getTitle()"}),


                new Answer(
                        "BOQ003",
                        "What are some SHARED driver capabilities?",
                        null,
                        new String[]{
                                "browserName()", "browserVersion()", "pageLoadStrategy()", "platformName()", "acceptInsecureCerts()", "timeouts()", "unhandledPromptBehavior()", "setWindowRect()", "strictFileIntractability()", "proxy()"}),
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
                        }),

                //
                // TEST-NG PART 1 / 2
                //

                new Answer(
                        "TNG001",
                        "TNG001: List as many annotations as you can. Annotations look like... @This. Write all annotations starting with @ and no spaces.",
                        null,
                        new String[]{
                                "@Test",
                                "@DataProvider",
                                "@Factory",
                                "@Listeners",
                                "@Parameters",

                                "@BeforeSuite",
                                "@AfterSuite",

                                "@BeforeClass",
                                "@AfterClass",

                                "@BeforeTest",
                                "@AfterTest",

                                "@BeforeMethod",
                                "@AfterMethod",

                                "@BeforeGroup",
                                "@AfterGroup"
                        }),

                //
                // WEB-DRIVER'S METHODS DEFINED & THEIR SUB-METHODS
                //

                new Answer(
                        "WDM001",
                        "WDM001: Define: FindElement() and findElements(), and list sub-methods of a WebElement.",
                        "Find the 1st WebElement using the given locator. ## Find all elements on the page that match the given locator.",
                        new String[]{
                                "clear()", "getAttribute()", "findElements()", "click()", "getText()", "sendKeys()", "findElement()", "isDisplayed()", "getTagName()", "isSelected()", "getSize()", "getLocation()", "getCSSValue()", "getRect()", "isEnabled()", "submit()"}),
                new Answer(
                        "WDM002",
                        "Define: manage() and list its sub-methods.",
                        "Allows us to access the WebDrivers' options ",
                        new String[]{
                                "window()", "timeouts()"}),
                new Answer(
                        "WDM003",
                        "Define: navigate() and list its sub-methods.",
                        "Lets the WebDriver navigate to a given URL as well as giving it access to the Browsers history.",
                        new String[]{
                                "back()", "forward()", "refresh()", "to()"}),
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
                                "activeElement()", "alert()", "defaultContent()", "frame()", "parentFrame()", "window()"}),

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
                        "Get the title of the current page."),

                //
                // manage() Sub-Methods & Definition
                //

                new Answer(
                        "MAM001",
                        "Define: window() and list its sub-methods.",
                        "Allows managing the current window and size.",
                        new String[]{
                                "fullscreen()", "getPosition()", "getSize()", "maximize()", "setPosition()", "setSize()"}),

                new Answer(
                        "MAM002",
                        "Define: timeouts() and list its sub-methods.",
                        "Allows us to adjust the time between driver actions.",
                        new String[]{
                                "implicitlyWait()", "setScriptTimeout()", "pageLoadTimeout()"}),

                //
                // findElement() and findElements() Sub-Methods & Definition
                //

                new Answer(
                        "FEM001",
                        "Define: clear() and list its sub-methods.",
                        "Clear the \"value\" attribute from a text input."),

                new Answer(
                        "FEM002",
                        "Define: getAttribute() and list its sub-methods.",
                        "Gets the current value of the given attribute name, or null if attribute wasn't set."),

                new Answer(
                        "FEM004",
                        "Define: click() and list its sub-methods.",
                        "Click the WebElement."),

                new Answer(
                        "FEM005",
                        "Define: getText() and list its sub-methods.",
                        "Get the text of this element and its child elements. Doesn't work for elements hidden by CSS."),

                new Answer(
                        "FEM006",
                        "Define: sendKeys() and list its sub-methods.",
                        "Simulates typing into an element. All keys on a keyboard are being considered as \"typing\"."),

                new Answer(
                        "FEM008",
                        "Define: isDisplayed() and list its sub-methods.",
                        "Tells if an element is displayed."),

                new Answer(
                        "FEM009",
                        "Define: getTagName() and list its sub-methods.",
                        "Define: Get the HTML elements' name. ie input, main, div."),

                new Answer(
                        "FEM010",
                        "Define: isSelected() and list its sub-methods.",
                        "Tells if the WebElement is selected/checked. Checkboxes, selects in an option, and radio buttons.\n"),

                new Answer(
                        "FEM011",
                        "Define: getSize() and list its sub-methods.",
                        "Gets the width and height of the element."),

                new Answer(
                        "FEM012",
                        "Define: getLocation() and list its sub-methods.",
                        "Gets the position of the top-left corner of the element."),

                new Answer(
                        "FEM013",
                        "Define: getCssValue() and list its sub-methods.",
                        "Get the value of the given CSS property."),

                new Answer(
                        "FEM014",
                        "Define: getRect() and list its sub-methods.",
                        "Gets the location and size of the element. Equivalent to getSize() and getLocation()."),

                new Answer(
                        "FEM003",
                        "Define: isEnabled() and list its sub-methods.",
                        "Returns false for disabled input elements, true otherwise."),

                new Answer(
                        "FEM007",
                        "Define: submit() and list its sub-methods.",
                        "Submits the form if the current element is a form, or if the current element is within a form. Selenium waits until the new page is loaded before continuing."),

                //
                // driver.navigate() Sub-methods & Definition
                //

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
                        "Loads a new page."),

                //
                // driver.switchTo() Sub-methods & Definition
                //

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
                        "Focuses the driver on the window with the given handle."),

                //
                // WebDriver Code
                //

                new Answer(
                        "WDC001",
                        "WDC001: Write the code to create a web driver. Call the driver \"driver\" and use Chrome's web driver. Don't add options. Don't add imports. Just write as a single line of code.",
                        "WebDriver driver = new ChromeDriver();"),

                new Answer(
                        "WDC002",
                        "WDC002: Using the \"driver\" you created in the last question, how can you navigate to \"www.google.com\"? For simplicity, don't save the URL in a variable, just pass it to the method as-is. There are 2 methods that can get this done, try to write both.",
                        null,
                        new String[]{
                                "driver.navigate().to(\"www.google.com\");",
                                "driver.get(\"www.google.com\");"
                        }),

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
                        }),

                new Answer(
                        "WDC004",
                        "WDC004:  If a page is taking a long time to load and is causing your test(s) to fail, what could you use to make your test not execute until the page loads?",
                        null,
                        new String[] {
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
                        }),

                //
                // Selenium Waits
                //

                new Answer(
                        "SEW001",
                        "SEW001: Which wait is Static?",
                        "Answer:\n" +
                                "1. Thread.sleep()\n" +
                                "\n" +
                                "or\n" +
                                "\n" +
                                "2. Thread.sleep(10)\n" +
                                "The \"10\" can be any number given.",
                        new String[] {"Thread.sleep()"}),

                new Answer(
                        "SEW002",
                        "SEW002: Which wait is Dynamic?",
                        null,
                        new String[] {
                                "Implicit wait",
                                "Explicit wait",
                                "Fluent wait"
                        }),

                new Answer(
                        "SEW003",
                        "SEW003: What is the difference between Explicit wait and Implicit wait?",
                        "Answer: The difference is\n" +
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
                        "Answer:\n" +
                                "1. Implicit wait for certain amount of time, before throwing an exception.\n" +
                                "2. While Explicit wait do not until a certain conditions."),

                new Answer(
                        "SEW005",
                        "SEW005: What is Fluent wait?",
                        "Answer:\n" +
                                "Looks for a web element repeatedly at regular intervals until timeout happens or until the object is found."),

                new Answer(
                        "SEW006",
                        "SEW006: What is the difference between Fluent wait and Explicit wait?",
                        "Answer:\n" +
                                "1. Fluent wait - same as explicit wait, BUT using\n" +
                                ".pollingEvery(timeout, SECONDS) --> the frequency of time on which it will check that particular element\n" +
                                ".ignoring(Exception.class) --> ignore test class ."),

                //
                // Java & OOP
                //

                new Answer(
                        "JAV001",
                        "JAV001: What are the four pillars of Object Oriented Programming?",
                        null,
                        new String[] {
                                "Abstraction",
                                "Polymorphism",
                                "Inheritance",
                                "Encapsulation"
                        }),

                new Answer(
                        "JAV002",
                        "JAV002: What is Overloading?",
                        "When a class has 2 or more methods with the same name but different parameters."),

                new Answer(
                        "JAV003",
                        "JAV003: What is Overriding?",
                        "When a class changes the definition of a method given to it by it's parent class. Bonus point: uses @Override."),

                new Answer(
                        "JAV004",
                        "JAV004: Is the substring() method inclusive or exclusive?",
                        null,
                        new String[] {
                                "Inclusive"
                        }),

                new Answer(
                        "JAV005",
                        "JAV005: What is Inheritance?",
                        "The process where one class acquires the methods and fields of another.\n" +
                                "\n" +
                                "Examples:\n" +
                                "- People and their children. Children inherit biological traits from their parents.\n" +
                                "- People and Humans. All people share similarities as if they inherited from the Human class."),

                new Answer(
                        "JAV006",
                        "JAV006: What is the Super keyword used for?",
                        "Answers:\n" +
                                "- Invoke the constructor of the parent class.\n" +
                                "- To differentiate the members of superclass from the members of subclass, if they have same names.\n" +
                                "\n" +
                                "Super:\n" +
                                "Say we have a class called ParentClass with a variable called \"variable\" and a method called \"method\".\n" +
                                "\n" +
                                "class ParentClass {\n" +
                                "public String variable;\n" +
                                "public void method() {\n" +
                                "sout(\"fake method\");\n" +
                                "}\n" +
                                "}\n" +
                                "\n" +
                                "We can create a new class colled SubClass that extends ParentClass and give it a field and a method with the same name as the ParentClass but with different values and use both in the SubClass with the help of the \"super\" keyword. Like so...\n" +
                                "\n" +
                                "class SubClass extends ParentClass {\n" +
                                "private int variable;\n" +
                                "public void method() {\n" +
                                "super.variable;\n" +
                                "super.method();\n" +
                                "sout(\"fake method 2\");\n" +
                                "}\n" +
                                "}"),

                new Answer(
                        "JAV007",
                        "JAV007: What are the 2 keywords used to extend a class?",
                        "Answer: \"extends\" & \"implements\"\n" +
                                "\n" +
                                "Extends:\n" +
                                "copies fields and methods from another class.\n" +
                                "\n" +
                                "Implements:\n" +
                                "copies empty fields and empty methods from an Interface.",
                        new String[] {
                                "extends",
                                "implements"
                        }),

                new Answer(
                        "JAV008",
                        "JAV008: What is Polymorphism?",
                        "Answer:Performing a single task in different ways.\n" +
                                "\n" +
                                "Classes and methods can be made to act in more than 1 way.\n" +
                                "We accomplish this through method overloading and overriding.\n" +
                                "\n" +
                                "Example:\n" +
                                "It's when you change a cucumber to a pickle. "),

                new Answer(
                        "JAV009",
                        "JAV009: How can one achieve polymorphism?",
                        "Answer:\n" +
                                "- Method overloading\n" +
                                "- method overriding",
                        new String[] {
                                "overloading",
                                "overriding"
                        }),

                new Answer(
                        "JAV010",
                        "JAV010: What is Abstraction?",
                        "Answer: Removing code and referencing it instead.\n" +
                                "\n" +
                                "Remove logic from some code and put it into it's own class/method and then reference that class/method instead."),

                new Answer(
                        "JAV011",
                        "JAV011: Why use Abstraction?",
                        "Answer: To hide complexity that muddies up the code.\n" +
                                "\n" +
                                "Example:\n" +
                                "turn this...\n" +
                                "\n" +
                                "WebDriverWait wait = new WebDriverWait(WebDriver, 5);\n" +
                                "wait.until(ExpectedConditions.elementToBeClickable(element));\n" +
                                "element.click();\n" +
                                "\n" +
                                "into this...\n" +
                                "\n" +
                                "Waits.forElementAndClick(element);\n" +
                                "\n" +
                                "by doing this...\n" +
                                "\n" +
                                "class Waits {\n" +
                                "public void forElementAndClick(WebElement element) {\n" +
                                "WebDriverWait wait = new WebDriverWait(WebDriver, 5);\n" +
                                "wait.until(ExpectedConditions.elementToBeClickable(element));\n" +
                                "element.click();\n" +
                                "}\n" +
                                "}"),

                new Answer(
                        "JAV012",
                        "JAV012: How to implement Abstraction?",
                        "Answer:\n" +
                                "- Abstract classes\n" +
                                "- interfaces",
                        new String[] {
                                "Abstract",
                                "interfaces"}),

                new Answer(
                        "JAV013",
                        "JAV013: What is Encapsulation?",
                        "Answer: Storing related fields and methods together."),

                new Answer(
                        "JAV014",
                        "JAV014: Why use Encapsulation?",
                        "",
                        new String[] {
                                "Abstraction",
                                "Polymorphism",
                                "Inheritance",
                                "Encapsulation"
                        }),

                new Answer(
                        "JAV015",
                        "JAV015: How to implement Encapsulation?",
                        "Answer:\n" +
                                "- private accessor\n" +
                                "- getters/setters\n" +
                                "\n" +
                                "Explain: The private accessor ensures the getters and setters are used.",
                        new String[] {
                                "private",
                                "getters",
                                "setters"}),

                //
                // API
                //

                new Answer(
                        "",
                        "API001: What is the meaning of the status codes in the 100's?",
                        "Answer: Informational",
                        new String[] {
                                "Informational"
                        }),

                new Answer(
                        "",
                        "API002: What is the meaning of the status codes in the 200's?",
                        "Answer: Success",
                        new String[] {
                                "Success"
                        }),

                new Answer(
                        "",
                        "API003: What is the meaning of the status codes in the 300's?",
                        "Answer: Redirect",
                        new String[] {
                                "Redirect"
                        }),

                new Answer(
                        "",
                        "API004: What is the meaning of the status codes in the 400's?",
                        "Answer: Client Error",
                        new String[] {
                                "Client"
                        }),

                new Answer(
                        "",
                        "API005: What is the meaning of the status codes in the 500's?",
                        "Answer: Server Error",
                        new String[] {
                                "Server"
                        }),

                new Answer(
                        "",
                        "API006: What goes in the header of a RESTful API request?",
                        "Answers:\n" +
                                "- Authorization: Carries credentials containing the authentication information of the client for the resource being requested.\n" +
                                "\n" +
                                "- WWW-Authenticate: This is sent by the server if it needs a form of authentication before it can respond with the actual resource being requested. Often sent along with a response code of 401, which means ‘unauthorized’.\n" +
                                "\n" +
                                "- Accept-Charset: This is a header which is set with the request and tells the server about which character sets are acceptable by the client.\n" +
                                "\n" +
                                "- Content-Type: Indicates the media type (text/html or text/JSON) of the response sent to the client by the server, this will help the client in processing the response body correctly.\n" +
                                "\n" +
                                "- Cache-Control: This is the cache policy defined by the server for this response, a cached response can be stored by the client and re-used till the time defined by the Cache-Control header.",
                        new String[] {
                                "Authorization",
                                "WWW-Authenticate",
                                "WWW Authenticate",
                                "Authenticate",
                                "Accept-Charset",
                                "Accept Charset",
                                "Content-Type",
                                "Content Type",
                                "Cache-Control",
                                "Cache Control"
                        }),
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
