package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String HELLO_MESSAGE = "What is the result of the expression?";

    public static void play() {
        String[] results = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];
        String[] expressions = new String[Engine.NUMBER_CORRECT_ANSWER_FOR_SUCCESS];
        for (int i = 0; i < results.length; i++) {
            int val1 = Utils.randomIntWithMin();
            int val2 = Utils.randomIntWithMin();
            Operation operator = getOperation();
            expressions[i] = val1 + " " + operator.getOperationSign() + " " + val2;
            results[i] = String.valueOf(operator.calcResult(val1, val2));
        }
        Engine.playCycle(HELLO_MESSAGE, expressions, results);

    }

    private static Operation getOperation() {
        return Operation.values()[Utils.randomInt(Operation.values().length)];
    }

    private enum Operation {
        Plus('+'),
        Minus('-'),
        Multiplication('*');

        private final char operationSign;

        Operation(char operationSignInit) {
            this.operationSign = operationSignInit;
        }

        public char getOperationSign() {
            return operationSign;
        }

        public int calcResult(int val1, int val2) {
            switch (this) {
                case Plus:
                    return val1 + val2;
                case Minus:
                    return val1 - val2;
                default:
                    return val1 * val2;
            }
        }

    }
}
