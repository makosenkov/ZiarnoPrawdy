package objects;

/**
 * Класс собеседника, предполагается использование его для
 * определения собеседников/оппонентов и любых персонажей
 * для взаимодействия. Данная версия игры построена на диалогах и действиях
 */

public class Interlocutor extends Character{

    public Interlocutor(String name, int oratory, int worry, int agility, int strength, boolean isDead) {
        super(name, oratory, worry, agility, strength, isDead);
    }

    public static Interlocutor getIntelocutor(String name, int oratory, int worry, int agility, int strength, boolean isDead){
        return new Interlocutor(name, oratory, worry, agility, strength, isDead);
    }
}
