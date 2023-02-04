package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class Menu {
    private static final int GREET = 1;
    private static final int EVEN = 2;
    private static final int CALCULATE = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    public static void selectGame() {
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
        switch (choice) {
            case GREET -> Cli.greet();

            case EVEN -> {
                var gameData = new Even();
                Engine.launchGame(gameData);
            }
            case CALCULATE -> {
                var gameData = new Calc();
                Engine.launchGame(gameData);
            }

            case GCD -> {
                var gameData = new Gcd();
                Engine.launchGame(gameData);
            }

            case PROGRESSION -> {
                var gameData = new Progression();
                Engine.launchGame(gameData);
            }

            case PRIME -> {
                var gameData = new Prime();
                Engine.launchGame(gameData);
            }

            default -> {
                System.out.println("Invalid Operator");
                System.exit(1);
            }
        }
    }



}
