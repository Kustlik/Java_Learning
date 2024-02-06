package Zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        double number1 = inputDouble();
        String Operator = inputOperator();
        double number2 = inputDouble();

        switch(Operator)
        {
            case "+" -> add(number1, number2);
            case "-" -> subtract(number1, number2);
            case "*" -> multiply(number1, number2);
            case "/" -> divide(number1, number2);
        }
    }

    static double inputDouble()
    {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        double result = 0;
        do {
            try
            {
                System.out.println("Podaj liczbę");
                result = scanner.nextDouble();
                error = true;
            }
            catch (InputMismatchException e)
            {
                System.err.println("Podaj prawidłową liczbę");
                e.printStackTrace();
            }
            finally {
                scanner.nextLine();
            }
        }
        while(!error);
        return result;
    }

    static String inputOperator()
    {
        Scanner scanner = new Scanner(System.in);
        boolean error = false;
        String result = "";
        do {
            try
            {
                System.out.println("Podaj Operator +, -, * lub /");
                result = scanner.nextLine();
                if(!result.equals("+") &&
                    !result.equals("-") &&
                    !result.equals("*") &&
                    !result.equals("/"))
                    throw new UnknownOperatorException("Podaj prawidłowy operator +, -, * lub /");
                error = true;
            }
            catch (UnknownOperatorException e)
            {
                System.err.println("Wprowadzono inną wartość niż +, -, * lub /");
                e.printStackTrace();
            }
        }
        while(!error);
        return result;
    }

    static double add(double number1, double number2)
    {
        System.out.println(number1 + number2);
        return number1 + number2;
    }

    static double subtract(double number1, double number2)
    {
        System.out.println(number1 - number2);
        return number1 - number2;
    }

    static double multiply(double number1, double number2)
    {
        System.out.println(number1 * number2);
        return number1 * number2;
    }

    static double divide(double number1, double number2)
    {
        if (number2 == 0)
            throw new ArithmeticException();
        System.out.println(number1 / number2);
        return number1 / number2;
    }
}
