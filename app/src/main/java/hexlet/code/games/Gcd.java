package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 101;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        int correctAnswer = 0;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 = (int) (Math.random() * MAX_NUMBER);
            int number2 = (int) (Math.random() * MAX_NUMBER);

            int minNumber = Math.min(number1, number2);

            for (int gcd = minNumber; gcd > 0; gcd--) {
                if (number1 % gcd == 0 && number2 % gcd == 0) {
                    correctAnswer = gcd;
                    break;
                }
            }

            rounds[i][0] = number1 + " " + number2;
            rounds[i][1] = "'" + correctAnswer + "'";

        }
        Engine.run(DESCRIPTION, rounds);

    }

}
