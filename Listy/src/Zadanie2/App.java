package Zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = readNumbers();
        System.out.println("Ilość poprawnych liczb: " + numbers.size());
        System.out.println("Ich suma to: " + addNumbers(numbers));
        System.out.println("Natomiast średnia to: " + averageNumber(numbers));
    }

    static ArrayList<Integer> readNumbers(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;
        while((input = scanner.nextInt()) % 5 == 0 && input > 0)
            numbers.add(input);
        return numbers;
    }

    static int addNumbers(List<Integer> list){
        int count = 0;
        for (int number: list)
            count += number;
        return count;
    }

    static double averageNumber(List<Integer> list){
        int sum = addNumbers(list);
        return (double) sum / list.size();
    }
}
