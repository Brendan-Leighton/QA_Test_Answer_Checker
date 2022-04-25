package answers;

import helper.Answer;

/**
 * Answers & Questions for Selenium's WebElement's methods.
 * Define the method and list any sub-methods, unless the sub-method is a WebElement method.
 */
public class Answers_Selenium_WebElementMethods extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[] {
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
                        "Submits the form if the current element is a form, or if the current element is within a form. Selenium waits until the new page is loaded before continuing.")
        };
    }
}