package Zadanie2.pl.javastart.application;

import Zadanie2.pl.javastart.model.Telephone;
import Zadanie2.pl.javastart.logic.Charger;

public class PhoneTest
{
    public static void main(String[] args)
    {
        Charger charger = new Charger();

        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        telephone.getStatus();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        telephone.getStatus();
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        charger.charge(telephone);
        telephone.getStatus();
        charger.charge(telephone);
        telephone.getStatus();
    }
}
