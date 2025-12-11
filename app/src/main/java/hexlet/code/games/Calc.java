package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_OPERAND = 20;

    private static int calculation(int operand1, int operand2, char operator) {

        return switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            default -> {
                System.out.println("Unknown operator: " + operator);
                yield 0;
            }
        };
    }

    public static void run() {
        String[][] rounds = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            char[] operators = {'+', '-', '*'};
            int operatorIndex = (int) (Math.random() * operators.length);
            char operator = operators[operatorIndex];
            int operand1 = (int) (Math.random() * MAX_OPERAND);
            int operand2 = (int) (Math.random() * MAX_OPERAND);

            int correctAnswer = calculation(operand1, operand2, operator);

            rounds[i][0] = operand1 + " " + operator + " " + operand2;
            rounds[i][1] = String.valueOf(correctAnswer);
        }
        Engine.run(DESCRIPTION, rounds);
    }

}

