package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;

import static hexlet.code.Engine.MAXROUND;

public class Prime {
    private static boolean numbPrime() {
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < MAXROUND; i++) {
            rdmDigits();
            System.out.println("Question: " + digit);
            answer();
            var correctAnswer = numbPrime() ? "yes" : "no";
            if (condition(correctAnswer)) {
                return;
            }
            System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
}

