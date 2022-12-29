package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class GCD {
    public static int isGcd() {
        int gcd = 1;
        for (int i = 1; i <= digit && i <= digit2; i++) {
            if (digit % i == 0 && digit2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void gcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < MAXROUND; i++) {
            rdmDigits();
            var correctAnswer = Integer.toString(isGcd());
            System.out.println("Question: " + digit + " " + digit2);
            answer();
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
    }
}
