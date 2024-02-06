package Zadanie1;

public class App {
    public static void main(String[] args) {
        System.out.println(silnia(4));
    }

    static int silnia(int a){
        return a > 1 ? a * silnia(a - 1) : 1;
    }
}
