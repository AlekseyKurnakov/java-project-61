package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.getName;

public class Calc {
    public static String playCalc(Scanner scanner) {

        System.out.println("What is the result of the expression?");
        int questionCount = 3;
        char[] operators = {'+', '-', '*'};

        while (questionCount > 0) {

            int operatorIndex = (int) (Math.random() * 3);
            int operand1 = (int) (Math.random() * 20);
            int operand2 = (int) (Math.random() * 20);

            char operator = operators[operatorIndex];

            int correctAnswer = switch (operator) {
                case '+' -> operand1 + operand2;
                case '-' -> operand1 - operand2;
                case '*' -> operand1 * operand2;
                default -> 0;
            };

            System.out.println("Question: " + operand1 + " " + operator + " " +operand2);
            System.out.print("Your answer: ");

            int playerAnswer = scanner.nextInt();
            scanner.nextLine();

            if (playerAnswer == correctAnswer) {
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
