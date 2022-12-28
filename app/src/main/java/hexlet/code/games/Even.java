package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.*;

public class Even {
    public static boolean isEven() {
        return digit % 2 == 0;
    }
    public static void logicEven() {
        for (int i = 0; i < maxRound; i++) {
            rdmDigits();
            System.out.println("Question: " + digit);
            answer();
            var correctAnswer = isEven() ? "yes" : "no";
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
