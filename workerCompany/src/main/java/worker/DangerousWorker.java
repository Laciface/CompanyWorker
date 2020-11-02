package worker;

import levels.LevelOfExperience;
import util.RandomUtil;

public abstract class DangerousWorker extends Worker {
    public DangerousWorker(String name, int dailyFee, LevelOfExperience level) {
        super(name, dailyFee, level);
    }

    public boolean isHoliday(){
        RandomUtil random = new RandomUtil();
        final int HOLIDAY = 7;
        boolean holiday = random.isItAHoliday(HOLIDAY);
        return holiday;
    };
}
