package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static void play() {
        Engine.printMessage("Answer 'yes' if given number is prime."
                + " Otherwise answer 'no'.");
        while (true) {
            int simplyNum = Utils.randomIntWithMin();
            String result = isSimple(simplyNum) ? "yes" : "no";
            if (Engine.playCycle(String.valueOf(simplyNum), result)) {
                return;
            }
        }
    }

    private static boolean isSimple(int simplyNum) {
        int driver = 2;
        while (driver < simplyNum) {
            if (simplyNum % driver == 0) {
                return false;
            }
            driver += 1;
        }
        return true;
    }
}
