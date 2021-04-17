package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    private static final String HELLO_MESSAGE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {

        String[] results = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];
        String[] expressions = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];

        for (int i = 0; i < results.length; i++) {
            int simplyNum = Utils.randomIntWithMin();
            results[i] = isSimple(simplyNum) ? "yes" : "no";
            expressions[i] = String.valueOf(simplyNum);
        }

        Engine.playCycle(HELLO_MESSAGE, expressions, results);

    }

    private static boolean isSimple(int simplyNum) {
        int divisor = 2;
        while (divisor < Math.abs(simplyNum)) {
            if (simplyNum % divisor == 0) {
                return false;
            }
            divisor += 1;
        }
        return true;
    }
}
