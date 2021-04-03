package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public final class Cli {

    private static String name = null;
    private static Scanner scanner = new Scanner(System.in);

    private Cli() { }

    /**
     *
     */
    public static void welcomeMethod() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = scanner.nextLine();
        System.out.println(name);
        System.out.println("Hello, " + name);

    }

    /**
     *
     */
    public static void even() {
        welcomeMethod();
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(32);
            String isEven = (number % 2 == 0) ? "yes" : "no";
            System.out.println("Question: " + number);
            String answer = scanner.nextLine();
            if (!answer.toLowerCase().trim().equals(isEven)) {
                System.out.println(
                        String.format("'%1$s' is wrong answer ;(. Correct answer was '%2$s'.",
                                answer, isEven));
                System.out.println(String.format("Let's try again, %0$s!", name));
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");

    }

}
