package answers;
// CUSTOM HELPERS
import helper.Answer;

/**
 * Answers & Questions for Java & OOP Concepts.
 */
public class Answers_JavaOOP_Overview extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[]{
                new Answer(
                        "JAV001",
                        "JAV001: What are the four pillars of Object Oriented Programming?",
                        null,
                        new String[]{
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
                        new String[]{
                                "Exclusive"
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
                        "helper.Answer: \"extends\" & \"implements\"\n" +
                                "\n" +
                                "Extends:\n" +
                                "copies fields and methods from another class.\n" +
                                "\n" +
                                "Implements:\n" +
                                "copies empty fields and empty methods from an Interface.",
                        new String[]{
                                "extends",
                                "implements"
                        }),

                new Answer(
                        "JAV008",
                        "JAV008: What is Polymorphism?",
                        "helper.Answer:Performing a single task in different ways.\n" +
                                "\n" +
                                "Classes and methods can be made to act in more than 1 way.\n" +
                                "We accomplish this through method overloading and overriding.\n" +
                                "\n" +
                                "Example:\n" +
                                "It's when you change a cucumber to a pickle. "),

                new Answer(
                        "JAV009",
                        "JAV009: How can one achieve polymorphism?",
                        "helper.Answer:\n" +
                                "- Method overloading\n" +
                                "- method overriding",
                        new String[]{
                                "overloading",
                                "overriding"
                        }),

                new Answer(
                        "JAV010",
                        "JAV010: What is Abstraction?",
                        "helper.Answer: Removing code and referencing it instead.\n" +
                                "\n" +
                                "Remove logic from some code and put it into it's own class/method and then reference that class/method instead."),

                new Answer(
                        "JAV011",
                        "JAV011: Why use Abstraction?",
                        "helper.Answer: To hide complexity that muddies up the code.\n" +
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
                        "helper.Answer:\n" +
                                "- Abstract classes\n" +
                                "- interfaces",
                        new String[]{
                                "abstract",
                                "Abstract class",
                                "interfaces"}),

                new Answer(
                        "JAV013",
                        "JAV013: What is Encapsulation?",
                        "helper.Answer: Storing related fields and methods together."),

                new Answer(
                        "JAV014",
                        "JAV014: Why use Encapsulation?",
                        ""),

                new Answer(
                        "JAV015",
                        "JAV015: How to implement Encapsulation?",
                        "helper.Answer:\n" +
                                "- private accessor\n" +
                                "- getters/setters\n" +
                                "\n" +
                                "Explain: The private accessor ensures the getters and setters are used.",
                        new String[]{
                                "private",
                                "getters",
                                "setters"})
        };
    }
}