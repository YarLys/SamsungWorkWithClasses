public class Player {
    protected String name = "Default";
    protected Unit units[];
    protected Unit chosen_unit;

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
                    this.units[i] = new Terminator();
            }
        }
    }

    public void printUnits() {
        for (int i = 0; i < 3; i++) {
            if (units[i].health > 0) System.out.println(i + 1 + " " + units[i]);
            else System.out.println(i + 1 + " " + units[i].type + " is dead.");
                /*System.out.println(i + 1 + " " + units[i].type + " " + units[i].name + ". HP: " + units[i].health + ". Defence: " + units[i].defence + ". Power: " + units[i].power);
            else System.out.println(i + 1 + " " + units[i].type + " is dead.");*/
        }
    }
}
