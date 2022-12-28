package hexlet.code.games;

import java.util.Arrays;
import java.util.Scanner;

import hexlet.code.Engine;

import org.apache.commons.lang3.RandomUtils;

import static hexlet.code.Engine.*;
import static hexlet.code.Engine.ans;

public class Progression {
    private static int first;
    private static int step;
    private static String hiddenNumber;
    public static void logicProgr() {
        for (var i = 0; i < maxRound; i++) {
            first = RandomUtils.nextInt(1, 50);
            step = RandomUtils.nextInt(1, 10);
            array();
            answer();
            var correctAnswer = hiddenNumber;
            if (ans.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                wrongAnswer(ans, correctAnswer);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
    public static void array(){
        int progressionLength = RandomUtils.nextInt(5,10);
        String[] progressionArray = new String[progressionLength];
        for (var i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = Integer.toString(first + step * i);
        }
        int randomIndex = RandomUtils.nextInt(0, progressionLength);
        hiddenNumber = progressionArray[randomIndex];
        progressionArray[randomIndex] = "..";
        System.out.println("Question: " + String.join(" ",progressionArray));
    }
}









