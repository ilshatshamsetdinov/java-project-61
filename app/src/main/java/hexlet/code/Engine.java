package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;
import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.games.Even.logicEven;

public class Engine {
    public static void enter() {
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even "
                + "\n 3 - Calculator \n 4 - GCD \n 5 - Progression \n 6 - Prime \n 0 - Exit");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);

        final var Greeting = 1;
        final var Even = 2;
        final var Calculate = 3;
        final var Gcdd = 4;
        final var Progresssion = 5;
        final var Primee = 6;

        switch (choice) {
            case Greeting -> greet();
            case Even -> {
                greet();
                logicEven();
            }
            case Calculate -> {
                greet();
                Calc.itsCalc();
            }
            case Gcdd -> {
                greet();
                GCD.gcd();
            }
            case Progresssion -> {
                greet();
                Progression.logicProgr();
            }
            case Primee -> {
                greet();
                Prime.isPrime();
            }
            default -> {
            }
        }
    }


    public static String answer;

    public static void answer() {
        Scanner scana = new Scanner(System.in);
        answer = scana.next();
        System.out.println("Your answer: " + answer);
    }

    public static String userName;

    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        userName = scan.next();
        System.out.println("Hello, " + userName + "!");
    }

    public static final int MAXROUND = 3;
    public static int digit;
    public static int digit2;

    public static void rdmDigits() {
        final var LIMIT = 100;
        digit = RandomUtils.nextInt(2, LIMIT);
        digit2 = RandomUtils.nextInt(2, LIMIT);
    }
    public static void wrongAnswer(String correctAnswer) {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\n", answer, correctAnswer);
        System.out.printf("Let's try again, %s!\n", userName);
    }
    public static boolean condition(String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            wrongAnswer(correctAnswer);
            return true;
        }
        return false;
    }
}
