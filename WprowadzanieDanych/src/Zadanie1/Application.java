package Zadanie1;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double number1 = scanner.nextDouble();
        scanner.nextLine();
        String symbol = scanner.nextLine();
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Wynik to: " + calculator.calculate(number1, number2, symbol));
    }
}