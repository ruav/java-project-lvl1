package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final String HELLO_MESSAGE = "Answer 'yes' if number even otherwise answer 'no'";

    public static void play() {

        String[] results = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];
        String[] expressions = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];

        for (int i = 0; i < results.length; i++) {
            int expression = Utils.randomIntWithMin();
            expressions[i] = String.valueOf(expression);
            results[i] = isEvenAnswer(isEven(expression));
        }

        Engine.playCycle(HELLO_MESSAGE, expressions, results);

    }

    public static boolean isEven(int expression) {
        return expression % 2 == 0;
    }

    public static String isEvenAnswer(boolean isEven) {
        return isEven ? "yes" : "no";
    }
}
