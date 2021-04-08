package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static void play() {
        Engine.printMessage("What is the result of the expression?");
        int result = 1;
        while (true) {
            int val1 = Utils.randomIntWithMin();
            int val2 = Utils.randomIntWithMin();
            Character operator = getOperation();
            String expression = val1 + " " + operator + " " + val2;
            result = calcResult(val1, val2, operator);
            Engine.playCycle(expression.trim(), String.valueOf(result));
        }
    }

    private static Character getOperation() {
        switch (Utils.randomInt(2)) {
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
            case '/':
                return val1 / val2;
            case '-':
                return val1 - val2;
            case '*':
                return val1 * val2;
            default:
                return val1 + val2;
        }
    }
}
