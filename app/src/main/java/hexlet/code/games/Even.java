package hexlet.code.games;

import static hexlet.code.Engine.rdmDigits;

public class Even implements Game {
    public static boolean getEven(int digit) {
        return digit % 2 == 0;
    }
    @Override
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    @Override
    public String[] getGameData() {
        var digit = rdmDigits();
        var correctAnswer = getEven(digit) ? "yes" : "no";
        var question = "Question: " + digit;
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}

