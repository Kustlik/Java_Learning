package Zadanie1;

public class Calculate
{
    public static void main(String[] args)
    {
        double a = 5.7;
        double b = 2.4;

        var calc = new Calculator();

        System.out.println("Add " + a + " and " + b + ", result is: " + calc.add(a, b));
        System.out.println("Subtract " + a + " and " + b + ", result is: " + calc.subtract(a, b));
        System.out.println("Multiply " + a + " and " + b + ", result is: " + calc.multiply(a, b));
        System.out.println("Divide " + a + " and " + b + ", result is: " + calc.divide(a, b));
    }
}
