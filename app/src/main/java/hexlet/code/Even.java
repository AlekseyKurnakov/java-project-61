package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.getName;

public class Even {
    public static String playEven(Scanner scanner) {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int questionCount = 3;

        while (questionCount > 0) {

            int number = (int) (Math.random() * 100);

            System.out.println("Question: " + number);
            System.out.print("Your answer: ");

            String playerAnswer = scanner.nextLine();
            String correctAnswer;

            if (number % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

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
