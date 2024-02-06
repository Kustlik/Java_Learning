package Zadanie2;

import java.util.HashSet;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        chooseOption();
    }

    static void showMenu(){
        System.out.println(
                """
                Dostępne opcje:
                Exit - Koniec programu
                Add - Dodaj nowy produkt
                """);
    }

    static void chooseOption(){
        HashSet<Product> products = new HashSet<>();
        String input = "";
        do{
            showMenu();
            input = getInput();
            switch (Option.valueOf(input.toUpperCase())){
                case EXIT -> exit(products);
                case ADD -> addProduct(products);
                default -> System.out.println("Podano złą opcję, spróbuj ponownie");
            }
        } while (!Option.valueOf(input.toUpperCase()).equals(Option.EXIT));
    }

    static void addProduct(HashSet<Product> set){
        System.out.println("Podaj nazwę produktu:");
        String name = getInput();
        System.out.println("Podaj jego cenę:");
        double price = Double.parseDouble(getInput());
        Product newProduct = new Product(name, price);
        if(set.contains(newProduct)){
            System.out.println(
                    """
                    Podany produkt już istnieje, jeżeli chcesz go nadpisać, wpisz 'tak'
                    """);
            String option;

            option = getInput();
            if (option.equalsIgnoreCase("tak")){
                set.remove(newProduct);
                set.add(newProduct);
            }
            else
                System.out.println("Pominięto produkt");
        } else
            set.add(newProduct);
    }

    static void exit(HashSet<Product> products){
        System.out.println("Zakonczono działanie programu.");
        for (Product product: products)
            System.out.println(product);
    }

    static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
