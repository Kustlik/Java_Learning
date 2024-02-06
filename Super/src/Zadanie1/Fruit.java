package Zadanie1;

public class Fruit
{
    private double grams;
    private String type;

    public Fruit(double grams, String type)
    {
        this.grams = grams;
        this.type = type;
    }

    public double getGrams() {
        return grams;
    }

    public void setGrams(double grams) {
        this.grams = grams;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo()
    {
        return "Owoc typu: " + type + ", gram: " + grams;
    }
}
