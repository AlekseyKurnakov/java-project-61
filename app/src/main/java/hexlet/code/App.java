package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {


    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your choice: " + playerChoice);


        switch (playerChoice) {
            case 1:
                Cli.greetUser();
                break;
            case 2:
                Cli.greetUser();
                Even.run();
                break;
            case 3:
                Cli.greetUser();
                Calc.run();
                break;
            case 4:
                Cli.greetUser();
                GCD.run();
                break;
            case 5:
                Cli.greetUser();
                Progression.run();
                break;
            case 6:
                Cli.greetUser();
                Prime.run();
                break;
            default:
                System.out.println("Incorrect selection. Try again.");
                break;
        }
    }
}
