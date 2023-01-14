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
        greeting();
        Scanner scana = new Scanner(System.in);
        String userName = scana.next();
        greetingEnd(userName);
        var getTask = task.getTask();
        System.out.println(getTask);
        for (int i = 0; i < MAXROUND; i++) {
            var data = questionAndAnswer.getGameData();
            var question = data[0];
            var correctAnswer = data[1];
            var askQuestion = "Question: " + question;
            System.out.println(askQuestion);
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
                System.out.printf("Let's try again, %s!\n", userName);
                break;
            }
        }
    }
    private static final int MAXROUND = 3;
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }
    public static void greetingEnd(String userName) {
        System.out.println("Hello, " + userName + "!");
        System.out.println();
    }
}
