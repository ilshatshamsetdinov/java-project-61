package hexlet.code.games;

import static hexlet.code.Engine.rdmDigits;

public final class Gcd implements Game {
    public static int isGcd(int num, int num2) {
        int gcd = 1;
        for (int i = 1; i <= num && i <= num2; i++) {
            if (num % i == 0 && num2 % i == 0) {
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
        var num = rdmDigits();
        var num2 = rdmDigits();
        var correctAnswer = Integer.toString(isGcd(num, num2));
        var question =  num + " " + num2;
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
