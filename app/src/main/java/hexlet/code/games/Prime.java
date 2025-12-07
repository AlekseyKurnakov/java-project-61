package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 101;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String correctAnswer;
        for (int i = 0; i < Engine.ROUNDS; i++) {

            int quantityOfDivisors = 0;
            int number = (int) (Math.random() * MAX_NUMBER) + 1;

            for (int index = number; index > 0; index--) {

                if (number % index == 0) {
                    quantityOfDivisors++;
                    if (quantityOfDivisors > 2) {
                        break;
                    }

                }
            }
            if (quantityOfDivisors == 2) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }


            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = "'" + correctAnswer + "'";


        }
        Engine.run(DESCRIPTION, rounds);

    }
}
