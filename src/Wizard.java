public class Wizard extends Unit {
    protected int mana = 100;

    public Wizard() {
        this.power = 25;
        this.defence = 80;
        this.type = "Wizard";
    }

    public void attack(Unit unit) {
        if (this.mana != 0) {
            this.mana -= 10;
            super.attack(unit);
        }
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
