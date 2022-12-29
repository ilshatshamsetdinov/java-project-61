package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class Even {
    public static boolean isEven() {
        return digit % 2 == 0;
    }
    public static void logicEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < MAXROUND; i++) {
            rdmDigits();
            System.out.println("Question: " + digit);
            answer();
            var correctAnswer = isEven() ? "yes" : "no";
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
    }
}
