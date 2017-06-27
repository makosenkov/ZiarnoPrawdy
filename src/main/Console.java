package main;

import objects.Interlocutor;
import objects.Player;

import java.util.Scanner;

final class Console {
    private final Scanner read = new Scanner(System.in);
    private Player player;

    void runGame() {
        startGame();
        sleep(2000);
        showStats();
        write("");
        sleep(2000);
        theVeryBeginning();
        sleep(3000);
        corpses();
    }

    private void showStats() {
        write("Характеристики:");
        write("Имя: " + player.getName() + " Красноречие: " + player.getOratory() + " Ловкость: " + player.getAgility() +
                " Сила: " + player.getStrength() + " Усталость:" + player.getFatigue());
    }

    private void wrong() {
        write("Игра не по правилам. Это очень некрасиво");
    }

    private void startGame() {
        write("Введите имя персонажа:");
        String name;
        if (read.hasNext()) name = read.nextLine();
        else name = "Геральт";
        player = Player.createPlayer(name);
        sleep(2000);
        write("Крупица истины (на основе произв. А. Сапковского)\n");
        sleep(4000);
        write("Маленькие черные точки на светлом фоне неба, помеченного полосами дымки, двигаясь,");
        sleep(2000);
        write("привлекли внимание ведьмака. Их было много.");
        sleep(2000);
        write("Птицы кружили, описывая медленные, плавные круги, потом круто ");
        sleep(2000);
        write("снижались и тут же опять взмывали вверх, забив крыльями.");
        sleep(2000);
        write("Ведьмак наблюдал за птицами довольно долго, оценивал расстояние и приблизительное время, ");
        sleep(2000);
        write("требуемое на его преодоление, с поправкой на рельеф местности.");
        sleep(2000);
        write("Наконец, он откинул плащ, укоротил на два отверстия ремень, наискосок пересекающий грудь. ");
        sleep(2000);
        write("Эфес и рукоять меча, переброшенного за спину, выглядывали из-за правого плеча.");
        sleep(2000);
        write("- Сделаем небольшой крюк, Плотва, - произнес он. - Съедем с тракта. ");
        sleep(2000);
        write("Птица, как мне сдается, кружит там не без причины.\n");

    }

    private void theVeryBeginning() {
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
                    wrong();
            }
        }
    }

    private void corpses() {
        write("Кобыла ведьмака фыркнула. Волки, как по команде, бесшумно, не спеша потрусили в лес, " +
                "время от времени поворачивая в сторону незваного гостя треугольные головы.");
        sleep(2000);
        write("Геральт соскочил с лошади и решил...");
        write("Выбери действие (цифра)");
        write("[1] Осмотреть трупы");
        write("[2] Искать следы");
        write("[3] Осмотреть сумку мужчины");
        if (read.hasNextInt()) {
            int choice = read.nextInt();
            switch (choice) {
                case (1):
                    checkCorpses();
                    afterCheckCorpses();
                    break;
                case (2):
                    checkTracks();
                    break;
                case (3):
                    checkBag();
                    rogueFight();
                    break;
                default:
                    wrong();
            }
        }
    }


    private void checkCorpses() {
        write("У женщины в полушубке и голубой юбке не было лица, горла и большей части левого бедра. ");
        sleep(2000);
        write("Мужчина лежал лицом к земле. рукава и плечи шерстяной куртки покрывал черный,");
        sleep(2000);
        write("ветвистый узор засохшей крови. Было очевидно, что мужчина умер от удара в шею, а");
        sleep(2000);
        write("волки искромсали тело уже позднее. ");
        sleep(2000);
        write("Ведьмак вернулся к трупу женщины. Когда он переворачивал тело, что-то укололо его в палец.");
        sleep(2000);
        write("Это была роза, приколотая к юбке. Цветок завял, но не потерял красок - лепестки");
        sleep(2000);
        write("были темно-синие, почти фиолетовые. " + player.getName() + " первый раз в жизни видел такую розу.");
        sleep(2000);
        write("Он перевернул тело полностью и вздрогнул.");
        sleep(2000);
        write("На открывшейся деформированной шее женщины были видны следы зубов.");
        sleep(2000);
        write("Не волчьих.");
        sleep(2000);
        write("- Так, Плотва, - произнес он тихо, сдерживая лошадь. - Дело ясное, хоть и не до конца.");
        sleep(2000);
        write("- Это что-то, которое убило обоих, - продолжал " + player.getName() + ", глядя на край леса, - не было");
        sleep(2000);
        write("ни вурдалаком, ни лешим. Ни тот, ни другой не оставили бы столько для ворон и волков.");
    }

    private void checkTracks() {
        write("Ведьмак осторожно попятился к лошади. Не спуская глаз с края леса, поднялся в седло.");
        sleep(2000);
        write("Дважды объехал поляну, низко наклонившись, внимательно осмотрел землю.");
        sleep(2000);
        write("- Так, Плотва, - произнес он тихо, сдерживая лошадь. - Оружейник и женщина приехали");
        sleep(2000);
        write("верхом со стороны того леса. Они, без всякого сомнения, направлялись из Муривель домой");
        sleep(2000);
        write("Почему ехали этой дорогой, а не трактом, неизвестно. Но только они ехали через ");
        sleep(2000);
        write("вересковые заросли бок в бок. И тут, не знаю почему, оба слезли или упали с лошадей. ");
        sleep(2000);
        write("Оружейник умер сразу. Женщина бежала, потом упала и тоже умерла, а что-то, что не оставило");
        sleep(2000);
        write("следов, тащило ее по земле, держа зубами за шею. Это случилось два или три дня тому назад.");
        sleep(2000);
        write("- Сделаем крюк. Нужно узнать, зачем оружейник и женщина ехали через бор, а не трактом.");

        write("*Продолжение сюжетки*");
    }

    private void checkBag() {
        write("На широком ремне, рядом с коротким мечом в деревянных ножнах, мужчина носил кожаную суму.");
        sleep(2000);
        write("Ведьмак сорвал ее, выбросил одно за другим в траву огниво, кусок мела, воск для печатей,");
        sleep(2000);
        write("горсть серебряных монет, складной, в костяной оправе ножик для бритья, кроличье ухо,");
        sleep(2000);
        write("три ключа на колечке, амулет с фаллическим символом. Кроме того - две грамоты,");
        sleep(2000);
        write("написанные на холсте, отсыревшие от дождя и росы, руны расплылись, размылись.");
        sleep(2000);
        write("Третья, на пергаменте, тоже была попорчена влагой, но ее можно было прочесть.");
        sleep(2000);
        write("Сделать этого " + player.getName() + " не успел.");
        sleep(2000);
        write("Обостренный слух выловил еле заметный шорох листьев кустарника метрах в десяти позади.");
        sleep(2000);
        write(player.getName() + "...");

    }

    private void afterCheckCorpses() {
        write("Выбери действие (цифра)");
        write("[1] Искать следы");
        write("[2] Осмотреть сумку мужчины");
        if (read.hasNextInt()) {
            int choice = read.nextInt();
            switch (choice) {
                case (1):
                    checkTracks();
                    break;
                case (2):
                    checkBag();
                    rogueFight();
                    break;
                default:
                    wrong();
            }
        }
    }

    private void rogueFight() {
        write("Выбери действие (цифра)");
        write("[1] Отпрыгнул в сторону и перекатился");
        write("[2] В резком развороте вынул кинжал из ножен на бедре и ударил");
        write("[3] Резко встал и развернулся");
        if (read.hasNextInt()) {
            int choice = read.nextInt();
            switch (choice) {
                case (1):
                    duringRogueFight();
                    break;
                case (2):
                    boolean playerWins = statsComparison("Разбойник");
                    if (playerWins) {
                        write("Дело решила доля секунды, которой не хватило человеку в схватке с ведьмаком.");
                        sleep(2000);
                        write(player.getName() + " вытирая кинжал, смотрел на лежащий на поляне труп разбойника.");
                        sleep(2000);
                        write("Ему не было жалко глупого мужичка, решившего напасть на ведьмака со спины. Сам виноват.");
                    } else {
                        write("В пылу схватки " + player.getName() + " не расслышал звук тетивы, чем поплатился жизнью");
                        sadEnd();
                    }
                    break;
                case (3):
                    write("Это стало самой большой ошибкой в его жизни.");
                    sleep(1000);
                    write("Разбойник целился прямиком в сонную артерию и через долю секунды нож достиг своей цели");
                    sadEnd();
                    break;
                default:
                    wrong();
            }
        }
    }

    private void duringRogueFight() {
        write("Разбойник подумал, что двигаться с такой быстротой не может ни один человек.");
        sleep(2000);
        write("Однако " + player.getName() + " был лишен физических недостатков людей.");
        sleep(2000);
        write("Со скоростью молнии он...");
        sleep(2000);
        write("Выбери действие (цифра)");
        write("[1] Сложил пальцы в знак Аард и ударил в сторону противника, надеясь свалить того с ног");
        write("[2] Выхватил меч и закрутил им над головой");
        if (read.hasNextInt()) {
            int choice = read.nextInt();
            switch (choice) {
                case (1):
                    afterSignAard();
                    break;
                case (2):
                    write(player.getName() + " кинулся на нападавшего, целясь острием меча в висок");
                    boolean playerWins = statsComparison("Разбойник");
                    if (playerWins)
                        write("Дело решила доля секунды, которой не хватило человеку в схватке с ведьмаком.");
                    else {
                        write("В пылу схватки " + player.getName() + " не расслышал звук тетивы, чем поплатился жизнью");
                        sadEnd();
                    }
                    break;
                default:
                    wrong();
            }
        }
    }

    private void afterSignAard() {
        write("К удивлению ведьмака, разбойник продолжал надвигаться, будто ограждаемый невидимой сферой.");
        sleep(2000);
        player.plusFatigue(5);
        player.plusAgility(-5);
        sleep(2000);
        write(player.getName() + " чертыхнулся. В последнее время подобные амулеты, защищавшие от прямого воздействия не очень мощной");
        sleep(2000);
        write("магии перестали быть роскошью для профессиональных убийц.");
        sleep(2000);
        write("Выбери действие (цифра)");
        write("[1] " + player.getName() + " начал обходить противника, приближаясь по спирали");
        write("[2] " + player.getName() + " кинулся на нападавшего, целясь острием меча в висок");
        if (read.hasNextInt()) {
            int choice = read.nextInt();
            switch (choice) {
                case (1):
                    bowFight();
                    break;
                case (2):
                    boolean playerWins = statsComparison("Разбойник");
                    if (playerWins)
                        write("Дело решила доля секунды, которой не хватило человеку в схватке с ведьмаком.");
                    else {
                        write("В пылу схватки " + player.getName() + " не расслышал звук тетивы, чем поплатился жизнью");
                        sadEnd();
                    }
                    break;
                default:
                    wrong();
            }
        }
    }

    private void bowFight() {
        if (player.getAgility() > 50) {
            write("Услышав звон тетивы из-за дерева справа, " + player.getName() + " резко махнул мечом.");
            sleep(2000);
            write("Раздался звон удара меча о стальной наконечник стрелы. После такого лучник здорово струхнул и бросился в лес");
            sleep(2000);
            write("Видя, что разбойник замахнулся кинжалом, ...");
            write("Выбери действие (цифра)");
            write("[1] " + player.getName() + " отскочил назад");
            write("[2] " + player.getName() + " парировал удар");
            if (read.hasNextInt()) {
                int choice = read.nextInt();
                switch (choice) {
                    case (1):
                        write("Отскочив назад, ведьмак сбился с темпа и позволил противнику задеть его клинком");
                        sleep(2000);
                        player.plusAgility(-10);
                        player.plusFatigue(10);
                        player.plusStrength(-10);
                        sleep(2000);
                        boolean playerWins = statsComparison("Разбойник");
                        if (playerWins)
                            write("Дело решила доля секунды, которой не хватило человеку в схватке с ведьмаком.");
                        else write("Сбившись с темпа, " + player.getName() + " совершил непростительную ошибку");
                        sadEnd();
                        break;
                    case (2):
                        write(" парировав плоский удар кинжалом," + player.getName() +
                                " сделав полупируэт, сбив темп противника, и кончиком меча прошелся по шее");
                        sleep(2000);
                        write("нападавшего. С этого момента " + player.getName() +
                                " слышал только бульканье разбойника и хруст веток под ногами удирающего напарника.");
                        break;
                    default:
                        wrong();
                }
            }

        } else {
            write("Даже ведьмаку не хватило бы ловкости, следя за противником, еще и отбить стрелу на лету");
            sadEnd();
        }
    }

    private void inTheRavine() {
        write("Яр был действительно там, где он и ожидал - одно время ведьмаку ");
        sleep(2000);
        write("сверху видны были кроны деревьев, тесно заполнивших расселину. ");
        sleep(2000);
        write("Склоны оврага как, оказалось, были совсем не такими пологими, как " + player.getName() + " ожидал,");
        sleep(2000);
        write("зато дно сухое, без терновника и гниющих пней.");
        sleep(2000);
        write("Преодолеть яр оказалось не так уж легко, песок с камнями на склонах осыпались под ногами лошади.");
        sleep(2000);
        player.plusFatigue(5);

    }

    private void afterRavine() {
        write("На другой стороне был березовый перелесок, за ним большая поляна, ");
        sleep(2000);
        write("вересковые заросли и бурелом, вытянувший вверх щупальца спутанных веток и корней. ");
        sleep(2000);
        write(player.getName() + " заметил первые останки сразу - белый бараний полушубок и матово-голубая юбка");
        sleep(2000);
        write("выделялись среди пожелтевших островков осоки.");
        sleep(2000);
        write("Второго трупа он не видел, но знал, где тот лежит - положение останков выдавала позиция ");
        sleep(2000);
        write("трех волков, которые смотрели на всадника спокойно, присев на зады.");
    }

    private static void write(String words) {
        System.out.println(words);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private boolean statsComparison(String name) {
        Interlocutor opponent = Interlocutor.getInterlocutor(name);
        boolean playerWins;
        int strengthDelta = player.getStrength() - opponent.getStrength();
        int agilityDelta = player.getAgility() - opponent.getAgility();
        int fatigueDelta = player.getFatigue() - opponent.getFatigue();
        playerWins = strengthDelta + agilityDelta - fatigueDelta >= 0;
        return playerWins;
    }

    private void sadEnd() {
        player.setDead();
        write(player.getName() + "и подумать не мог, что денек выдастся настолько паршивым.");
        write("Конец.");
    }
}
