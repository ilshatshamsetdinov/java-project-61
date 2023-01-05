package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public final class Progression implements Game {

    @Override
    public String getTask() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getGameData() {
        final var firstlimit = 50;
        final var steplimit = 10;
        int first = RandomUtils.nextInt(1, firstlimit);
        int step = RandomUtils.nextInt(1, steplimit);
        final var minlimit = 5;
        final var maxlimit = 10;
        int progressionLength = RandomUtils.nextInt(minlimit, maxlimit);
        String[] progressionArray = new String[progressionLength];
        for (var i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = Integer.toString(first + step * i);
        }
        int randomIndex = RandomUtils.nextInt(0, progressionArray.length);
        var hiddenNumber = progressionArray[randomIndex];
        progressionArray[randomIndex] = "..";
        var correctAnswer = hiddenNumber;
        var question = "Question: " + String.join(" ", progressionArray);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}
