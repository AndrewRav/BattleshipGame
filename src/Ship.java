public class Ship {
    private int deck;
    private String coordinates;
    private String[] coordinatesArray;

    public Ship(String coordinates) {
        this.coordinates = coordinates;
        this.coordinatesArray = coordinates.split(";"); // [1,2]; [3,4]; [5,6] ...
        this.deck = coordinatesArray.length;
    }

    public int getDeck() {
        return deck;
    }

    public void setDeck(int deck) {
        this.deck = deck;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String[] getCoordinatesArray() {
        return coordinatesArray;
    }

    public void setCoordinatesArray(String[] coordinatesArray) {
        this.coordinatesArray = coordinatesArray;
    }

    public void createShip(String[][] gameField) {
        // Создание палуб
        int x = 0, y = 0;
        for (String deckCoordinate : coordinatesArray) {
            x = Integer.parseInt(deckCoordinate.split(",")[0]);
            y = Integer.parseInt(deckCoordinate.split(",")[1]);

            if (gameField[x][y].equals("☐")) {
                gameField[x][y] = "\uD83D\uDEA2";
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
