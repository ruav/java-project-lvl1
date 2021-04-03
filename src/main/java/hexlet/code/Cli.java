package hexlet.code;

import java.util.Scanner;

public final class Cli {

    private static Scanner scanner = new Scanner(System.in);

    private Cli() { }

    /**
     *
     */
    public static String welcomeMethod() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        return name;
    }

}
