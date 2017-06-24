package objects;

/**
 * Класс игрок. В данной версии предполагается развитие
 * базовых стат для битвы в конце игры и для использования
 * особых реплик (убеждение, давление).
 */

public class Player extends Character {

    public Player(String name, int oratory, int fatigue, int agility, int strength, boolean isDead) {
        super(name, oratory, fatigue, agility, strength, isDead);
    }

    public static Player createPlayer(String name) {
        return new Player(name, 75 , 0,
                (int)(Math.random() * 50) + 25, (int)(Math.random() * 50) + 25, false);
    }

    public void plusOratory(int deltaOratory) {
        int newOratory = this.getOratory() + deltaOratory;
        this.setOratory(newOratory);
        System.out.println("Красноречие: " + this.getOratory() + "(+" + deltaOratory + ")");
    }

    public void plusFatigue(int deltaFatigue) {
        int newFatigue = this.getFatigue() + deltaFatigue;
        this.setFatigue(newFatigue);
        System.out.println("Уровень тревоги: " + this.getFatigue() + "(+" + deltaFatigue + ")");
    }

    public void plusAgility(int deltaAgility) {
        int newAgility = this.getAgility() + deltaAgility;
        this.setAgility(newAgility);
        System.out.println("Ловкость: " + this.getAgility() + "(+" + deltaAgility + ")");
    }

    public void plusStrength(int deltaStrength) {
        int newStrength = this.getStrength() + deltaStrength;
        this.setStrength(newStrength);
        System.out.println("Сила: " + this.getStrength() + "(+" + deltaStrength + ")");
    }
}
