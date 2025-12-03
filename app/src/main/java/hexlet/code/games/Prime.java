package hexlet.code.games;

public class Prime implements Game {

    private String correctAnswer;
    private int quantityOfDivisors;

    @Override
    public String getGameRule() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        int number = (int) (Math.random() * 101) + 1;
        quantityOfDivisors = 0;
        for (int index = number; index > 0; index--) {

            if (number % index == 0) {
                quantityOfDivisors++;
                if (quantityOfDivisors > 2) {
                    return "Question: " + number;
                }

            }
        }

        return "Question: " + number;
    }

    @Override
    public String getCorrectAnswer() {
        if (quantityOfDivisors == 2) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }
        return "'" + correctAnswer + "'";
    }

}
