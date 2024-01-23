package cn.liulin.springjiemi.designModel.memento;

/**
 * cn.liulin.springjiemi.designModel.memento$
 *
 * @author ll
 * @date 2024-01-18 17:02:05
 **/
public class GameOriginator {
    private int healthValue;
    private int armor;
    private int magicResistance;
    private int aggressivity;

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

    public GameOriginator() {
        this.healthValue = 100;
        this.armor = 10;
        this.magicResistance = 5;
        this.aggressivity = 15;
    }

    public GameMemento createGameMemento() {
        return new GameMemento(this.healthValue, this.armor, this.magicResistance, this.aggressivity);
    }

    public void recover(GameMemento gameMemento) {
        this.healthValue = gameMemento.getHealthValue();
        this.armor = gameMemento.getArmor();
        this.magicResistance = gameMemento.getMagicResistance();
        this.aggressivity = gameMemento.getAggressivity();
    }

    public void attackBoss() {
        this.healthValue = 0;
        this.armor = 10;
        this.magicResistance = 5;
        this.aggressivity = 15;
    }

    public void show() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "GameOriginator{" +
                "生命值=" + healthValue +
                ", 护甲=" + armor +
                ", 魔抗=" + magicResistance +
                ", 攻击力=" + aggressivity +
                '}';
    }
}
