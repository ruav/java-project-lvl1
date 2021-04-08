package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void play() {
        Engine.printMessage("What number is missing in the progression?");
        while (true) {
            final int round = 10;
            int num = Utils.randomIntWithMin();
            int increment = Utils.randomIntWithMin();
            int indexLost = Utils.randomInt(round);
            String[] array = generateProgressionArray(indexLost, num, increment, round);
            int answer = num + (increment * (indexLost + 1));
            if (Engine.playCycle(String.join(" ", array).trim(), String.valueOf(answer))) {
                return;
            }
        }
    }

    public static String[] generateProgressionArray(final int lost,
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
