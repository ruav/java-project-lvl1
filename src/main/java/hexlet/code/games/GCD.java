package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String HELLO_MESSAGE = "Find the greatest common divisor of given numbers.";

    public static void play() {

        String[] results = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];
        String[] expressions = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];

        int nod = 0;

        for (int i = 0; i < results.length; i++) {
            int val1 = Utils.randomIntWithMin();
            int val2 = Utils.randomIntWithMin();
            nod = findNod(val1, val2);
            String expression = " " + val1 + " " + val2;
            expressions[i] = expression.trim();
            results[i] = String.valueOf(nod);
        }

        Engine.playCycle(HELLO_MESSAGE, expressions, results);
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
