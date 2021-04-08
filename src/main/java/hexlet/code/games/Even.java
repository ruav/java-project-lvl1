package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static void play() {
        Engine.printMessage("Answer 'yes' if number even otherwise answer 'no'");
        while (true) {
            int expression = Utils.randomIntWithMin();
            if (Engine.playCycle(String.valueOf(expression), isEven(expression))) {
                return;
            }
        }
    }

    public static String isEven(int expression) {
        return expression % 2 == 0 ? "yes" : "no";
    }
}
