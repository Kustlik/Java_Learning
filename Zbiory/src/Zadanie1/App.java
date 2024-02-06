package Zadanie1;

import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class App {
    private static final String FILE_NAME = "namespl.txt";

    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -s1.compareToIgnoreCase(s2);
            }
        });

        try (Scanner scanner = new Scanner(new File(FILE_NAME))){
            while(scanner.hasNextLine()){
                names.add(scanner.nextLine());
            }
        } catch (IOException e){
            System.err.println("Wystąpił problem z wczytaniem pliku");
        }

        for (String name: names)
            System.out.println(name);
        System.out.println("Liczba unikalnych imion: " + names.size());
        System.out.println("Pierwsze imię w zbiorze: " + names.first());
        System.out.println("Ostatnie imię w zbiorze: " + names.last());
    }
}
