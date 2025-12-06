package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {


    private static final String DESCRIPTION = "What number is missing in the progression?";

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];
        String hiddenNumber = "";
        String correctAnswer;
        for (int i = 0; i < Engine.ROUNDS; i++) {

            int startProgression = (int) (Math.random() * 101) + 1;
            int progressionStep = (int) (Math.random() * 5) + 1;
            int hiddenNumberIndex = (int) (Math.random() * 10);
            String[] progression = new String[10];

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
