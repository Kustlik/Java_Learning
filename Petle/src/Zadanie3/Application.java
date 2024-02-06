package Zadanie3;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj temperaturę aktualną");
        double tempCurrent = scanner.nextDouble();

        System.out.println("Podaj temperaturę docelową");
        double tempTarget = scanner.nextDouble();

        if(tempCurrent < tempTarget)
            tempCurrent = increaseTemp(tempCurrent, tempTarget);
        else if (tempCurrent > tempTarget)
            tempCurrent = decreaseTemp(tempCurrent, tempTarget);

        if(tempCurrent == tempTarget)
            System.out.println("Osiągnięto temperaturę docelową " + tempTarget + " stopni");
    }

    static double increaseTemp(double tempCurrent,double tempTarget)
    {
        while (tempCurrent < tempTarget)
        {
            System.out.println("Aktualna temperatura: " + tempCurrent);
            tempCurrent += 0.5;
        }
        return tempCurrent;
    }

    static double decreaseTemp(double tempCurrent,double tempTarget)
    {
        while (tempCurrent > tempTarget)
        {
            System.out.println("Aktualna temperatura: " + tempCurrent);
            tempCurrent -= 0.5;
        }
        return tempCurrent;
    }
}
