package Zadanie2.Data;

public class FullTime extends Worker{
    double yearlyBonus = 1.05;
    double monthlyRate;

    public FullTime(String firstName, String lastName, double monthlyRate) {
        super(firstName, lastName);
        this.monthlyRate = monthlyRate;
        calculateMonthlySalary();
        calculateYearlySalary();
    }

    public double getYearlyBonus() {
        return yearlyBonus;
    }

    public void setYearlyBonus(double yearlyBonus) {
        this.yearlyBonus = yearlyBonus;
    }

    public void calculateMonthlySalary()
    {
        setSalaryPerMonth(monthlyRate);
    }

    @Override
    public void calculateYearlySalary() {
        setSalaryPerYear((DAYS_OF_YEAR * monthlyRate) * yearlyBonus);
    }
}
