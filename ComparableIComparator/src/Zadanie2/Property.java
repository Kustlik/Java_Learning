package Zadanie2;

public class Property implements Comparable<Property> {
    private String city;
    private double price;
    private double area;

    public Property(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public int compareTo(Property p){
        double thisPricePerMetr = price / area;
        double comparePricePerMetr = p.price / p.area;

        if (thisPricePerMetr > comparePricePerMetr)
            return 1;
        else if (thisPricePerMetr < comparePricePerMetr)
            return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Property{" +
                "city='" + city + '\'' +
                ", price=" + price +
                ", area=" + area +
                '}';
    }
}
