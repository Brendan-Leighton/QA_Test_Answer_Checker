public class Answer {
    private final String id;
    private final String question;
    private final String definition;
    private final String[] subMethods;

    // CONSTRUCTORS
    // no ID's
    public Answer(String questionText, String correctDefinition, String[] correctSubMethods) {
        this.id = null;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = correctSubMethods;
    }
    public Answer(String questionText, String correctDefinition) {
        this.id = null;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = null;
    }
    // yes ID's
    public Answer(String id, String questionText, String correctDefinition, String[] correctSubMethods) {
        this.id = id;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = correctSubMethods;
    }
    public Answer(String id, String questionText, String correctDefinition) {
        this.id = id;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = null;
    }

    public String getId() { return id; }

    public String getQuestion() {
        return question;
    }

    public String getDefinition() {
        return definition;
    }

    public String[] getSubMethods() { return subMethods; }
}
