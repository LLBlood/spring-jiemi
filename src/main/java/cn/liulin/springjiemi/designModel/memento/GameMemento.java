package cn.liulin.springjiemi.designModel.memento;

/**
 * cn.liulin.springjiemi.designModel.memento$
 *
 * @author ll
 * @date 2024-01-18 17:06:44
 **/
public class GameMemento {
    private int healthValue;
    private int armor;
    private int magicResistance;
    private int aggressivity;

    public GameMemento(int healthValue, int armor, int magicResistance, int aggressivity) {
        this.healthValue = healthValue;
        this.armor = armor;
        this.magicResistance = magicResistance;
        this.aggressivity = aggressivity;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getMagicResistance() {
        return magicResistance;
    }

    public void setMagicResistance(int magicResistance) {
        this.magicResistance = magicResistance;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }
}
