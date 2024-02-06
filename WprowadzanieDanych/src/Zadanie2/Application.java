package Zadanie2;

import java.util.Random;
import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(
                """
                Wybierz jedną z dwóch opcji\s
                1 - orzeł\s
                0 - reszka
                """);

        int input = scanner.nextInt();
        scanner.nextLine();

        int result = random.nextInt(2);

        String resultToText = switch (result)
        {
            case 0 -> "reszka";
            case 1 -> "orzeł";
            default ->  "błąd";
        };

        if (result == input)
            System.out.println("Brawo, wypadł " + resultToText + " i wygrywasz");
        else
            System.out.println("Niestety, wypadł " + resultToText + ", przegrywasz");
    }
}
