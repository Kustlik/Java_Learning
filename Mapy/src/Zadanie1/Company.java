package Zadanie1;

import java.util.HashMap;

public class Company {
    private HashMap<String, Employee> employees = new HashMap<>();

    public Company(HashMap<String, Employee> employees) {
        this.employees = employees;
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashMap<String, Employee> employees) {
        this.employees = employees;
    }

    public void add(Employee employee){
        if(employees.containsKey(employee.getFirstName() + " " + employee.getLastName()))
            System.out.println("Pracownik istnieje już w bazie danych");
        else
            employees.put((employee.getFirstName() + " " + employee.getLastName()), employee);
    }

    public void lookFor(String employee){
        if(employees.containsKey(employee))
            System.out.println(employees.get(employee));
        else
            System.out.println("Nie ma takiego pracownika w bazie");
    }
}
