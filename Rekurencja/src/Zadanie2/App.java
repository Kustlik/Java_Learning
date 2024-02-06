package Zadanie2;

public class App {
    public static void main(String[] args) {
        Cart cart = new Cart();
        String format = "%.2f zł";
        cart.add(new Product("Telewizor", 3000.99));
        cart.add(new Product("Wanna", 1200.99));
        cart.add(new Product("Czajnik", 200.99));
        cart.add(new Product("Suszarka", 100.50));
        System.out.printf(format, cart.totalCost());
    }
}
