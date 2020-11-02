package app;

import company.Company;
import levels.LevelOfExperience;
import worker.Plumber;
import worker.Worker;

public class Main {
    public static void main(String[] args){
        Company company = new Company();
        Worker first = new Plumber("Laci", 10000, LevelOfExperience.EXPERT);
        company.hireWorker(first);
        System.out.println(company.calculateProfit());
    }
}
