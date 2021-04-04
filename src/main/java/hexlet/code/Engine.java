package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {
    private static int count = 0;
    private static String yourAnswer;
    private static final String NAME_GAMER = Cli.getName();
    private static Random random = new Random();
    public static final int DEFAULT_GEN_NUMBER = 150;

    public static int randomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int randomIntWithMin(int bound) {
        return 1 + random.nextInt(bound);
    }

    public static int randomIntWithMin() {
        return randomIntWithMin(DEFAULT_GEN_NUMBER);
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
            System.out.println(
                    String.format("'%1$s' is wrong answer ;(. Correct answer was '%2$s'.",
                            answer, result));
            System.out.println(String.format("Let's try again, %0$s!", NAME_GAMER));
            count = 0;
            System.exit(0);
        }
    }
}
