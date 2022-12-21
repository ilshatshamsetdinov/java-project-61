package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

public class Engine {
    public static void enter() {
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even "
                + "\n 3 - Calculator \n 4 - GCD \n 5 - Progression \n 6 - Prime \n 0 - Exit");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("Your choice: " + choice);
        switch (choice) {
            case 0:
                break;
            case 1:
                greet();
                break;
            case 2:
                greet();
                Even.isEven();
                break;
            case 3:
                greet();
                Calc.itsCalc();
                break;
            case 4:
                greet();
                GCD.isGcd();
                break;
            case 5:
                greet();
                Progression.isProgression();
                break;
            case 6:
                greet();
                Prime.isPrime();
                break;
            default:
                break;
        }
    }

    public static String userName;
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        userName = scan.next();
        System.out.println("Hello, " + userName + "!");
    }
}
