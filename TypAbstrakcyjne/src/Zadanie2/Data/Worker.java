package Zadanie2.Data;

abstract public class Worker {
    static final int DAYS_OF_YEAR = 12;
    private String firstName;
    private String lastName;
    private double salaryPerMonth = 0;
    private double salaryPerYear = 0;

    public Worker(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double getSalaryPerYear() {
        return salaryPerYear;
    }

    public void setSalaryPerYear(double salaryPerYear) {
        this.salaryPerYear = salaryPerYear;
    }

    abstract void calculateMonthlySalary();
    abstract void calculateYearlySalary();

    @Override
    public String toString() {
        return firstName + " " + lastName + ", wypłata miesięczna: " + getSalaryPerMonth() + ", wypłata roczna: " + getSalaryPerYear() ;
    }
}
