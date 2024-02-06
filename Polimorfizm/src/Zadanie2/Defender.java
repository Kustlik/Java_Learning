package Zadanie2;

public class Defender extends Character
{
    private double defenseBonus;

    public Defender(String name, double power, double defense, double health, double defenseBonus) {
        super(name, power, defense, health);
        this.defenseBonus = defenseBonus;
        setDefense(getDefense() * defenseBonus);
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }
}
