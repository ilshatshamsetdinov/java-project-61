package hexlet.code.games;

import static hexlet.code.Engine.rdmDigits;

public final class Prime implements Game {
    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
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
        var num = rdmDigits();
        var correctAnswer = isPrime(num) ? "yes" : "no";
        var question = Integer.toString(num);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
