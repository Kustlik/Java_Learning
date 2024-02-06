package Zadanie2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    static int count = 1;

    public static void main(String[] args) {
        String word1 = inputWord();
        String word2 = inputWord();

        System.out.println("Podane wyrazy są złożone z " + (compareWords(word1, word2) ? "tych samych liter" :
                "różnych liter"));
    }

    public static String inputWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj napis " + count + ":");
        return scanner.nextLine();
    }

    public static Boolean compareWords(String word1, String word2){
        if (word1 == null && word2 == null)
            return true;
        if (word1 == null || word2 == null || word1.length() != word2.length())
            return false;

        char[] word1Array = word1.toLowerCase().toCharArray();
        char[] word2Array = word2.toLowerCase().toCharArray();
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        return Arrays.equals(word1Array, word2Array);
    }
}


