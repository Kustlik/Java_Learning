package Zadanie2;

import java.util.HashMap;
import java.util.TreeSet;

public class ProductApp {
    public static void main(String[] args) {
        System.out.println("Podaj nazwę kategorii, dla wyświetlenia statystyk:");
        String category = DataReader.getString();
        printStats(category);
    }

    public static void printStats(String category){
        HashMap<String, TreeSet<Product>> productMap = ProductReader.readFile();
        if (!productMap.containsKey(category))
            System.out.println("Podana kategoria nie istnieje");
        else {
            TreeSet<Product> productsFromCategory = productMap.get(category);
            for (Product product: productsFromCategory)
                System.out.println(product);
            ProductCalculator.printCheapest(productsFromCategory);
            ProductCalculator.printExpensive(productsFromCategory);
            ProductCalculator.printAvgCost(productsFromCategory);
        }
    }
}
