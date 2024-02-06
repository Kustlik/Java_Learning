package Zadanie2;

public class Cart {
    private final int CAPACITY = 10;
    private Product[] products = new Product[CAPACITY];
    private int count = 0;

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void add(Product product){
        if (count < CAPACITY){
            products[count] = product;
            count++;
        }
        else
            System.out.println("Koszyk jest już pełny");
    }

    public double totalCost(){
        return calculateTotalCost(count - 1);
    }

    private double calculateTotalCost(int amount){
        return amount >= 0 ? products[amount].getPrice() + calculateTotalCost(amount - 1) : 0;
    }
}
