package util;

import java.util.Random;

public class RandomUtil {

    public boolean chanceOfWorking(int chance) {
        Random random = new Random();
        return random.nextInt(101) < chance;

    }

    public boolean isItAHoliday(int holiday) {
        Random random = new Random();
        return random.nextInt(30) < holiday;
    }
}
