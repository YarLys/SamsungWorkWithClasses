public class Unit {
    protected String name = "Vova";
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;
    protected float CricicalChance = 0.1F;
    protected float ParryChance = 0.1F;

    public Unit(String name) {
        ++Game.CountOfPlayers;
        this.name = name;
    }

    public Unit() {
        ++Game.CountOfPlayers;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefence() {
        return this.defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCricicalChance() {
        return this.CricicalChance;
    }

    public void setCricicalChance(float cricicalChance) {
        this.CricicalChance = cricicalChance;
    }

    public float getParryChance() {
        return this.ParryChance;
    }

    public void setParryChance(float parryChance) {
        this.ParryChance = parryChance;
    }

    public void attack(Unit unit) {
        unit.getDamage(this.power);
    }

    public void getDamage(int damage) {
        this.health -= damage;
    }

    public String toString() {
        return "Unit{health=" + this.health + ", defence=" + this.defence + ", power=" + this.power + "}";
    }

    public void print() {
        System.out.println(this);
    }

    public void print(String str) {
        System.out.println(str + String.valueOf(this));
    }
}
