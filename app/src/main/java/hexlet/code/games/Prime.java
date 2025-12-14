package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 101;

    public static boolean isPrime(int number) {
        boolean result;
        int quantityOfDivisors = 0;

        for (int index = number; index > 0; index--) {

            if (number % index == 0) {
                quantityOfDivisors++;
                if (quantityOfDivisors > 2) {
                    break;
                }
            }
        }
        if (quantityOfDivisors == 2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String correctAnswer;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int number = (int) (Math.random() * MAX_NUMBER) + 1;

            correctAnswer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);

    }
}
