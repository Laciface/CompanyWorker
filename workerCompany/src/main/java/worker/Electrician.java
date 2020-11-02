package worker;

import levels.LevelOfExperience;
import util.RandomUtil;

public class Electrician extends DangerousWorker {

    public final int WORKING_CHANCE = 90;

    public Electrician(String name, int dailyFee, LevelOfExperience level) {
        super(name, dailyFee, level);
    }

    @Override
    public boolean isWorkingDay() {
        boolean holiday = isHoliday();
        RandomUtil random = new RandomUtil();
        boolean chance = random.chanceOfWorking(WORKING_CHANCE);
        workingDay = chance && holiday;
        return workingDay;
    }
}
