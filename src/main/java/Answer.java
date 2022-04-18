public class Answer {
    private final String id;
    private final String question;
    private final String definition;
    private final String[] subMethods;
    private final boolean isCaseSensitive;

    // CONSTRUCTORS
    // yes ID's
    public Answer(String id, String questionText, String correctDefinition, String[] correctSubMethods) {
        this.id = id;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = correctSubMethods;
        this.isCaseSensitive = false;
    }
    public Answer(String id, String questionText, String correctDefinition) {
        this.id = id;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = null;
        this.isCaseSensitive = false;
    }
    // case sensitivity check
    public Answer(String id, String questionText, String correctDefinition, String[] correctSubMethods, boolean isCaseSensitive) {
        this.id = id;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = correctSubMethods;
        this.isCaseSensitive = isCaseSensitive;
    }
    public Answer(String id, String questionText, String correctDefinition, boolean isCaseSensitive) {
        this.id = id;
        this.question = questionText;
        this.definition = correctDefinition;
        this.subMethods = null;
        this.isCaseSensitive = isCaseSensitive;
    }

    public String getId() { return id; }

    public String getQuestion() {
        return question;
    }

    public String getDefinition() {
        return definition;
    }

    public String[] getSubMethods() { return subMethods; }

    public boolean isCaseSensitive() {
        return isCaseSensitive;
    }
}
