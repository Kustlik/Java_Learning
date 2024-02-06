package Zadanie1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        int input = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[input];
        for(int i=0; i < input; i++)
        {
            words[i] = scanner.nextLine();
            stringBuilder.append(words[i].substring(words[i].length() - 1));
        }

        String combinedWord = stringBuilder.toString();

        for(String word: words)
            System.out.println(word);
        System.out.println(combinedWord);
    }
}
