package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.Engine.rdmDigits;


public final class Calc implements Game {
    public static String getAnswer(String operator, int digit, int digit2) {
        var resultAnswer = "";
        switch (operator) {
            case "+" -> {
                return Integer.toString(digit + digit2);
            }
            case "-" -> {
                return Integer.toString(digit - digit2);
            }
            case "*" -> {
                return Integer.toString(digit * digit2);
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
        var digit = rdmDigits();
        var digit2 = rdmDigits();
        String[] operators = {"+", "-", "*"};
        final int indexLimit = 2;
        int rdmOperatorIndex = RandomUtils.nextInt(0, indexLimit);
        String rdmOperator = operators[rdmOperatorIndex];
        var resultQuestion = digit + " " + rdmOperator + " " + digit2;
        var question = "Question: " + resultQuestion;
        var correctAnswer = getAnswer(rdmOperator, digit, digit2);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
