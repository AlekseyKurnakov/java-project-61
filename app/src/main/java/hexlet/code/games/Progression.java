package hexlet.code.games;

public class Progression implements Game {

    private String correctAnswer;
    private String[] progression = new String[10];
    private int StartProgression;
    private int hiddenNumberIndex;
    private int progressionStep;
    private String hiddenNumber;

    @Override
    public String getGameRule() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getQuestion() {
        StartProgression = (int) (Math.random() * 101) + 1;
        progressionStep = (int) (Math.random() * 5) + 1;
        hiddenNumberIndex = (int) (Math.random() * 10);


        for (int index = 0; index < progression.length; index++) {
            progression[index] = String.valueOf(StartProgression);
            StartProgression = StartProgression + progressionStep;
            if (index == hiddenNumberIndex) {
                hiddenNumber = progression[index];
                progression[index] = "..";

            }
        }

        return "Question: " + String.join(" ", progression);
    }


    @Override
    public String getCorrectAnswer() {
        correctAnswer = hiddenNumber;


        return "'" + correctAnswer + "'";
    }
}
