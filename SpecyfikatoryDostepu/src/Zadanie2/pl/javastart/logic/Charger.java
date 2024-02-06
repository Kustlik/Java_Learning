package Zadanie2.pl.javastart.logic;

import Zadanie2.pl.javastart.model.Telephone;

public class Charger
{
    public void charge(Telephone telephone)
    {
        if (telephone.getChargeLevel() < 100)
            telephone.setChargeLevel(telephone.getChargeLevel() + 1);
        else
            System.out.println("Telephone is charged to 100% already");
    }
}
