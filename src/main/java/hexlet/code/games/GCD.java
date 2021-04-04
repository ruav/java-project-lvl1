package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {

    public static void play() {
        System.out.println("Find the greatest common "
                      + "divisor of given numbers.");
        int nod;
        while (true) {
            int firstOperand = Engine.randomInt();
            int secondOperand = Engine.randomInt();
            nod = findNod(firstOperand, secondOperand);
            String expression = " " + firstOperand + " " + secondOperand;
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
