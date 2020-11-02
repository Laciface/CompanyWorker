package levels;

public enum LevelOfExperience {
    BEGINNER (40, 50000),
    MEDIUM (30, 35000),
    EXPERT (20, 25000);

    private final int income;
    private final int expenditure;

    LevelOfExperience(int income, int expenditure) {
        this.income = income;
        this.expenditure = expenditure;
    }

    public int getIncome() {
        return income;
    }

    public int getExpenditure() {
        return expenditure;
    }
}
