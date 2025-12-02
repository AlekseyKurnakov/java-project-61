package hexlet.code;

import hexlet.code.games.*;

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
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        int playerChoice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Your choice: " + playerChoice);

        Game game;

        switch (playerChoice) {
            case 1:
                System.out.println(greetUser(scanner));
                break;
            case 2:
                System.out.println(greetUser(scanner));
                game = new Even();
                System.out.println(run(game));
                break;
            case 3:
                System.out.println(greetUser(scanner));
                game = new Calc();
                System.out.println(run(game));
                break;
            case 4:
                System.out.println(greetUser(scanner));
                game = new GCD();
                System.out.println(run(game));
                break;
            case 5:
                System.out.println(greetUser(scanner));
                game = new Progression();
                System.out.println(run(game));
                break;
        }





    }
}
