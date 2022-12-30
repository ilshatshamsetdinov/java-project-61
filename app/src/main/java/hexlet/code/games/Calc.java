package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.MAXROUND;
import static hexlet.code.Engine.rdmDigits;
import static hexlet.code.Engine.userAnswer;
import static hexlet.code.Engine.condition;

public class Calc {
    public static void itsCalc(String userName) {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < MAXROUND; i++) {
            final var arraylength = 3;
            rdmDigits();
            String[] examples = new String[arraylength];
            var digit = rdmDigits();
            var digit2 = rdmDigits();
            examples[0] = digit + " + " + digit2;
            examples[1] = digit + " - " + digit2;
            examples[2] = digit + " * " + digit2;
            int rdmIndex = RandomUtils.nextInt(0, 2);
            int[] intExample = new int[arraylength];
            intExample[0] = digit + digit2;
            intExample[1] = digit - digit2;
            intExample[2] = digit * digit2;
            System.out.println("Question: " + String.join(" ", examples[rdmIndex]));
            var correctAnswer = Integer.toString(intExample[rdmIndex]);
            var answer = userAnswer();
            if (condition(answer, correctAnswer, userName)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
