package hexlet.code;

public interface Game {

    void printDescription();
    String getQuestion();
    String getCorrectAnswer();
    boolean checkResult(String answer);

}
