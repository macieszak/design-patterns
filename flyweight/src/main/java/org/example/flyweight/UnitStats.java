package org.example.flyweight;

public class UnitStats {

    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int resourceCost;
    private int speed;

    public UnitStats(String name, int hp, int armour, int damageDealt, int resourceCost, int speed) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.resourceCost = resourceCost;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamageDealt() {
        return damageDealt;
    }

    public int getResourceCost() {
        return resourceCost;
    }

    public int getSpeed() {
        return speed;
    }

}
