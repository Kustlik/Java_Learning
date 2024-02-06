package Zadanie1;

public class Calculator
{
    public double calculate(double a, double b, String operator)
    {
        return switch(operator)
        {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / b;
            case "*" -> a * b;
            default -> 0;
        };
    }
}
