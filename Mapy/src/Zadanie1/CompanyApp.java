package Zadanie1;

import java.util.HashMap;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company(new HashMap<>());

        int option;
        do {
            showMenu();
            option = getInt();
            switch (option){
                case 0 -> System.out.println("Koniec programu");
                case 1 -> company.add(createEmployee());
                case 2 -> company.lookFor(find());
            }
        } while (option != 0);
        System.out.println("Wyjście z programu");
    }

    static void showMenu(){
        System.out.println(
                """
                Wybierz jedną z opcji:
                0 - wyjście z programu
                1 - Dodaj pracownika
                2 - Znajdź pracownika
                """);
    }

    static Employee createEmployee(){
        System.out.println("Podaj dane pracownika");
        System.out.println("Podaj imię:");
        String firstName = getString();
        System.out.println("Podaj nazwisko:");
        String lastName = getString();
        System.out.println("Podaj zarobki:");
        double salary = getDouble();

        return new Employee(firstName, lastName, salary);
    }

    static String find(){
        System.out.println("Podaj dane pracownika");
        System.out.println("Podaj imię:");
        String firstName = getString();
        System.out.println("Podaj nazwisko:");
        String lastName = getString();

        return firstName + " " + lastName;
    }

    static int getInt(){
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    static double getDouble(){
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        scanner.nextLine();
        return result;
    }

    static String getString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
