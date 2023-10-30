public class Knight extends Unit {
    public Knight(String name) {
        super(name);
        this.power = 15;
        this.defence = 120;
    }
    public Knight() {

    }

    @Override
    public String toString() {
        return "Knight{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                '}';
    }
}
