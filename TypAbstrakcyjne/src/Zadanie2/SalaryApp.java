package Zadanie2;

import Zadanie2.Data.FullTime;
import Zadanie2.Data.PartTime;
import Zadanie2.Data.Worker;

public class SalaryApp {
    static double monthlySalarySum = 0;
    static double yearlySalarySum = 0;

    public static void main(String[] args) {
        Worker[] workers =
                {
                        new FullTime("Jan", "Kowalski", 5000),
                        new PartTime("Anna", "Borowska", 80, 10)
                };
        for(Worker worker:workers){
            monthlySalarySum += worker.getSalaryPerMonth();
            yearlySalarySum += worker.getSalaryPerYear();
            System.out.println(worker);
        }
        System.out.println("Suma miesięcznych wynagrodzeń: " + monthlySalarySum);
        System.out.println("Suma rocznych wynagrodzeń: " + yearlySalarySum);
    }
}
