package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Arrays;
/**
 * Welcome to the Brain Games!
 *
 */
public class App {

    public static void main(final String[] args) {
        makeGame();
    }

    public static void makeGame() {
        Engine.printMessage("Please enter the game number and press Enter.");
        Arrays.stream(Logic.values()).forEach(l -> Engine.printMessage(l.getNum() + " - " + l.getName()));
        Engine.printMessage("Your choice: ");
        String choice = Engine.readLine();
        Cli.hello();
        switch (choice) {
            case "1":
                break;
            case "2":
                Even.play();
                break;
            case "3":
                Calc.play();
                break;
            case "4":
                GCD.play();
                break;
            case "5":
                Progression.play();
                break;
            case "6":
                Prime.play();
                break;
            default:
                break;
        }
    }
}
