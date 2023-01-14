package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public final class Progression implements Game {

    @Override
    public String getTask() {
        return "What number is missing in the progression?";
    }

    @Override
    public String[] getGameData() {
        int progressionLength = RandomUtils.nextInt(MINLIMIT, MAXLIMIT);
        String[] progressionArray = new String[progressionLength];
        for (var i = 0; i < progressionArray.length; i++) {
            progressionArray[i] = Integer.toString(FIRST + STEP * i);
        }
        int randomIndex = RandomUtils.nextInt(0, progressionArray.length);
        var hiddenNumber = progressionArray[randomIndex];
        progressionArray[randomIndex] = "..";
        var correctAnswer = hiddenNumber;
        var question = String.join(" ", progressionArray);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
    private static final int FIRSTLIMIT = 50;
    private static final int STEPLIMIT = 10;
    private static final int FIRST = RandomUtils.nextInt(1, FIRSTLIMIT);
    private static final int STEP = RandomUtils.nextInt(1, STEPLIMIT);
    private static final int MINLIMIT = 5;
    private static final int MAXLIMIT = 10;
}
