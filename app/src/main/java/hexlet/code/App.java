package hexlet.code;

import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

import static hexlet.code.Cli.greetUser;
import static hexlet.code.Engine.run;

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
                greetUser();
                break;
            case 2:
                greetUser();
                Even.run();
                break;
            case 3:
                greetUser();
                Calc.run();
                break;
            case 4:
                greetUser();
                GCD.run();
                break;
            case 5:
                greetUser();
                Progression.run();
                break;
            case 6:
                greetUser();
                Prime.run();
                break;
            default:
                System.out.println("Incorrect selection. Try again.");
                break;
        }
    }
}
