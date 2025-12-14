package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 101;
    private static final int MIN_NUMBER = 1;

    public static int findGcd(int number1, int number2) {
        int minNumber = Math.min(number1, number2);
        int gcd;
        for (gcd = minNumber; gcd > 0; gcd--) {
            if (number1 % gcd == 0 && number2 % gcd == 0) {
                return gcd;
            }
        }
        return gcd;
    }


    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        int correctAnswer = 0;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 = (int) (Math.random() * MAX_NUMBER) + MIN_NUMBER;
            int number2 = (int) (Math.random() * MAX_NUMBER) + MIN_NUMBER;

            correctAnswer = findGcd(number1, number2);

            rounds[i][0] = number1 + " " + number2;
            rounds[i][1] = String.valueOf(correctAnswer);
        }
        Engine.run(DESCRIPTION, rounds);

    }

}
