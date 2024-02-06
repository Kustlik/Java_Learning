package Zadanie2.pl.javastart.factory;

public class Factory
{
    public void showInfo(int number)
    {
        if (number < 5_000)
            System.out.println("Liczba " + number + " jest mniejsza od 5 000");
        else if (number == 5_000)
            System.out.println("Liczba " + number + " jest równa 5 000");
        else if (number > 5_000)
            System.out.println("Liczba " + number + " jest większa od 5 000");

        if (number % 2 == 0)
            System.out.println("Liczba " + number + " jest liczbą parzystą");
        else
            System.out.println("Liczba " + number + " jest liczbą nieparzystą");
    }

    public int correctNumber(int number)
    {
        int newNumber;

        if (number >= 1000)
            return number;
        else if (number >= 100)
            newNumber = number * 10;
        else if (number >= 10)
            newNumber = number * 100;
        else if (number >= 1)
            newNumber = number * 1000;
        else if (number == 0)
            return 0;
        else {
            System.out.println("Zła liczba");
            return 0;
        }

        System.out.println("Liczba została poprawiona, nowa wartość: " + newNumber);
        return newNumber;
    }
}
