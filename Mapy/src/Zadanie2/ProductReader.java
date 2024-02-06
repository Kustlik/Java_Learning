package Zadanie2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ProductReader {
    static final String FILE_NAME = "products.txt";

    public static HashMap<String, TreeSet<Product>> convertProductsToMap(ArrayList<Product> productList){
        HashMap<String, TreeSet<Product>> productMap = new HashMap<>();
        for(Product product:productList){
            String category = product.getCategory();
            if (!productMap.containsKey(category)) {
                TreeSet<Product> productsSet = new TreeSet<>();
                productsSet.add(product);
                productMap.put(category, productsSet);
            } else {
                productMap.get(category).add(product);
            }
        }
        return productMap;
    }

    public static HashMap<String, TreeSet<Product>> readFile(){
        ArrayList<Product> productList = new ArrayList<Product>();
        try(Scanner scanner = new Scanner(new File(FILE_NAME))){
            scanner.nextLine();
            while(scanner.hasNext()){
                String[] split = scanner.nextLine().split(";");
                String category = split[0];
                String name = split[1];
                double price = Double.parseDouble(split[2]);
                productList.add(new Product(category, name, price));
            }
        } catch (IOException e){
            System.err.println("Wystąpił problem z wczytaniem pliku");
        }
        return convertProductsToMap(productList);
    }
}
