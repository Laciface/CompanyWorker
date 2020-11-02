package worker;

import levels.LevelOfExperience;
import util.RandomUtil;

public class GasFitter extends DangerousWorker {
    public GasFitter(String name, int dailyFee, LevelOfExperience level) {
        super(name, dailyFee, level);
    }


    public final int WORKING_CHANCE = 65;

    @Override
    public boolean isWorkingDay() {
        boolean holiday = isHoliday();
        RandomUtil random = new RandomUtil();
        boolean chance = random.chanceOfWorking(WORKING_CHANCE);
        workingDay = chance && holiday;
        return workingDay;
    }

}
