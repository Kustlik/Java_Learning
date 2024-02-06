package Zadanie2;

public class Attacker extends Character
{
    private double attackBonus;

    public Attacker(String name, double power, double defense, double health, double attackBonus) {
        super(name, power, defense, health);
        this.attackBonus = attackBonus;
        setPower(getPower() * attackBonus);
    }

    public double getAttackBonus() {
        return attackBonus;
    }
}
