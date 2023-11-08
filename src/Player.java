public class Player {
    protected String name = "Default";
    protected Unit units[];

    public Player(String name, String units[]) {
        this.name = name;
        this.units = new Unit[3];
        for (int i = 0; i < 3; i++) {
            switch (units[i].charAt(0)) {
                case 'K':
                    this.units[i] = new Knight();
                    break;
                case 'W':
                    this.units[i] = new Wizard();
                    break;
                case 'T':
                    //this.units[i] = new Terminator();
            }
        }
    }
}
