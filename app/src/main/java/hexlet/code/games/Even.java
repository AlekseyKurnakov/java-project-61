package hexlet.code.games;


public class Even implements Game {

    private String correctAnswer;
    private int number;

    @Override
    public String getGameRule() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        number = (int) (Math.random() * 100);
        return "Question: " + number;
    }

    @Override
    public String getCorrectAnswer() {
        if (number % 2 == 0) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return "'" + correctAnswer + "'";
    }
}
