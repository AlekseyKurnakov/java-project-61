package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getName;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String DESCRIPTION, String[][] rounds) {

        System.out.println(DESCRIPTION);


        boolean playerWon = true;

        for (int i = 0; i < ROUNDS; i++) {

            System.out.println("Question: " + rounds[i][0]);

            System.out.print("Your answer: ");

            Scanner scanner = new Scanner(System.in);
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
