package worker;

import levels.LevelOfExperience;
import util.RandomUtil;

public class Plumber extends Worker {


    public final int WORKING_CHANCE = 80;

    public Plumber(String name, int dailyFee, LevelOfExperience level) {
        super(name, dailyFee, level);
    }

    @Override
    public boolean isWorkingDay() {
        RandomUtil random = new RandomUtil();
        boolean chance = random.chanceOfWorking(WORKING_CHANCE);
        workingDay = chance;
        return chance;
    }


}
