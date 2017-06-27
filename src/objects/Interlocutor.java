package objects;

/**
 * Класс собеседника, предполагается использование его для
 * определения собеседников/оппонентов и любых персонажей
 * для взаимодействия. Данная версия игры построена на диалогах и действиях
 */

public class Interlocutor extends Character {

    public Interlocutor(String name, int oratory, int fatigue, int agility, int strength, boolean isDead) {
        super(name, oratory, fatigue, agility, strength, isDead);
    }

    public static Interlocutor getInterlocutor(String name) {
        if (name.equals("Разбойник")) return new Interlocutor(name, 20, (int) (Math.random() * 5) + 2,
                (int) (Math.random() * 35) + 15, (int) (Math.random() * 35) + 15, false);
        else return new Interlocutor(name, 45, 0, 75, 75, false);
    }
}
