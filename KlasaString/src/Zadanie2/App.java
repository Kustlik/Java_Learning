package Zadanie2;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Wcisnij enter by rzucic kostką");
        scanner.nextLine();

        do {
            switch(random.nextInt(1,7))
            {
                case 1 -> printOne();
                case 2 -> printTwo();
                case 3 -> printThree();
                case 4 -> printFour();
                case 5 -> printFive();
                case 6 -> printSix();
            }
        } while (!scanner.nextLine().equals("q"));
    }

    static void printOne()
    {
        String dice =
                """
                 -----
                |     |
                |  O  |
                |     |
                 -----
                """;
        System.out.println(dice);
    }

    static void printTwo()
    {
        String dice =
                """
                 -----
                |    O|
                |     |
                |O    |
                 -----
                """;
        System.out.println(dice);
    }

    static void printThree()
    {
        String dice =
                """
                 -----
                |    O|
                |  O  |
                |O    |
                 -----
                """;
        System.out.println(dice);
    }

    static void printFour()
    {
        String dice =
                """
                 -----
                |O   O|
                |     |
                |O   O|
                 -----
                """;
        System.out.println(dice);
    }

    static void printFive()
    {
        String dice =
                """
                 -----
                |O   O|
                |  O  |
                |O   O|
                 -----
                """;
        System.out.println(dice);
    }

    static void printSix()
    {
        String dice =
                """
                 -----
                |O   O|
                |O   O|
                |O   O|
                 -----
                """;
        System.out.println(dice);
    }
}
