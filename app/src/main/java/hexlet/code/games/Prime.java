package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

import org.apache.commons.lang3.RandomUtils;

public class Prime {
    private static int digit;

    public static void isPrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        for (var x = 3; x > 0; x--) {
            digit = RandomUtils.nextInt(2, 100);
            System.out.println("Question: " + digit);
            var ans = scan.next();
            System.out.println("Your answer: " + ans);
            if ((ans.equals("yes") && numbPrime()) || (ans.equals("no") && !numbPrime())) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + Engine.userName + "!");
                }
            } else {
                if (ans.equals("yes")) {
                    System.out.println(ans + " is wrong answer ;(. Correct answer was 'no'."
                            + "\nLet's try again, " + Engine.userName);
                    break;
                } else {
                    System.out.println(ans + " is wrong answer ;(. Correct answer was 'yes'."
                            + "\nLet's try again, " + Engine.userName);
                    break;
                }
            }
        }
    }
    private static boolean numbPrime() {
        for (int i = 2; i < digit; i++) {
            if (digit % i == 0) {
                return false;
            }
        } return true;
    }
}
