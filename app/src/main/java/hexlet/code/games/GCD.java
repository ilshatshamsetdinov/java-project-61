package hexlet.code.games;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.rdmDigits;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class GCD {
    public static int isGcd(int digit, int digit2) {
        int gcd = 1;
        for (int i = 1; i <= digit && i <= digit2; i++) {
            if (digit % i == 0 && digit2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void gcd(String userName) {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < MAXROUND; i++) {
            var digit = rdmDigits();
            var digit2 = rdmDigits();
            var correctAnswer = Integer.toString(isGcd(digit, digit2));
            System.out.println("Question: " + digit + " " + digit2);
            var answer = userAnswer();
            if (condition(answer, correctAnswer, userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
