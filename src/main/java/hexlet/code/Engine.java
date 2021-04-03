package hexlet.code;

import java.util.Scanner;

public class Engine {

    private static Scanner scanner = new Scanner(System.in);

    private static final int SUCCESS_REPEAT = 3;

    public static void start(Game game) {

        String name = Cli.welcomeMethod();
        game.printDescription();
        for (int i = 0; i < SUCCESS_REPEAT; i++) {
            String correctAnswer = game.getCorrectAnswer();
            System.out.println("Question: " + game.getQuestion());
            String answer = scanner.nextLine();
            if (!game.checkResult(answer)) {
                System.out.println(
                        String.format("'%1$s' is wrong answer ;(. Correct answer was '%2$s'.",
                                answer, correctAnswer));
                System.out.println(String.format("Let's try again, %0$s!", name));
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

}
