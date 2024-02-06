package Zadanie4;

public class Dom
{
    double water;
    double oil;

    Dom(double w, double o)
    {
        water = w;
        oil = o;
    }

    public void showResources()
    {
        System.out.println("Ilość wody: " + water + " litrów, ropa: " + oil + " litrów");
    }

    public void takeShower()
    {
        showResources();
        water -= 48;
        System.out.println("Bierzemy prysznic");
    }

    public void takeBath()
    {
        showResources();
        water -= 86;
        System.out.println("Bierzemy kąpiel");
    }

    public void makeDinner()
    {
        showResources();
        oil -= 0.1;
        water -= 4;
        System.out.println("Gotujemy obiad");
    }

    public void boilWater()
    {
        showResources();
        oil -= 0.05;
        water -= 0.5;
        System.out.println("Gotujemy wodę");
    }

    public void watchTv(int hours)
    {
        showResources();
        oil -= 0.06 * hours;
        System.out.println("Oglądamy telewizję przez " + hours + " godzin");
    }
}
