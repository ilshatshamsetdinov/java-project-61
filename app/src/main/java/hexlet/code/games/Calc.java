package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.utils.RandomNumberUtils.rdmDigits;


public final class Calc implements Game {
    private static final String[] OPERATORS = {"+", "-", "*"};
    public static String getOperationResult(String operator, int num, int num2) {
        var resultAnswer = "";
        switch (operator) {
            case "+" -> {
                return Integer.toString(num + num2);
            }
            case "-" -> {
                return Integer.toString(num - num2);
            }
            case "*" -> {
                return Integer.toString(num * num2);
            }
            default -> {
                System.out.println("Operator is not found");
                System.exit(1);
            }
        }
        return resultAnswer;
    }
    @Override
    public String getTask() {
        return "What is the result of the expression?";
    }
    @Override
    public String[] getGameData() {
        var num = rdmDigits();
        var num2 = rdmDigits();
        int operatorIndex = RandomUtils.nextInt(0, OPERATORS.length);
        String operator = OPERATORS[operatorIndex];
        var question = num + " " + operator + " " + num2;
        var correctAnswer = getOperationResult(operator, num, num2);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }

}
