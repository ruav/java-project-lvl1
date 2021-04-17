package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_CORRECT_ANSWER_FOR_SUCCESS = 3;
    private static String yourAnswer;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void playCycle(final String helloMessage, final String[] expression, final String[] results) {

        printMessage(helloMessage);
        for (int i = 0; i < NUMBER_CORRECT_ANSWER_FOR_SUCCESS; i++) {
            askQuestion(expression[i]);
            getAnswer();
            if (correctOrNot(results[i], yourAnswer)) {
                printMessage("Congratulations, " + Cli.getName() + "!");
                break;
            }
        }

    }

    public static void askQuestion(final String expression) {
        printMessage("Question: " + expression);
    }

    public static void getAnswer() {
        printMessage("Your answer: ");
        yourAnswer = SCANNER.nextLine();
    }

    public static boolean correctOrNot(final String result, final String answer) {
        if (result.equals(answer)) {
            printMessage("Correct!");
            return true;
        }
        printMessage(
                String.format("'%1$s' is wrong answer ;(. Correct answer was '%2$s'.",
                        answer, result));
        printMessage(String.format("Let's try again, %0$s!", Cli.getName()));
        return false;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static String readLine() {
        return SCANNER.nextLine();
    }
}
