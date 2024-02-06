package Zadanie2;

public class DiceTest
{
    public static void main(String[] args)
    {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();

        dice1.roll();
        dice1.showDice();
        dice2.roll();
        dice2.showDice();
        dice3.roll();
        dice3.showDice();

        dice1.roll();
        dice1.roll();
        dice1.roll();
        dice1.showDice();
        dice2.roll();
        dice2.roll();
        dice2.roll();
        dice2.showDice();
        dice3.roll();
        dice3.roll();
        dice3.roll();
        dice3.showDice();
    }
}
