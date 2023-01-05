package hexlet.code;

import hexlet.code.games.Game;
import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

public class Engine {

    public static int rdmDigits() {
        final var limit = 100;
        return RandomUtils.nextInt(2, limit);
    }
    public static void doGame(String userName, Game questionAndAnswer, String getTask) {
        System.out.println(getTask);
        final int maxround = 3;
        for (int i = 0; i < maxround; i++) {
            var massive = questionAndAnswer.getGameData();
            var question = massive[0];
            var correctAnswer = massive[1];
            System.out.println(question);
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (checkAnswer(answer, correctAnswer, userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }

    public static boolean checkAnswer(String answer, String correctAnswer, String userName) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
            System.out.printf("Let's try again, %s!\n", userName);
            return true;
        }
        return false;
    }
}
