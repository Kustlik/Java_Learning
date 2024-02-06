package Zadanie1;

public class Apple extends Fruit
{
    private String variety;

    public Apple(double grams, String variety)
    {
        super(grams, "jabłkowaty");
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public String getInfo()
    {
        return super.getInfo() + ", odmiana: " + variety;
    }
}
