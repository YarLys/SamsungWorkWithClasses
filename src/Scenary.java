import java.util.Scanner;

public class Scenary {
    public static int state = 0;
    public static int round = 0;
    public static int player_num = 0;
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
    public static String chooseCfg() {
        printChooseConfig();
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public static String[] prepCycle() {
        Scanner in = new Scanner(System.in);
        state %= 2;
        switch (state) {
            case 0:
                printHello();
                state++;
                String name[] = new String[1];
                name[0] = in.nextLine();
                return name;
            case 1:
                printChooseUnits();
                String units[] = in.nextLine().split(" ");
                state++;
                return units;
            default:
                String def[] = new String[1];
                return def;
        }
    }
}
