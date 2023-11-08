public class Util {
    public static String newGame = "Введите количество игроков: ";
    public static String hello = "Привет! Добро пожаловать в игру ТекстовоеРПГ! Назови своё имя: ";
    public static String chooseUnits = "Выберите трёх героев, за которых вы будете играть в том порядке, в котором они будут сражаться (W, K, T): ";
    public static String chooseConfig = "Выберите режим игры (Auto 'A', Half-Auto 'HA', Manual 'M'): ";
    public static String round(int round, String name) {
        return ("Раунд " + round + ". Ходит " + name);
    }
}
