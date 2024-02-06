package Zadanie1;

public class CalcTest
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println(calc.Add(3, 6));
        System.out.println(calc.Add(3, 6, 12));
        System.out.println(calc.Add(3, 6, 12, 2));
        System.out.println(calc.Add(3, 6, 12, 2, 5));

        System.out.println(calc.Subtract(3, 6));
        System.out.println(calc.Subtract(3, 6, 12));
        System.out.println(calc.Subtract(3, 6, 12, 2));
        System.out.println(calc.Subtract(3, 6, 12, 2, 5));
    }
}
