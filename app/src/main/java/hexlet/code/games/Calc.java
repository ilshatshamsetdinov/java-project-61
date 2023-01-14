package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.rdmDigits;


public final class Calc implements Game {
    public static String getAnswer(String operator, int num, int num2) {
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
        int operatorIndex = RandomUtils.nextInt(0, INDEXLIMIT);
        String operator = OPERATORS[operatorIndex];
        var question = num + " " + operator + " " + num2;
        var correctAnswer = getAnswer(operator, num, num2);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
    private static final int INDEXLIMIT = 2;
    private static final String[] OPERATORS = {"+", "-", "*"};
}
