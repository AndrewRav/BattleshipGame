import java.util.ArrayList;
import java.util.List;

public class Ship {
    private static int deck;
    private String[] coordinatesArray;

    public Ship(String coordinates) {
        this.coordinatesArray = coordinates.split(";"); // [1,2]; [3,4]; [5,6] ...
        this.deck = coordinatesArray.length;
    }

    public int getDeck() {
        return deck;
    }

    public String[] getCoordinatesArray() {
        return coordinatesArray;
    }

    public void createShip(String[][] gameField, int requiredDeckNumber) throws InputCoordinatesException {
        ArrayList<Integer> deckCoordinatesList = new ArrayList<>();
        // Проверка введённых координат
        if (requiredDeckNumber != deck) {
            throw new InputCoordinatesException("Вы ввели неверное число палуб, попробуйте ещё раз");
        }
        // Создание палуб
        int x = 0, y = 0;
        for (String deckCoordinate : coordinatesArray) {
            x = Integer.parseInt(deckCoordinate.split(",")[0]);
            y = Integer.parseInt(deckCoordinate.split(",")[1]);
            deckCoordinatesList.add(x);
            deckCoordinatesList.add(y);

            if ((x < 0 && y < 0) || (x > 9 && y > 9)) {
                throw new InputCoordinatesException("Вы ввели число из неверного диапазона (т. е. либо меньше 0, либо больше 9)");
            }

            if (deckCoordinate.split(",").length != 2) {
                throw new InputCoordinatesException("Вы ввели неверное количество координат. Напоминаем формат: x,y;x,y;x,y...]");
            }

            if (gameField[x][y].equals("☐")) {
                gameField[x][y] = "\uD83D\uDEA2";
            } else {
                throw new InputCoordinatesException("Место, в которую вы хотите поставить палубу, уже занято");
            }
        }
        // Валидация кораблей
        int temp = deckCoordinatesList.get(0);
        for (int i = 1; i < deckCoordinatesList.size(); i++) {
            if (i % 2 == 0) {
                if (temp + 1 != deckCoordinatesList.get(i) && temp - 1 != deckCoordinatesList.get(i)) {
                    throw new InputCoordinatesException("Вы ставите палубы не последовательно! Внимательно попробуйте ещё раз");
                } else {
                    temp = deckCoordinatesList.get(i);
                }
            } else {
                if (temp + 1 != deckCoordinatesList.get(i) && temp - 1 != deckCoordinatesList.get(i)) {
                    throw new InputCoordinatesException("Вы ставите палубы не последовательно! Внимательно попробуйте ещё раз");
                } else {
                    temp = deckCoordinatesList.get(i);
                }
            }
        }

        // Добавление ореол вокруг палуб
        for (String deckCoordinate : coordinatesArray) {
            x = Integer.parseInt(deckCoordinate.split(",")[0]);
            y = Integer.parseInt(deckCoordinate.split(",")[1]);

            if (y < 9) {
                if (gameField[x][y + 1] != "\uD83D\uDEA2") {
                    gameField[x][y + 1] = "▨";
                }
                if (x < 9) {
                    if (gameField[x + 1][y + 1] != "\uD83D\uDEA2") {
                        gameField[x + 1][y + 1] = "▨";
                    }
                }
                if (x > 0) {
                    if (gameField[x - 1][y + 1] != "\uD83D\uDEA2") {
                        gameField[x - 1][y + 1] = "▨";
                    }
                }
            }

            if (y > 0) {
                if (gameField[x][y - 1] != "\uD83D\uDEA2") {
                    gameField[x][y - 1] = "▨";
                }
                if (x > 0) {
                    if (gameField[x - 1][y - 1] != "\uD83D\uDEA2") {
                        gameField[x - 1][y - 1] = "▨";
                    }
                }
                if (x < 9) {
                    if (gameField[x + 1][y - 1] != "\uD83D\uDEA2") {
                        gameField[x + 1][y - 1] = "▨";
                    }
                }
            }

            if (x < 9) {
                if (gameField[x + 1][y] != "\uD83D\uDEA2") {
                    gameField[x + 1][y] = "▨";
                }
            }
            if (x > 0) {
                if (gameField[x - 1][y] != "\uD83D\uDEA2") {
                    gameField[x - 1][y] = "▨";
                }
            }
        }
    }
}
