package company;

import levels.LevelOfExperience;
import worker.Plumber;
import worker.Worker;

import java.util.HashSet;
import java.util.Set;

public class Company {

    private Set<Worker> workers = new HashSet<>();

    public void hireWorker(Worker worker) {
        workers.add(worker);
    }

    public int calculateProfit() {
        int allIncome = 0;
        for (int i = 0; i < 89; i++) {
            for (Worker worker : workers) {
                if (worker.isWorkingDay()){
                    int income = worker.getDailyFee() * worker.getLevel().getIncome() / 100;
                    int cost = worker.getLevel().getExpenditure() / 30;
                    allIncome += income - cost;
                }
            }
        }

        return allIncome;}

}
