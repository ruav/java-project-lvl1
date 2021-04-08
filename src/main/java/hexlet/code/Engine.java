package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static int count = 0;
    private static String yourAnswer;
    private static final String NAME_GAMER = Cli.getName();
    private static final Scanner sc = new Scanner(System.in);

    public static void playCycle(final String expression, final String result) {
        final int yesANSWERS = 3;
        if (count == yesANSWERS) {
            printMessage("Congratulations, " + NAME_GAMER + "!");
            return;
        } else {
            askQuestion(expression);
            getAnswer();
            if (!correctOrNot(result, yourAnswer)) {
                return;
            }
        }
    }

    public static void askQuestion(final String expression) {
        printMessage("Question: " + expression);
    }

    public static void getAnswer() {
        printMessage("Your answer: ");
        yourAnswer = sc.nextLine();
    }

    public static boolean correctOrNot(final String result, final String answer) {
        if (result.equals(answer)) {
            printMessage("Correct!");
            count += 1;
            return true;
        }
        printMessage(
                String.format("'%1$s' is wrong answer ;(. Correct answer was '%2$s'.",
                        answer, result));
        printMessage(String.format("Let's try again, %0$s!", NAME_GAMER));
        count = 0;
        return false;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static String readLine() {
        return sc.nextLine();
    }
}
