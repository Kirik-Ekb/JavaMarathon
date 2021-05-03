package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina--;
        } else {
            countPlayers--;
        }
    }

    static void info() {
        if (countPlayers < 5) {
            System.out.println("Команды не полные. На поле ещё есть " + (6 - countPlayers) + " свободных места");
        } else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            System.out.println("Команды не полные. На поле ещё есть " + (6 - countPlayers) + " свободное место");
        }
    }
}
