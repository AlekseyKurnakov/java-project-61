package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int EXIT = 0;


    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GREET + " - Greet");
        System.out.println(EVEN + " - Even");
        System.out.println(CALC + " - Calc");
        System.out.println(GCD + " - GCD");
        System.out.println(PROGRESSION + " - Progression");
        System.out.println(PRIME + " - Prime");
        System.out.println(EXIT + " - Exit");

        Scanner scanner = new Scanner(System.in);
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your choice: " + playerChoice);


        switch (playerChoice) {
            case GREET:
                Cli.greetUser();
                break;
            case EVEN:
                Cli.greetUser();
                Even.run();
                break;
            case CALC:
                Cli.greetUser();
                Calc.run();
                break;
            case GCD:
                Cli.greetUser();
                Gcd.run();
                break;
            case PROGRESSION:
                Cli.greetUser();
                Progression.run();
                break;
            case PRIME:
                Cli.greetUser();
                Prime.run();
                break;
            default:
                System.out.println("Incorrect selection. Try again.");
                break;
        }
    }
}
