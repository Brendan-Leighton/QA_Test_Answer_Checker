public class Answer {
    private final String question;
    private final String definition;
    private final String[] subMethods;

    public Answer(String questionText, String correctDefinition, String[] correctSubMethods) {
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = correctSubMethods;
    }
    public Answer(String questionText, String correctDefinition) {
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = null;
    }

    public String getQuestion() {
        return question;
    }

    public String getDefinition() {
        return definition;
    }

    public String[] getSubMethods() {
        return subMethods;
    }
}
