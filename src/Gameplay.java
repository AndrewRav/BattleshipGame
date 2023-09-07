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
        GameField.fillField(gameFieldPlayer1);

        // Работа с игровым полем второго игрока
        System.out.println("Координаты вводит второй игрок. Первый не подсматривай!");
        GameField.fillField(gameFieldPlayer2);

        System.out.println("Поле первого игрока:");
        GameField.printField(gameFieldPlayer1);

        System.out.println("Поле второго игрока:");
        GameField.printField(gameFieldPlayer2);
    }

}
