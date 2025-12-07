package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.getName;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String description, String[][] rounds) {
        System.out.println(description);

        Scanner scanner = new Scanner(System.in);
        boolean playerWon = true;

        for (int i = 0; i < Engine.ROUNDS; i++) {

            System.out.println("Question: " + rounds[i][0]);
            System.out.print("Your answer: ");

            String playerAnswer = "'" + scanner.nextLine() + "'";

            if (playerAnswer.equals(rounds[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(playerAnswer + " is wrong answer ;(. Correct answer was " + rounds[i][1] + ".");
                System.out.println("Let's try again, " + getName() + "!");
                playerWon = false;
                break;
            }
        }
        if (playerWon) {
            System.out.println("Congratulations, " + getName() + "!");
        }
    }

}
