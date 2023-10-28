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
    public static void gameCycle() {
        switch (state) {
            case 0:

                break;
            case 1:
                break;
            case 2:
                break;
        }
    }
}
