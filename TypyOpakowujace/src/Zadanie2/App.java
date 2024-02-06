package Zadanie2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int numberCount = 0;
        int letterCount =  0;
        int biggestNumber = 0;

        for(char c: text.toCharArray())
        {
            if(Character.isAlphabetic(c))
                letterCount++;
            else if(Character.isDigit(c)) {
                numberCount++;
                if (Integer.parseInt(Character.toString(c)) > biggestNumber)
                    biggestNumber = Integer.parseInt(Character.toString(c));
            }
        }
        System.out.println("Ilość liter: " + letterCount);
        System.out.println("Ilość liczb: " + numberCount);
        if (numberCount > 0)
            System.out.println("Największa liczba to: " + biggestNumber);
    }
}
