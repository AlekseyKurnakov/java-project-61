package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String userName;

    public static String getName() {
        return userName;
    }
    public static String greetUser(Scanner scanner) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scanner.nextLine();
        return "Hello, " + userName + "!";
    }
}
