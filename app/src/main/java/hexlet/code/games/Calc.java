package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            char[] operators = {'+', '-', '*'};
            int operatorIndex = (int) (Math.random() * 3);
            char operator = operators[operatorIndex];
            int operand1 = (int) (Math.random() * 20);
            int operand2 = (int) (Math.random() * 20);

            int correctAnswer = switch (operator) {
                case '+' -> operand1 + operand2;
                case '-' -> operand1 - operand2;
                case '*' -> operand1 * operand2;
                default -> 0;
            };

            rounds[i][0] = operand1 + " " + operator + " " + operand2;
            rounds[i][1] = "'" + correctAnswer + "'";


        }
        Engine.run(DESCRIPTION, rounds);
    }

}

