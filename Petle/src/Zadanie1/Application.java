package Zadanie1;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int howManyNumbers = input.nextInt();
        int sum = 0;

        for(int i=0; i < howManyNumbers; i++)
            sum += input.nextInt();
        input.nextLine();

        System.out.println(sum);
    }
}
