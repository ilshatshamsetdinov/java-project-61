package hexlet.code.games;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.rdmDigits;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;


public class Even {
    public static boolean isEven(int digit) {
        return digit % 2 == 0;
    }
    public static void logicEven(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < MAXROUND; i++) {
            var digit = rdmDigits();
            System.out.println("Question: " + digit);
            var answer = userAnswer();
            System.out.println("Your answer: " + answer);
            var correctAnswer = isEven(digit) ? "yes" : "no";
            if (condition(answer, correctAnswer, userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
