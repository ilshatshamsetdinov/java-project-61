package hexlet.code;

import hexlet.code.games.Game;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Engine {

    public static int rdmDigits() {
        final var limit = 100;
        return RandomUtils.nextInt(2, limit);
    }
    public static void launchGame(Game questionAndAnswer, Game task) {
        System.out.println("Welcome to the Brain Games! \nMay I have your name?");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();
        System.out.println("Hello, " + userName + "! \n");
        System.out.println(task.getTask());
        for (int i = 0; i < MAXROUND; i++) {
            var data = questionAndAnswer.getGameData();
            var question = data[0];
            var correctAnswer = data[1];
            System.out.println("Question: " + question);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", userName);
                break;
            }
            if (i == 2) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
    private static final int MAXROUND = 3;
}
