package worker;

import levels.LevelOfExperience;

public abstract class Worker {
    private String name;
    private int dailyFee;
    private LevelOfExperience level;
    protected boolean workingDay;

    public Worker(String name, int dailyFee, LevelOfExperience level) {
        this.name = name;
        this.dailyFee = dailyFee;
        this.level = level;
    }

    public abstract boolean isWorkingDay();

    public int getDailyFee() {
        return dailyFee;
    }

    public LevelOfExperience getLevel() {
        return level;
    }
}
