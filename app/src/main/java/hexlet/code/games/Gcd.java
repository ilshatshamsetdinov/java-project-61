package hexlet.code.games;

import static hexlet.code.Engine.rdmDigits;

public class Gcd implements Game {
    public static int isGcd(int digit, int digit2) {
        int gcd = 1;
        for (int i = 1; i <= digit && i <= digit2; i++) {
            if (digit % i == 0 && digit2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    @Override
    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String[] getGameData() {
        var digit = rdmDigits();
        var digit2 = rdmDigits();
        var correctAnswer = Integer.toString(isGcd(digit, digit2));
        var question = "Question: " + digit + " " + digit2;
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
