package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        int correctAnswer = 0;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number1 = (int) (Math.random() * 101);
            int number2 = (int) (Math.random() * 101);

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