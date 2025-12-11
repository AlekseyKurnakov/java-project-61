package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;

    public static void run(String description, String[][] rounds) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");

        String userName = scanner.nextLine();

        System.out.println("Hello, " + userName + "!");

        if (description != null && !description.isEmpty()) {
            System.out.println(description);
        }

        boolean userWon = true;

        for (String[] round : rounds) {

            System.out.println("Question: " + round[0]);
            System.out.print("Your answer: ");

            String userAnswer = "'" + scanner.nextLine() + "'";
            String correctAnswer = "'" + round[1] + "'";

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer + ".");
                System.out.println("Let's try again, " + userName + "!");
                userWon = false;
                break;
            }
        }
        if (userWon && rounds.length > 0) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}
