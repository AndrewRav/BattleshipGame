import java.util.ArrayList;
import java.util.Scanner;

public class Gameplay {
    private static final String[][] gameFieldPlayer1 = GameField.createField();
    private static final String[][] gameFieldPlayer2 = GameField.createField();

    public static void startGame() {
        System.out.println("Добро пожаловать в консольную игру «Морской Бой»!");
        System.out.println("Правила: " +
                "\n — Игроки сначала расставляют корабли, пока расставляет один игрок, второй должен отвернуться!" +
                "\n — Координаты для каждой палубы вводяться через запятую, координаты между разными палубами отделяются точкой с запятой без пробелов. " +
                "Формат ввода: x,y;x,y;x,y...");

        // Работа с игровым полем первого игрока
        System.out.println("Координаты вводит первый игрок. Второй не подсматривай!");
        ArrayList<Ship> shipsPlayer1 = new ArrayList<>(); // Список полноценных кораблей на поле 1-ого игрока
        GameField.fillField(gameFieldPlayer1, shipsPlayer1);

        // Работа с игровым полем второго игрока
        System.out.println("Координаты вводит второй игрок. Первый не подсматривай!");
        ArrayList<Ship> shipsPlayer2 = new ArrayList<>(); // Список полноценных кораблей на поле 2-ого игрока
        GameField.fillField(gameFieldPlayer2, shipsPlayer2);

        System.out.println("Поле первого игрока:");
        GameField.printField(gameFieldPlayer1);

        System.out.println("Поле второго игрока:");
        GameField.printField(gameFieldPlayer2);
    }

    public static void shoot(String[][] gameField, ArrayList<Ship> ships) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты, сначала x, затем y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (gameField[x][y].equals("\uD83D\uDEA2")) {
            System.out.println("Попадание! Так держать!");
            gameField[x][y] = "⚓";

            // Определение корабля по которому попали и его ликвидация из списка, в случае если палуба была последней
            for (Ship ship : ships) {
                for (String deckCoordinate : ship.getCoordinatesArray()) {
                    if (x == Integer.parseInt(deckCoordinate.split(",")[0]) && y == Integer.parseInt(deckCoordinate.split(",")[1])) {
                        ship.setDeck(ship.getDeck() - 1);
                        if (ship.getDeck() == 0) {
                            ships.remove(ship);
                            System.out.println("Всё! Корабль утонул! До победы осталось потопить — " + ships.size());
                        }
                    }
                }
            }
            shoot(gameField, ships);
        } else {
            System.out.println("Мимо!");
        }
        scanner.close();
    }

}
