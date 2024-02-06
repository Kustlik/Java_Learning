package Zadanie1;

import java.io.Serializable;

public class Company implements Serializable {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Employee getEmployee(int i){
        return employees[i];
    }

    public void setEmployee(Employee employee, int i) {
        this.employees[i] = employee;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
