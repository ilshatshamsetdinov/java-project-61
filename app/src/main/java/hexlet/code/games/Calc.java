package hexlet.code.games;
import hexlet.code.Engine;
import org.apache.commons.lang3.RandomUtils;
import java.util.Scanner;

import static hexlet.code.Engine.*;
import static hexlet.code.Engine.answer;

public class Calc {
    public static void itsCalc() {
        System.out.println("What is the result of the expression?");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < MAXROUND; i++) {
            rdmDigits();
            String[] examples = new String[3];
            examples[0] = digit + " + " + digit2;
            examples[1] = digit + " - " + digit2;
            examples[2] = digit + " * " + digit2;
            int rdmIndex = RandomUtils.nextInt(0, 2);
            int[] intExample = new int[3];
            intExample[0] = digit + digit2;
            intExample[1] = digit - digit2;
            intExample[2] = digit * digit2;
            System.out.println("Question: " + String.join(" ", examples[rdmIndex]));
            var correctAnswer = Integer.toString(intExample[rdmIndex]);
            answer();
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + Engine.userName + "!");
    }
}
