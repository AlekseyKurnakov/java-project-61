package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.Even.playEven;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your choice: " + playerChoice);

        if (playerChoice == 1) {
            System.out.println(greetUser(scanner));
        }
        if (playerChoice == 2) {
            System.out.println(greetUser(scanner));
            System.out.println(playEven(scanner));
        }
    }
}
