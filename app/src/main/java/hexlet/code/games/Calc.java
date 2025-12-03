package hexlet.code.games;


public class Calc implements Game {

    private int correctAnswer;
    private int operand1;
    private int operand2;
    private char operator;

    @Override
    public String getGameRule() {
        return "What is the result of the expression?";
    }

    @Override
    public String getQuestion() {
        char[] operators = {'+', '-', '*'};
        int operatorIndex = (int) (Math.random() * 3);
        this.operator = operators[operatorIndex];
        this.operand1 = (int) (Math.random() * 20);
        this.operand2 = (int) (Math.random() * 20);
        return "Question: " + operand1 + " " + operator + " " + operand2;
    }


    @Override
    public String getCorrectAnswer() {
        correctAnswer = switch (operator) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            default -> 0;
        };
        return "'" + correctAnswer + "'";
    }

}

