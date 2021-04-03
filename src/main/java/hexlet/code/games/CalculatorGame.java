package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class CalculatorGame implements Game {

    private final static int NumForGenInt = 32;
    private Random random = new Random();
    private String correctAnswer = null;

    @Override
    public void printDescription() {
        System.out.println("What is the result of the expression?");
    }

    @Override
    public String getQuestion() {
        int val1 = random.nextInt(NumForGenInt);
        int val2 = random.nextInt(NumForGenInt);
        String op = getOperation();
        correctAnswer = String.valueOf(calcResult(val1, val2, op));
        return val1 + " " + op + " " + val2;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public boolean checkResult(String answer) {
        return answer.toLowerCase().trim().equals(correctAnswer);
    }

    private String getOperation() {
        switch (random.nextInt(2)) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "/";
            default:
                return "*";
        }
    }

    private int calcResult(int val1, int val2, String op) {
        switch (op) {
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            default:
                return val1 / val2;
        }
    }

}
