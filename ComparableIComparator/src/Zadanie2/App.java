package Zadanie2;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final String FILE_NAME = "houses";

    public static void main(String[] args) {
        Property[] properties = readProperties();
        Arrays.sort(properties);
        for(Property prop:properties){
            System.out.println(prop);
        }
    }

    static Property[] readProperties(){
        Property[] properties = new Property[10];
        int count = 0;
        try (Scanner scanner = new Scanner(new File(FILE_NAME))){
            scanner.nextLine();
            while(scanner.hasNextLine()){
                String rawData = scanner.nextLine();
                String[] splittedRawData = rawData.split(";");

                String city = splittedRawData[0];
                double price = Double.parseDouble(splittedRawData[1]);
                double area = Double.parseDouble(splittedRawData[2]);

                properties[count] = new Property(city, price, area);
                count++;
            }
        } catch (IOException e){
            System.out.println("Problem z odczytaniem pliku");
        }
        return properties;
    }
}
