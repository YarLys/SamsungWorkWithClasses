import java.util.Scanner;

public class Game {
    public static final int MAX_PLAYERS = 4;
    private int CountOfPlayers = 0;
    private static Player players[] = new Player[MAX_PLAYERS];
    protected int config = 2;
    private boolean gameOn = true;
    private int player_num = 0;
    private int round = 0;
    private int winner = 0;
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

    protected void printPlayers() {
        for (int i = 0; i < CountOfPlayers; i++) {
            System.out.println(i + 1 + " " + players[i].name);
        }
    }

    protected boolean checkGameOver() {
        int l = 0;
        for (int i = 0; i < CountOfPlayers; i++) {
            int k = 0;
            for (int j = 0; j < 3; j++) {
                if (players[i].units[j].health <= 0)
                    k++;
            }
            if (k == 3) {
                l++;
            }
            else winner = i;
        }
        if (l == CountOfPlayers - 1) return false;
        else return true;
    }

    protected void run() {
        // if config == 2 // Manual
        int pl = 0;
        int hero = 0;
        while (gameOn) {
            round++;
            Scenary.printRound(round, players[player_num].name);
            players[player_num].printUnits();
            players[player_num].chosen_unit = players[player_num].units[Scenary.chooseUnit() - 1];

            printPlayers();
            pl = Scenary.chooseOpponent() - 1;
            players[pl].printUnits();
            hero = Scenary.chooseAttack() - 1;
            players[pl].units[hero].getDamage(players[player_num].chosen_unit.power);

            player_num = (player_num + 1) % CountOfPlayers;
            gameOn = checkGameOver();
        }
        Scenary.printGameOver();
        System.out.println(players[winner].name);
    }
}

/*if (players[pl].units[hero].health > 0)
                players[pl].units[hero].health = players[pl].units[hero].health - (players[player_num].chosen_unit.power - (int)(players[pl].units[hero].defence * 0.05));
            if (players[pl].units[hero].defence > 0)
                players[pl].units[hero].defence -= 5;*/