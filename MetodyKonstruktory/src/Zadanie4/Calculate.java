package Zadanie4;

public class Calculate
{
    public static void main(String[] args)
    {
        Dom dom = new Dom(10_000, 1_000);

        dom.boilWater();
        dom.makeDinner();
        dom.takeBath();
        dom.takeShower();
        dom.watchTv(3);
        dom.showResources();
    }
}
