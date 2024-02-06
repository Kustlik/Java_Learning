package Zadanie2;

import java.util.Random;

public class Dice
{
    Random random = new Random();
    int result;

    Dice()
    {
        roll();
    }

    Dice(int n)
    {
        result = n;
    }

    void roll()
    {
        result = random.nextInt(6) + 1;
    }

    void showDice()
    {
        System.out.println(result);
    }
}
