package answers;

import helper.Answer;

public abstract class iAnswers {

    Answer[] answers;


    public iAnswers() {
        this.SetAnswers();
    }

    /**
     * Sets the "Answer[] answer" variable.
     * <hr />
     * The method should be laid out as such...
     * <br />
     * {
     * <br />
     * answers = new Answer[] { //Answer/s here }
     * <br />
     * }
     */
    public abstract void SetAnswers();
}