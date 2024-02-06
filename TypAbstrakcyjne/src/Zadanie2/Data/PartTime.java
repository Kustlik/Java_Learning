package Zadanie2.Data;

public class PartTime extends Worker {
    double hourlyRate;
    double workingHoursInMonth;

    public PartTime(String firstName, String lastName, double hourlyRate, double workingHoursInMonth) {
        super(firstName, lastName);
        this.hourlyRate = hourlyRate;
        this.workingHoursInMonth = workingHoursInMonth;
        calculateMonthlySalary();
        calculateYearlySalary();
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getWorkingHoursInMonth() {
        return workingHoursInMonth;
    }

    public void setWorkingHoursInMonth(double workingHoursInMonth) {
        this.workingHoursInMonth = workingHoursInMonth;
    }

    @Override
    void calculateMonthlySalary() {
        setSalaryPerMonth(hourlyRate * workingHoursInMonth);
    }

    @Override
    void calculateYearlySalary() {
        setSalaryPerYear(hourlyRate * workingHoursInMonth * DAYS_OF_YEAR);
    }
}
