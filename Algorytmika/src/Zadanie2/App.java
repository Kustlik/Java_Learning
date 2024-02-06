package Zadanie2;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int index = 0;
        int multi = 1;
        int next = 0;

        for(int index = 0; index < 5; index++)
        {
            next = scanner.nextInt();
            multi *= next;
        }

        if(multi >= 0)
            System.out.println("Nieujemna");
        else
            System.out.println("Ujemna");
    }
}
