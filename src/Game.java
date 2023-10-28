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
        for (int i = 0; i < n; i++) {
            Scenary.printHello();
            addPlayer();
        }
    }
    protected void addPlayer(String name) {
        Scenary.gameCycle();
        players[CountOfPlayers] = new Player(name);
    }

    private void run() {

    }
}