package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;

import static hexlet.code.Engine.answer;

public class Progression {
    private static int first;
    private static int step;
    private static String hiddenNumber;
    public static void logicProgr() {
        System.out.println("What number is missing in the progression?");
        for (var i = 0; i < MAXROUND; i++) {
            final var firstlimit = 50;
            final var steplimit = 10;
            first = RandomUtils.nextInt(1, firstlimit);
            step = RandomUtils.nextInt(1, steplimit);
            array();
            answer();
            var correctAnswer = hiddenNumber;
            if (condition(correctAnswer)) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void array() {
        final var minlimit = 5;
        final var maxlimit = 10;
        int progressionLength = RandomUtils.nextInt(minlimit, maxlimit);
        String[] progressionArray = new String[progressionLength];
        for (var i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = Integer.toString(first + step * i);
        }
        int randomIndex = RandomUtils.nextInt(0, progressionLength);
        hiddenNumber = progressionArray[randomIndex];
        progressionArray[randomIndex] = "..";
        System.out.println("Question: " + String.join(" ", progressionArray));
    }
}









