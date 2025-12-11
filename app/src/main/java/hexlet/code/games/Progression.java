package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int PROGRESSION_SIZE = 10;
    private static final int START_PROGRESSION_MAX_VALUE = 101;
    private static final int PROGRESSION_STEP_MAX_VALUE = 5;
    private static final int MIN_VALUE = 1;

    public static String[] progressionGeneration(int startProg, int progStep, int hidNumInd) {
        String[] progression = new String[PROGRESSION_SIZE];
        String hiddenNumber = "";
        String[] result = new String[2];

        for (int index = 0; index < progression.length; index++) {

            progression[index] = String.valueOf(startProg);
            startProg = startProg + progStep;

            if (index == hidNumInd) {
                hiddenNumber = progression[index];
                progression[index] = "..";
            }
        }
        result[0] = String.join(" ", progression);
        result[1] = hiddenNumber;
        return result;

    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String correctAnswer;
        String progression;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int startProgression = (int) (Math.random() * START_PROGRESSION_MAX_VALUE) + MIN_VALUE;
            int progressionStep = (int) (Math.random() * PROGRESSION_STEP_MAX_VALUE) + MIN_VALUE;
            int hiddenNumberIndex = (int) (Math.random() * PROGRESSION_SIZE);

            String[] result = progressionGeneration(startProgression, progressionStep, hiddenNumberIndex);
            progression = result[0];
            correctAnswer = result[1];

            rounds[i][0] = progression;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(DESCRIPTION, rounds);
    }

}