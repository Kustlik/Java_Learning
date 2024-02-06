package Zadanie2;

import java.util.HashMap;
import java.util.TreeSet;

public class ProductCalculator {
    public static void printAvgCost(TreeSet<Product> products){
        double price = 0;
        for (Product product: products)
            price += product.getPrice();
        double avgPrice = price / products.size();
        System.out.println("Średni koszt produktów: " + avgPrice);
    }

    public static void printCheapest(TreeSet<Product> products){
        Product product = products.first();
        System.out.println("Najtańszy produkt z danej kategorii to: " + product);
    }

    public static void printExpensive(TreeSet<Product> products){
        Product product = products.last();
        System.out.println("Najdroższy produkt z danej kategorii to: " + product);
    }
}
