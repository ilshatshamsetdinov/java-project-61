package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;

public class Even {
    public static void isEven() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner scan = new Scanner(System.in);
        var name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var x = 3; x > 0; x--) {
            var digit = RandomUtils.nextInt(1, 1000);
            System.out.println("Question: " + digit);
            var name1 = scan.next();
            System.out.println("Your answer: " + name1);
            if ((digit % 2 == 0 && name1.equals("yes")) || (digit % 2 != 0 && name1.equals("no"))) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                if (name1.equals("yes")) {
                    System.out.println(name1 + " is wrong answer ;(. Correct answer was 'no'. \nLet's try again, " + name);
                    break;
                } else {
                    System.out.println(name1 + " is wrong answer ;(. Correct answer was 'yes'. \nLet's try again, " + name);
                    break;
                }
            }
        }
    }
}
