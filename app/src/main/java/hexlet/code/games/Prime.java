package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;

import static hexlet.code.Engine.maxRound;

public class Prime {
    private static boolean numbPrime() {
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        } return true;
    }
    public static void isPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (var i = 0; i < maxRound; i++) {
            rdmDigits();
            System.out.println("Question: " + digit);
            answer();
            var correctAnswer = numbPrime() ? "yes" : "no";
            if (ans.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                wrongAnswer(ans, correctAnswer);
                return;
                }
            }
        System.out.println("Congratulations, " + Engine.userName + "!");
        }
    }
