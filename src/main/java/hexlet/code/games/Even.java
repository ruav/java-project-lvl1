package hexlet.code.games;
import hexlet.code.Engine;

public class Even {

    public static void play() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'");
        while (true) {
            int expression = Engine.randomInt();
            String result = expression % 2 == 0 ? "yes" : "no";
            Engine.playCycle(String.valueOf(expression), result);
        }
    }
}
