package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_LENGTH = 10;
    private static final int START_PROGRESSION_MAX_VALUE = 101;
    private static final int PROGRESSION_STEP_MAX_VALUE = 5;
    private static final int MIN_VALUE = 1;

    private static String[] makeProgression(int first, int step, int length) {
        String[] progression = new String[length];

        for (int index = 0; index < progression.length; index++) {

            progression[index] = String.valueOf(first);
            first = first + step;
        }
        return progression;
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String correctAnswer;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int first = (int) (Math.random() * START_PROGRESSION_MAX_VALUE) + MIN_VALUE;
            int step = (int) (Math.random() * PROGRESSION_STEP_MAX_VALUE) + MIN_VALUE;
            int hiddenIndex = (int) (Math.random() * PROGRESSION_LENGTH);

            String[] progression = makeProgression(first, step, PROGRESSION_LENGTH);

            correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            rounds[i][0] = String.join(" ", progression);
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

}
