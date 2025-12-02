package hexlet.code.games;

import java.util.Scanner;

public class GCD implements Game {

    private int correctAnswer;
    private int number1;
    private int number2;

    @Override
    public String getGameRule() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        this.number1 = (int) (Math.random() * 101);
        this.number2 = (int) (Math.random() * 101);
        return "Question: " + number1 + " " + number2;
    }


    @Override
    public String getCorrectAnswer() {
        int minNumber = Math.min(number1, number2);
        for (int gcd = minNumber; gcd > 0; gcd--) {
            if (number1 % gcd == 0 && number2 % gcd == 0) {
                correctAnswer = gcd;
                break;
            }
        }
        return "'" + correctAnswer + "'";
    }
}



