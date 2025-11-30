package hexlet.code;

import java.util.Scanner;
import static hexlet.code.Cli.greetUser;
import static hexlet.code.Even.playEven;
import static hexlet.code.Calc.playCalc;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your choice: " + playerChoice);

        switch (playerChoice) {
            case 1:
                System.out.println(greetUser(scanner));
                break;
            case 2:
                System.out.println(greetUser(scanner));
                System.out.println(playEven(scanner));
                break;
            case 3:
                System.out.println(greetUser(scanner));
                System.out.println(playCalc(scanner));
                break;
        }

    }
}
