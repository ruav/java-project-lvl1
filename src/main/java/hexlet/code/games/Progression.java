package hexlet.code.games;
import hexlet.code.Engine;

public class Progression {

    private static int lostNum;
    public static void play() {
        System.out.println("What number is missing in the progression?");
        while (true) {
            final int round = 10;
            int num = Engine.randomInt();
            int increment = Engine.randomInt();
            int indexLost = (int) (Math.random() * round);
            String progression = build(indexLost, num, increment);
            Engine.playCycle(progression.trim(), String.valueOf(lostNum));
        }
    }
    public static String build(final int lost, final int num, final int inc) {
        int itemOfProgress = num;
        String progressionStr = "";
        final int strLength = 10;
        for (int i = 0; i < strLength; i++) {
            itemOfProgress += inc;
            if (i == lost) {
                progressionStr += ".. ";
                lostNum = itemOfProgress;
                } else {
                progressionStr += (itemOfProgress + " ");
                }
        }
        return progressionStr;
    }
}
