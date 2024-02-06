package Zadanie2;

public class Character
{
    private String name;
    private double power;
    private double defense;
    private double health;

    public Character(String name, double power, double defense, double health) {
        this.name = name;
        this.power = power;
        this.defense = defense;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
}
