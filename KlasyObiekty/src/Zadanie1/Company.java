package Zadanie1;

public class Company
{
    public static void main(String[] args)
    {
        Employee emp1 = new Employee();
        emp1.name = "John";
        emp1.lastName = "Brick";
        emp1.seniority = "Junior";
        emp1.yearOfBirth = 1996;

        Employee emp2 = new Employee();
        emp2.name = "Bill";
        emp2.lastName = "Raid";
        emp2.seniority = "Mid";
        emp2.yearOfBirth = 1992;

        Employee emp3 = new Employee();
        emp3.name = "Jack";
        emp3.lastName = "Hard";
        emp3.seniority = "Senior";
        emp3.yearOfBirth = 1989;

        System.out.println("Pracownik: " + emp1.name + " " + emp1.lastName + ", poziom: " + emp1.seniority +
                ", rok urodzenia: " + emp1.yearOfBirth);
        System.out.println("Pracownik: " + emp2.name + " " + emp2.lastName + ", poziom: " + emp2.seniority +
                ", rok urodzenia: " + emp2.yearOfBirth);
        System.out.println("Pracownik: " + emp3.name + " " + emp3.lastName + ", poziom: " + emp3.seniority +
                ", rok urodzenia: " + emp3.yearOfBirth);
    }
}
