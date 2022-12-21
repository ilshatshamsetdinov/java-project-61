package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Engine;

import org.apache.commons.lang3.RandomUtils;

public class GCD {

    public static void isGcd() {
        System.out.println("Find the greatest common divisor of given numbers.");
        Scanner scan = new Scanner(System.in);
        for (var x = 3; x > 0; x--) {
            var digit1 = RandomUtils.nextInt(1, 100);
            var digit2 = RandomUtils.nextInt(1, 100);
            int gcd = 1;
            for (int i = 1; i <= digit1 && i <= digit2; i++) {
                if (digit1 % i == 0 && digit2 % i == 0) {
                    gcd = i;
                }
            }
            System.out.println("Question: " + digit1 + " " + digit2);
            var ans = scan.next();
            System.out.println("Your answer: " + ans);
            if (ans.equals(Integer.toString(gcd))) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + Engine.userName + "!");
                }
            } else {
                System.out.println(ans + " is wrong answer ;(. Correct answer was " + gcd
                        + "." + "\nLet's try again, " + Engine.userName);
                break;
            }
        }
    }
}











