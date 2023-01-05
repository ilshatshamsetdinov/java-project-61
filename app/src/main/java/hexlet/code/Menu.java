package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Menu {
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
    }
    public static void game() {
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        final int greet = 1;
        final int even = 2;
        final int calculate = 3;
        final int gcdd = 4;
        final int progresssion = 5;
        final int primee = 6;
        switch (choice) {
            case greet -> Cli.greet();

            case even -> {
                greeting();
                Scanner scana = new Scanner(System.in);
                String userName = scana.next();
                greetingEnd(userName);
                var task = new Even();
                var getTask = task.getTask();
                var questionAndAnswer = new Even();
                Engine.doGame(userName, questionAndAnswer, getTask);
            }
            case calculate -> {
                greeting();
                Scanner scana = new Scanner(System.in);
                String userName = scana.next();
                greetingEnd(userName);
                var task = new Calc();
                var getTask = task.getTask();
                var questionAndAnswer = new Calc();
                Engine.doGame(userName, questionAndAnswer, getTask);
            }

            case gcdd -> {
                greeting();
                Scanner scana = new Scanner(System.in);
                String userName = scana.next();
                greetingEnd(userName);
                var task = new Gcd();
                var questionAndAnswer = new Gcd();
                var getTask = task.getTask();
                Engine.doGame(userName, questionAndAnswer, getTask);
            }

            case progresssion -> {
                greeting();
                Scanner scana = new Scanner(System.in);
                String userName = scana.next();
                greetingEnd(userName);
                var task = new Progression();
                var questionAndAnswer = new Progression();
                var getTask = task.getTask();
                Engine.doGame(userName, questionAndAnswer, getTask);
            }

            case primee -> {
                greeting();
                Scanner scana = new Scanner(System.in);
                String userName = scana.next();
                greetingEnd(userName);
                var task = new Prime();
                var questionAndAnswer = new Prime();
                var getTask = task.getTask();
                Engine.doGame(userName, questionAndAnswer, getTask);
            }

            default -> {
            }
        }
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }
    public static void greetingEnd(String userName) {
        System.out.println("Hello, " + userName + "!");
        System.out.println();
    }
}
