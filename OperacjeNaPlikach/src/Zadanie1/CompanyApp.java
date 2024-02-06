package Zadanie1;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CompanyApp {
    final static String EMPLOYEE_FILE = "Company.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Option = 0;

        do {
            showMenu();
            Option = scanner.nextInt();
            switch (Option) {
                case 0 -> System.out.println("Koniec programu");
                case 1 -> writeCompany(scanner);
                case 2 -> readCompany();
                default -> throw new NoSuchElementException("Wybrano złą opcję");
            }
        } while (Option != 0);
    }

    static void showMenu() {
        System.out.println(
                """
                Wybierz jedną z poniższych opcji:
                0 - Wyjście z programu
                1 - Wprowadź dane o użytkowniku i zapisz je na dysku.
                2 - Odczytaj dane z dysku i wyświetl je.
                """
        );
    }

    static void writeCompany(Scanner scanner){
        scanner.nextLine();
        Company company = new Company(new Employee[3]);
        for (int i = 0; i < company.getEmployees().length; i++)
        {
            System.out.println("Podaj kolejno, imię, nazwisko, wysokość wypłaty");
            company.setEmployee(new Employee(scanner.nextLine(), scanner.nextLine(), scanner.nextDouble()), i);
            scanner.nextLine();
        }

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(EMPLOYEE_FILE);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                )
        {
            objectOutputStream.writeObject(company);
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException e){
            System.err.println("Nie udało się zapisać pliku " + EMPLOYEE_FILE);
            e.printStackTrace();
        }
    }

    static void readCompany(){
        System.out.println("Wczytywanie osoby z pliku");
        Company company = null;
        try (
                FileInputStream fileInputStream = new FileInputStream(EMPLOYEE_FILE);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        )
        {
            company = (Company) objectInputStream.readObject();
            System.out.println("Odczytano obiekt z pliku");
        } catch (IOException | ClassNotFoundException e){
            System.err.println("Nie udało się wczytać pliku " + EMPLOYEE_FILE);
            e.printStackTrace();
        }

        for(Employee employee: company.getEmployees())
        {
            if (employee != null)
                System.out.println("Wczytano dane o: " + employee.getFirstName() + " " + employee.getLastName() + ", zarobki: " + employee.getSalary());
        }

    }
}
