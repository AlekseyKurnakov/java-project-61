package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

import static hexlet.code.Cli.getName;

public class Engine {

    public static String run(Game game) {

        int questionCount = 3;

        System.out.println(game.getGameRule());

        while (questionCount > 0) {

            System.out.println(game.getQuestion());
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            game.setPlayerAnswer(scanner);

            String playerAnswer = game.getPlayerAnswer();
            String correctAnswer = game.getCorrectAnswer();

            if (playerAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
                return "Let's try again, " + getName() + "!";
            }
            questionCount--;


        }
        return "Congratulations, " + getName() + "!";

    }

}
