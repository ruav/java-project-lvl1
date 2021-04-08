package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int DEFAULT_GEN_NUMBER = 150;
    private static Random random = new Random();

    public static int randomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int randomIntWithMin(int bound) {
        return 1 + random.nextInt(bound);
    }

    public static int randomIntWithMin() {
        return randomIntWithMin(DEFAULT_GEN_NUMBER);
    }
}
