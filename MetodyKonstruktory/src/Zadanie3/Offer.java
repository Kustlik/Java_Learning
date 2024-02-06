package Zadanie3;

public class Offer
{
    Product product;
    double price;
    boolean special;

    Offer(Product productProvided, double priceProvided, boolean specialProvided)
    {
        product = productProvided;
        price = priceProvided;
        special = specialProvided;

        System.out.println(product.name + " "
                + product.producer + " "
                + price + "zł, "
                + "oferta specjalna? " + special);
    }
}
