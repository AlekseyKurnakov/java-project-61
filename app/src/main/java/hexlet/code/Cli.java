package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String greetUser() {

        System.out.println("May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return "Hello, " + name + "!";
    }
}
