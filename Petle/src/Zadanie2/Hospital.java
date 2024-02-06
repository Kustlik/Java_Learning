package Zadanie2;

import java.util.Scanner;

public class Hospital
{
    Scanner scanner = new Scanner(System.in);
    Patient[] patients = new Patient[10];
    int count = 0;

    void addPatient()
    {
        if(count < patients.length)
        {
            System.out.println("Podaj kolejno: Imię, Nazwisko, Pesel");
            Patient patient = new Patient(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());

            patients[count] = patient;
            count++;
        }
        else
            System.out.println("Za dużo pacjentów");
    }

    void showAllPatients()
    {
        System.out.println("Lista pacjentów:");
        for (Patient patient: patients)
            System.out.println(patient.getFirstName() + " | " + patient.getLastName() + " | " + patient.getPesel());
    }
}
