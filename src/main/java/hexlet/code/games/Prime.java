package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {


    public static void play() {
        System.out.println("Answer 'yes' if given number is prime."
                         + " Otherwise answer 'no'.");
        while (true) {
            String result = "yes";
            int simplyNum = Engine.randomInt();
            int driver = 2;
            while (driver < simplyNum) {
                if (simplyNum % driver == 0) {
                    result = "no";
                }
                driver += 1;
            }
            Engine.playCycle(String.valueOf(simplyNum), result);
        }
    }
}
