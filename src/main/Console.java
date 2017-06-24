package main;

import objects.Player;

import java.util.Scanner;

public class Console {
    private final Scanner read = new Scanner(System.in);
    private Player player;

    public void runGame() {
        startGame();
        sleep(2000);
        write("Характеристики:");
        write("Имя: " + player.getName() + " Красноречие: " + player.getOratory() + " Ловкость: " + player.getAgility() +
                " Сила: " + player.getStrength() + " Усталость:" + player.getFatigue());
        sleep(2000);
        write("Где-то впереди должен быть небольшой яр, " + player.getName() + " подумал, что будет лучше...");
        write("Выбери действие (цифра)");
        write("[1] Обойти овраг");
        write("[2] Спуститься");
        if (read.hasNextInt()) {
            int choice = read.nextInt();
            switch (choice) {
                case (1):
                    afterRavine();
                    break;
                case (2):
                    inTheRavine();
                    sleep(4000);
                    afterRavine();
                    break;
                default:
                    write("Игра не по правилам. Это очень некрасиво");
            }
        }
    }

    private void startGame() {
        write("Крупица истины (на основе произв. А. Сапковского)\n");
        sleep(4000);
        write("Маленькие черные точки на светлом фоне неба, помеченного полосами " +
                "дымки, двигаясь, привлекли внимание ведьмака.");
        sleep(4000);
        write("Их было много. Птицы кружили, описывая медленные, плавные круги, потом круто " +
                "снижались и тут же опять взмывали вверх, забив крыльями.");
        sleep(4000);
        write("Ведьмак наблюдал за птицами довольно долго, оценивал расстояние и приблизительное время, " +
                "требуемое на его преодоление, с поправкой на рельеф местности.");
        sleep(4000);
        write("Наконец, он откинул плащ, укоротил на два отверстия ремень, наискосок пересекающий грудь. " +
                "Эфес и рукоять меча, переброшенного за спину, выглядывали из-за правого плеча.");
        sleep(4000);
        write("- Сделаем небольшой крюк, Плотва, - произнес он. - Съедем с тракта. " +
                "Птица, как мне сдается, кружит там не без причины.");
        write("Введите имя персонажа:");
        String name;
        if (read.hasNext()) name = read.nextLine();
        else name = "Геральт";
        player = Player.createPlayer(name);
    }

    private void afterRavine() {
        write("На другой стороне был березовый перелесок, за ним большая поляна, " +
                "вересковые заросли и бурелом, вытянувший вверх щупальца спутанных веток и корней. ");
        sleep(4000);
        write(player.getName() + " заметил первые останки сразу - белый бараний полушубок и матово-голубая юбка " +
                "выделялись среди пожелтевших островков осоки.");
        sleep(4000);
        write("Второго трупа он не видел, но знал, где тот лежит - " +
                "положение останков выдавала позиция трех волков, которые смотрели на всадника спокойно, присев на зады.");
    }

    private void inTheRavine() {
        write("Яр был действительно там, где он и ожидал - одно время ведьмаку " +
                "сверху видны были кроны деревьев, тесно заполнивших расселину. ");
        sleep(3000);
        write("Склоны оврага как, оказалось, были совсем не такими пологими, как " + player.getName() + " ожидал," +
                " зато дно сухое, без терновника и гниющих пней.");
        sleep(3000);
        write("Преодолеть яр оказалось не так уж легко, песок с камнями на склонах осыпались под ногами лошади.");
        sleep(2000);
        player.plusFatigue(5);

    }

    private void write(String words) {
        System.out.println(words);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
