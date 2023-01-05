package hexlet.code.games;

import static hexlet.code.Engine.rdmDigits;

public class Prime implements Game {
    private static boolean getPrime(int digit) {
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    @Override
    public String[] getGameData() {
        var digit = rdmDigits();
        var correctAnswer = getPrime(digit) ? "yes" : "no";
        var question = "Question: " + digit;
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
