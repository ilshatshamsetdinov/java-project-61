package hexlet.code.games;

import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Scanner scan = new Scanner(System.in);
        for (var x = 3; x > 0; x--) {
            var digit = RandomUtils.nextInt(1, 1000);
            System.out.println("Question: " + digit);
            var ans = scan.next();
            System.out.println("Your answer: " + ans);
            if ((digit % 2 == 0 && ans.equals("yes")) || (digit % 2 != 0 && ans.equals("no"))) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + Engine.userName + "!");
                }
            } else {
                if (ans.equals("yes")) {
                    System.out.println("'" + ans + "'" + " is wrong answer ;(. Correct answer was 'no'."
                            + "\nLet's try again, " + Engine.userName + "!");
                    break;
                } else {
                    System.out.println("'" + ans + "'" + " is wrong answer ;(. Correct answer was 'yes'."
                            + "\nLet's try again, " + Engine.userName + "!");
                    break;
                }
            }
        }
    }
}
