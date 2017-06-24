package objects;

/**
 *
 */

public class Character {
    private String name;
    private int oratory;
    private int fatigue;
    private int agility;
    private int strength;
    private boolean isDead;

    Character(String name, int oratory, int fatigue, int agility, int strength, boolean isDead) {
        this.name = name;
        this.oratory = oratory;
        this.fatigue = fatigue;
        this.agility = agility;
        this.strength = strength;
        this.isDead = isDead;
    }

    public String getName() {
        return name;
    }

    public int getOratory() {
        return oratory;
    }

    public int getFatigue() {
        return fatigue;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public boolean isDead() {
        return isDead;
    }

    void setOratory(int oratory) {
        this.oratory = oratory;
    }

    void setFatigue(int fatigue) {
        this.fatigue = fatigue;
    }

    void setAgility(int agility) {
        this.agility = agility;
    }

    void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDead() {
        this.isDead = true;
    }
}
