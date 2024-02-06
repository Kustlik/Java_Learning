package Zadanie1;

import java.util.Arrays;
import java.util.Comparator;

public class App {
    public static void main(String[] args) {
        Integer[] numbers = {3,6,3,2,1,53,23,123,675,123,56534,234,2,1312,5,236,32,75,21,0};

        Arrays.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2){
                return -o1.compareTo(o2);
            }
        });
        for(int number:numbers)
            System.out.println(number);
    }
}
