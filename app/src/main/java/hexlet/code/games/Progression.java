package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_SIZE = 10;
    private static final int START_PROGRESSION_MAX_VALUE = 101;
    private static final int PROGRESSION_STEP_MAX_VALUE = 5;
    private static final int MIN_VALUE = 1;

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String hiddenNumber = "";
        String correctAnswer;
        for (int i = 0; i < Engine.ROUNDS; i++) {

            int startProgression = (int) (Math.random() * START_PROGRESSION_MAX_VALUE) + MIN_VALUE;
            int progressionStep = (int) (Math.random() * PROGRESSION_STEP_MAX_VALUE) + MIN_VALUE;
            int hiddenNumberIndex = (int) (Math.random() * PROGRESSION_SIZE);
            String[] progression = new String[PROGRESSION_SIZE];

            for (int index = 0; index < progression.length; index++) {

                progression[index] = String.valueOf(startProgression);
                startProgression = startProgression + progressionStep;

                if (index == hiddenNumberIndex) {
                    hiddenNumber = progression[index];
                    progression[index] = "..";

                }
            }

            correctAnswer = hiddenNumber;

            rounds[i][0] = String.join(" ", progression);
            rounds[i][1] = "'" + correctAnswer + "'";

        }
        Engine.run(DESCRIPTION, rounds);
    }

}
