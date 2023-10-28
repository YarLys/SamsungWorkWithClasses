public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        new Game();
        new Unit("Aleksey");
        new Game();
        Wizard wizard1 = new Wizard("W1");
        Wizard wizard2 = new Wizard("W2");
        System.out.println(wizard1);
        wizard2.attack(wizard1);
        System.out.println(wizard1);
        System.out.println(Game.CountOfPlayers);
    }
}