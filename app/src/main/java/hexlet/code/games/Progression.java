package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

import hexlet.code.Engine;

import org.apache.commons.lang3.RandomUtils;

public class Progression {
    public static void isProgression() {
        System.out.println("What number is missing in the progression?");
        Scanner scan = new Scanner(System.in);
        for (var x = 3; x > 0; x--) {
            var progressionLength = RandomUtils.nextInt(5, 10);
            var firstElement = RandomUtils.nextInt(1, 100);
            var step = RandomUtils.nextInt(1, 10);
            var rdmIndx = RandomUtils.nextInt(0, progressionLength);
            String[] example = new String[progressionLength];
            for (var i = 0; i < example.length; i++) {
                example[i] = Integer.toString(firstElement + step * i);
            }
            var hiddenNumber = example[rdmIndx];
            example[rdmIndx] = ".. ";
            System.out.println("Question: " + Arrays.toString(example));
            var ans = scan.next();
            System.out.println("Your answer: " + ans);
            if (ans.equals(hiddenNumber)) {
                System.out.println("Correct!");
                if (x == 1) {
                    System.out.println("Congratulations, " + Engine.userName + "!");
                }
            } else {
                System.out.println(ans + " is wrong answer ;(. Correct answer was " + hiddenNumber
                        + "." + "\nLet's try again, " + Engine.userName + "!");
                break;
            }
        }
    }
}









