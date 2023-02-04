package hexlet.code.utils;

import org.apache.commons.lang3.RandomUtils;

public class RandomNumberUtils {
    private static final int  LIMIT = 100;
    public static int rdmDigits() {
        return RandomUtils.nextInt(2, LIMIT);
    }
}
