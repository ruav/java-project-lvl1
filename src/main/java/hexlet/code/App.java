package hexlet.code;

import hexlet.code.games.CalculatorGame;
import hexlet.code.games.EvenGame;

import java.util.Arrays;
import java.util.Scanner;

public final class App {

    private App() {
    }

    /**
     *
     * @param args
     */
    public static void main(final String[] args) {
        choseLogic();
    }

    /**
     * logic for game.
     */
    public static void choseLogic() {
        System.out.println("Please enter the game number and press Enter.");
        Arrays.stream(Logic.values()).forEach(l -> System.out.println(l.getNum() + " - " + l.getName()));
        System.out.println("Your choice: ");

        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                Cli.welcomeMethod();
                break;
            case 2:
                Engine.start(new EvenGame());
                break;
            case 3:
                Engine.start(new CalculatorGame());
            default:
                break;
        }
    }
}
