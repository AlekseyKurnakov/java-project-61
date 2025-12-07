package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 101;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String correctAnswer;
        int number = 0;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            number = (int) (Math.random() * MAX_NUMBER);

            if (number % 2 == 0) {
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
