package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static void play() {
        Engine.printMessage("Find the greatest common "
                + "divisor of given numbers.");
        int nod;
        while (true) {
            int val1 = Utils.randomIntWithMin();
            int val2 = Utils.randomIntWithMin();
            nod = findNod(val1, val2);
            String expression = " " + val1 + " " + val2;
            Engine.playCycle(expression.trim(), String.valueOf(nod));
        }
    }

    public static int findNod(final int firstNum, final int secondNum) {
        int first = firstNum;
        int second = secondNum;
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return first;
    }
}
