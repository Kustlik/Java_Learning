package Zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> list = readNumbers(new ArrayList<>());
        int sum = 0;

        for(Integer number: list){
            System.out.println(number);
            sum += number;
        }
        System.out.println(sum);
    }

    static ArrayList<Integer> readNumbers(ArrayList<Integer> list){
        Scanner scanner = new Scanner(System.in);
        try{
            String input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit"))
                return list;
            int parsedInput = Integer.parseInt(input);
            list.add(parsedInput);
        } catch (NumberFormatException e){
            System.err.println("Nie można przekonwertować wprowadzonej wartości na typ int.");
            e.getStackTrace();
        }
        return readNumbers(list);
    }
}
