package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Menu {
    public static void selectGame() {
        showMenu();
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case GREET -> Cli.greet();

            case EVEN -> {
                var task = new Even();
                var questionAndAnswer = new Even();
                Engine.launchGame(questionAndAnswer, task);
            }
            case CALCULATE -> {
                var task = new Calc();
                var questionAndAnswer = new Calc();
                Engine.launchGame(questionAndAnswer, task);
            }

            case GCDD -> {
                var task = new Gcd();
                var questionAndAnswer = new Gcd();
                Engine.launchGame(questionAndAnswer, task);
            }

            case PROGRESSSION -> {
                var task = new Progression();
                var questionAndAnswer = new Progression();
                Engine.launchGame(questionAndAnswer, task);
            }

            case PRIMEE -> {
                var task = new Prime();
                var questionAndAnswer = new Prime();
                Engine.launchGame(questionAndAnswer, task);
            }

            default -> {
                System.out.println("Invalid Operator");
                System.exit(1);
            }
        }
    }
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALCULATE = 3;
    private static final int GCDD = 4;
    private static final int PROGRESSSION = 5;
    private static final int PRIMEE = 6;
    private static void showMenu() {
        System.out.println("""
                Please enter the game number and press Enter.
                 1 - Greet
                 2 - Even
                 3 - Calculator
                 4 - GCD
                 5 - Progression
                 6 - Prime
                 0 - Exit""");
    }

}
