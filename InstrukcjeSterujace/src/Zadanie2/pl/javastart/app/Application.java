package Zadanie2.pl.javastart.app;

import Zadanie2.pl.javastart.factory.Factory;

import java.util.Random;

public class Application
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(10_000);

        Factory factory = new Factory();
        factory.showInfo(randomNumber);
        factory.correctNumber(randomNumber);
    }
}
