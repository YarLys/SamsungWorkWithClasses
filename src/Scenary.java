import java.util.Scanner;

public class Scenary {
    public static int prep_state = 0;
    public static int game_state = 0;
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
    public static void printPlayer(Player player) {
        System.out.println(Util.round(round, player.name));
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

    public static void gameCycle() {
        Scanner in = new Scanner(System.in);
        switch (game_state) {
            case 0:
                printPlayer(Game.players[player_num]);
                break;
            case 1:
                break;
            case 2:
                break;
        }
        player_num++;
        player_num %= 2;
    }
}
