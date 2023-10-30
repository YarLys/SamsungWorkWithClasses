import java.util.Scanner;

public class Game {
    public static final int MAX_PLAYERS = 4;
    public static int CountOfPlayers = 0;
    protected Player players[] = new Player[MAX_PLAYERS];
    protected int config = 2;
    Scanner in = new Scanner(System.in);
    public Game() {
        Scenary.printNewGame();
        int n = in.nextInt();
        String cfg = Scenary.chooseCfg();
        switch (cfg) {
            case "A":
                config = 0;
                break;
            case "HA":
                config = 1;
                break;
            case "M":
                config = 2;
                break;
            default:
                System.out.println("Error! Log: Error in choosing config");
                return;
        }
        for (int i = 0; i < n; i++) {
            addPlayer();
        }
    }
    protected void addPlayer() {
        String name[] = Scenary.prepCycle();
        String units[] = Scenary.prepCycle();
        players[CountOfPlayers] = new Player(name[0], units);
        CountOfPlayers++;
    }

    private void run() {

    }
}