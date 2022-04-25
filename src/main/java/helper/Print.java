package helper;

public class Print {

    // BACKGROUND COLORS - ansi
    public static final String BLACK_BACKGROUND = "\u001B[40m";
    public static final String RED_BACKGROUND = "\u001B[41m";
    public static final String GREEN_BACKGROUND = "\u001B[42m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE_BACKGROUND = "\u001B[44m";
    public static final String PURPLE_BACKGROUND = "\u001B[45m";
    public static final String CYAN_BACKGROUND = "\u001B[46m";
    public static final String WHITE_BACKGROUND = "\u001B[47m";
    // FOREGROUND COLORS - ansi
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static void methodFound(String method) {
        System.out.println("Looking For " + GREEN + method + COLOR_RESET + " * found");
    }

    public static void methodNotFound(String method) {
        System.out.println("Looking For " + RED + method + COLOR_RESET + "\n");
    }

    public static void question(int questionNumber, String question, String usersAnswer, String correctDefinition) {
        System.out.println(
                "\n" +
                WHITE_BACKGROUND + BLACK +
                "***" +
                "\n" +
                COLOR_RESET + WHITE +
                "\nQuestion " + questionNumber + ":\n" +
                "\n" +
                CYAN +
                question + "\n\n" +
                PURPLE +
                "User's Answer:\n" +
                "\n" +
                usersAnswer + "\n\n" +
                YELLOW +
                "Correct Answer:\n" +
                "\n" +
                correctDefinition + "\n" +
                COLOR_RESET
        );
    }
}