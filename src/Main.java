import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] gameFieldPlayer1 = GameField.createField();
        String[][] gameFieldPlayer2 = GameField.createField();

        System.out.println("Давайте расставлять корабли. Начинает ПЕРВЫЙ игрок. Другой игрок, не смотри!");
        GameField.fillField(gameFieldPlayer1);

        System.out.println("Теперь расставляет корабли ВТОРОЙ игрок. Другой игрок, не смотри!");
        GameField.fillField(gameFieldPlayer2);

        GameField.printField(gameFieldPlayer1);
        GameField.printField(gameFieldPlayer2);
    }
}