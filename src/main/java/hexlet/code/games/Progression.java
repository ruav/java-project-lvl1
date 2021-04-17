package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private final static String HELLO_MESSAGE = "What number is missing in the progression?";

    public static void play() {

        String[] results = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];
        String[] expressions = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];

        for (int i = 0; i < results.length; i++) {
            final int progressionLength = 10;
            int num = Utils.randomIntWithMin();
            int increment = Utils.randomIntWithMin();
            int indexLost = Utils.randomInt(progressionLength);
            String[] array = generateProgression(indexLost, num, increment, progressionLength);
            int answer = num + (increment * (indexLost + 1));
            results[i] = String.valueOf(answer);
            expressions[i] = String.join(" ", array).trim();
        }

        Engine.playCycle(HELLO_MESSAGE, expressions, results);

    }

    public static String[] generateProgression(final int lost,
                                               final int startNum,
                                               final int increment,
                                               int progressionLength) {
        String[] array = new String[progressionLength];
        int itemOfProgress = startNum;
        for (int i = 0; i < array.length; i++) {
            itemOfProgress += increment;
            if (i == lost) {
                array[i] = "..";
            } else {
                array[i] = String.valueOf(itemOfProgress);
            }
        }
        return array;
    }

}
