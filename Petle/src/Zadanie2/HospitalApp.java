package Zadanie2;

import java.util.Scanner;

public class HospitalApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int input;

        do
        {
            showMenu();
            switch(input = scanner.nextInt())
            {
                case 0 -> System.out.println("Wyjście z programu");
                case 1 -> hospital.addPatient();
                case 2 -> hospital.showAllPatients();
            }
        }
        while(input != 0);
    }

    static void showMenu()
    {
        System.out.println(
                "Wybierz opcję:\n" +
                "0 - wyjście z programu\n" +
                "1 - dopisanie pacjenta\n" +
                "2 - wyświetlenie listy zapisanych pacjentów");
    }
}
