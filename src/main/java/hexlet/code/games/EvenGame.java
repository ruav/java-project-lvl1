package hexlet.code.games;

import hexlet.code.Game;

import java.util.Random;

public class EvenGame implements Game {

    private Random random = new Random();
    private String correctAnswer = null;

    @Override
    public void printDescription() {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
    }

    @Override
    public String getQuestion() {
        int val = random.nextInt(32);
        correctAnswer = (val % 2 == 0) ? "yes" : "no";
        return String.valueOf(val);
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    @Override
    public boolean checkResult(String answer) {
        return answer.toLowerCase().trim().equals(correctAnswer);
    }
}
