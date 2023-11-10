import java.sql.SQLOutput;
import java.util.Scanner;

public class Scenary {
    public static int prep_state = 0;
    public static void printNewGame() {
        System.out.println(Util.newGame);
    }
    public static void printHello() {
        System.out.println(Util.hello);
    }
    public static void printChooseUnits() {
        System.out.println(Util.chooseUnits);
    }
    public static void printChooseConfig() {
        System.out.println(Util.chooseConfig);
    }
    public static void printRound(int round, String name) {
        System.out.println(("Раунд " + round + ". Ходит " + name));
    }
    public static void printGameOver() {
        System.out.print(Util.gameOver);
    }
    public static String chooseCfg() {
        printChooseConfig();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static String[] prepCycle() {
        Scanner in = new Scanner(System.in);
        prep_state %= 2;
        switch (prep_state) {
            case 0:
                printHello();
                prep_state++;
                String name[] = new String[1];
                name[0] = in.nextLine();
                return name;
            case 1:
                printChooseUnits();
                String units[] = in.nextLine().split(" ");
                prep_state++;
                return units;
            default:
                String def[] = new String[1];
                return def;
        }
    }

    public static int chooseUnit() {
        System.out.print(Util.chooseHero);
        Scanner in = new Scanner(System.in);
        return (in.nextInt());
    }

    public static int chooseOpponent() {
        System.out.print(Util.chooseOpponent);
        Scanner in = new Scanner(System.in);
        return (in.nextInt());
    }

    public static int chooseAttack() {
        System.out.print(Util.chooseAttack);
        Scanner in = new Scanner(System.in);
        return (in.nextInt());
    }
}
