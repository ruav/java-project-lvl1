package hexlet.code.games;
import hexlet.code.Engine;

public class Calc {

    public static void play() {
        System.out.println("What is the result of the expression?");
        int result = 1;
        while (true) {
            int val1 = Engine.randomIntWithMin();
            int val2 = Engine.randomIntWithMin();
            Character operator = getOperation();
            String expression = val1 + " " + operator + " " + val2;
            result = calcResult(val1, val2, operator);
            Engine.playCycle(expression.trim(), String.valueOf(result));
        }
    }

    private static Character getOperation() {
        switch (Engine.randomInt(2)) {
            case 0:
                return '+';
            case 1:
                return '-';
            case 2:
                return '/';
            default:
                return '*';
        }
    }

    private static int calcResult(int val1, int val2, Character op) {
        switch (op) {
            case '+':
                return val1 + val2;
            case '-':
                return val1 - val2;
            case '*':
                return val1 * val2;
            default:
                return val1 / val2;
        }
    }
}
