public class Knight extends Unit {
    public Knight() {
        this.power = 15;
        this.defence = 120;
        this.type = "Knight";
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
