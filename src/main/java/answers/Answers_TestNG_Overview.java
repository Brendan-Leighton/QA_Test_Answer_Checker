package answers;

import helper.Answer;

public class Answers_TestNG_Overview extends iAnswers {
    @Override
    public void SetAnswers() {
        answers = new Answer[]{
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
                        },
                        true)
        };
    }
}