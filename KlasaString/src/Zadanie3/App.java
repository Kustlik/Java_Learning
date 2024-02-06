package Zadanie3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz dowolny tekst:");
        String input = scanner.nextLine();
        String result = "";
        if (Character.isUpperCase(input.charAt(0)))
            result = input.toUpperCase();
        else if (Character.isLowerCase(input.charAt(0)))
            result = input.toLowerCase();
        else result = input;

        System.out.println("Tekst po transformacji:");
        System.out.println(result);
    }
}
