package hexlet.code.games;

import java.util.Scanner;

public interface Game {
    String setPlayerAnswer(Scanner scanner);
    String getGameRule();
    String getQuestion();
    String getCorrectAnswer();
    String getPlayerAnswer();




}
