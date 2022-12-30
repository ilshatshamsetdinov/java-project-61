package hexlet.code.games;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.rdmDigits;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class Prime {
    private static boolean numbPrime(int digit) {
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isPrime(String userName) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < MAXROUND; i++) {
            var digit = rdmDigits();
            System.out.println("Question: " + digit);
            var answer = userAnswer();
            var correctAnswer = numbPrime(digit) ? "yes" : "no";
            if (condition(answer, correctAnswer, userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

