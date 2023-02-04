package hexlet.code.games;


import static hexlet.code.utils.RandomNumberUtils.rdmDigits;

public final class Even implements Game {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    @Override
    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    @Override
    public String[] getGameData() {
        var num = rdmDigits();
        var correctAnswer = isEven(num) ? "yes" : "no";
        var question = Integer.toString(num);
        String[] questionAndAnswer = {question, correctAnswer};
        return questionAndAnswer;
    }
}

