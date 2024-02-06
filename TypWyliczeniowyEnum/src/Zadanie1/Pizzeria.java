package Zadanie1;

import java.util.Scanner;

public class Pizzeria
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę wybrać pizzę");
        for (Pizza pizza : Pizza.values())
            System.out.println(pizza.ordinal() + " - " + pizza);

        Pizza pizza = Pizza.valueOf(scanner.nextLine());

        System.out.println("Zamówiono pizze: " + pizza);
    }
}
