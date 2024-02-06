package Zadanie1;

public class Application
{
    public static void main(String[] args)
    {
        double[][] tab = {{1.0, 1.5, 2.0},{1.5, 2.0, 2.5}, {2.0, 2.5, 3.0}};

        System.out.println(task1(tab));
        System.out.println(task2(tab));
        System.out.println(task3(tab));
    }

    static double task1 (double[][] tab)
    {
        double number1 = tab[0][0] * tab[1][1] * tab[2][2];
        double number2 = tab[2][0] * tab[1][1] * tab[0][2];

        return number1 + number2;
    }

    static double task2 (double[][] tab)
    {
        double number1 = tab[0][1] + tab[1][1] + tab[2][1];
        double number2 = tab[1][0] + tab[1][1] + tab[1][2];

        return number1 * number2;
    }

    static double task3 (double[][] tab)
    {
        double number1 = tab[0][0] + tab[0][1] + tab[0][2];
        double number2 = tab[1][0] + tab[1][2];
        double number3 = tab[2][0] + tab[2][1] + tab[2][2];

        return number1 + number2 + number3;
    }
}
