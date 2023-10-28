public class Wizard extends Unit {
    protected int mana = 100;

    public Wizard(String name) {
        super(name);
        this.power = 25;
        this.defence = 80;
    }

    public Wizard() {
    }

    public void attack(Unit unit) {
        if (this.mana != 0) {
            this.mana -= 10;
            super.attack(unit);
        }

    }

    public String toString() {
        return "Wizard{mana=" + this.mana + ", health=" + this.health + ", defence=" + this.defence + "}";
    }
}
