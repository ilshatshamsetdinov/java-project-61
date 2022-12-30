package hexlet.code;

import java.util.Scanner;
import org.apache.commons.lang3.RandomUtils;
import static hexlet.code.games.Calc.itsCalc;
import static hexlet.code.games.Even.logicEven;
import static hexlet.code.games.GCD.gcd;
import static hexlet.code.games.Prime.isPrime;
import static hexlet.code.games.Progression.logicProgr;

public class Engine {
    public static void enter() {
        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet
                 2 - Even
                 3 - Calculator
                 4 - GCD
                 5 - Progression
                 6 - Prime
                 0 - Exit""");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        if (choice == 1) {
            greet();
            String userName = userNames();
            System.out.println("Hello, " + userName + "!");
        } else if (choice != 0) {
            greet();
            String userName = userNames();
            System.out.println("Hello, " + userName + "!");
            game(choice, userName);
        }
    }

    public static void game(int choice, String userName) {
        final var even = 2;
        final var calculate = 3;
        final var gcdd = 4;
        final var progresssion = 5;
        final var primee = 6;
        switch (choice) {

            case even -> logicEven(userName);

            case calculate -> itsCalc(userName);

            case gcdd -> gcd(userName);

            case progresssion -> logicProgr(userName);

            case primee -> isPrime(userName);

            default -> {
            }
        }
    }
    public static String userAnswer() {
        Scanner scana = new Scanner(System.in);
        return scana.next();
    }

    public static String userNames() {
        Scanner scana = new Scanner(System.in);
        return scana.next();
    }
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }

    public static final int MAXROUND = 3;
    public static int rdmDigits() {
        final var limit = 100;
        return RandomUtils.nextInt(2, limit);
    }
    public static void wrongAnswer(String answer, String correctAnswer, String userName) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
    public static boolean condition(String answer, String correctAnswer, String userName) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            wrongAnswer(answer, correctAnswer, userName);
            return true;
        }
        return false;
    }
}
