package day7;

public class Player {
    private int stamina;
    static int MAX_STAMINA = 100;
    static int MIN_STAMINA = 0;
    static int countPlayers = 0;
    static int MAX_PLAYERS = 6;
    static String freePlace;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < MAX_PLAYERS) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run () {
        if (stamina == 0)
            return;
        stamina --;
        if (stamina == MIN_STAMINA)
            countPlayers--;
    }

    public static String getFreePlace () {
        switch (countPlayers) {
            case 5:
                freePlace = "свободное место";
                return freePlace;
            case 4:
            case 3:
            case 2:
                freePlace = "свободных места";
                return freePlace;
            case 1:
                freePlace = "свободных мест";
                return freePlace;
        } return freePlace;
    }

    public static void info () {
        if (countPlayers < MAX_PLAYERS) {
            System.out.println("Команды неполные. На поле ещё есть " + (MAX_PLAYERS - countPlayers) + " " + Player.getFreePlace());
        } else
            System.out.println("На поле нет свободных мест");
    }
}
