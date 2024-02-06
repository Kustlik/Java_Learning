package Zadanie1;

public class Calculator
{
    double Add(double a, double b)
    {
        return a + b;
    }

    double Add(double a, double b, double c)
    {
        return  Add(a, b) + c;
    }

    double Add(double a, double b, double c, double d)
    {
        return  Add(a, b, c) + d;
    }

    double Add(double a, double b, double c, double d, double e)
    {
        return  Add(a, b, c, d) + e;
    }

    double Subtract(double a, double b)
    {
        return a - b;
    }

    double Subtract(double a, double b, double c)
    {
        return  Subtract(a, b) - c;
    }

    double Subtract(double a, double b, double c, double d)
    {
        return  Subtract(a, b, c) - d;
    }

    double Subtract(double a, double b, double c, double d, double e)
    {
        return  Subtract(a, b, c, d) - e;
    }
}
