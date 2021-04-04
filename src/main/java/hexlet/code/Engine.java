package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static int count = 0;
    private static String yourAnswer;
    private static final String NAME_GAMER = Cli.getName();
    private static Random random = new Random();

    public static int randomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int randomInt() {
        final int min = 1;
        final int max = 150;
        return min + (int) (Math.random() * (max - min));
    }

    public static void playCycle(final String expression, final String result) {
        final int yesANSWERS = 3;
        if (count == yesANSWERS) {
            System.out.println("Congratulations, " + NAME_GAMER + "!");
            System.exit(0);
        } else {
            askQuestion(expression);
            getAnswer();
            correctOrNot(result, yourAnswer);
        }
    }


    public static void askQuestion(final String expression) {
        System.out.println("Question: " + expression);
    }

    public static void getAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your answer: ");
        yourAnswer = sc.nextLine();
    }

    public static void correctOrNot(final String result, final String answer) {
        if (result.equals(answer)) {
            System.out.println("Correct!");
            count += 1;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(."
                + " Correct answer was '" + result + "'."
                + "\nLet's try again, " + NAME_GAMER + "!");
            count = 0;
            System.exit(0);
        }
    }
}
