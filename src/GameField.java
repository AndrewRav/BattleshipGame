import java.util.Objects;
import java.util.Scanner;

public class GameField {

    public static String[][] createField() {
        String[][] field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = "☐";
            }
        }
        return field;
    }

    public static void printField(String[][] fieldToPrint) {
        System.out.println();
        for (String[] strings : fieldToPrint) {
            for (int j = 0; j < fieldToPrint.length; j++) {
                System.out.print(strings[j] + "\t");
            }
            System.out.println();
        }
    }

    public static void fillField(String[][] gameField) {
        Scanner scanner = new Scanner(System.in);
        String coordinates;
        String[] coordinatesArray, coords;
        int x = 0, y = 0;
        int counter = 1;
        String numberName = "первого";

        System.out.println("Координаты для четырёхпалубного корабля: ");
        coordinates = scanner.nextLine();
        coordinatesArray = coordinates.split(";");
        for (String coordsString : coordinatesArray) { // добавление корабля
            coords = coordsString.split(",");
            x = Integer.parseInt(coords[0]);
            y = Integer.parseInt(coords[1]);

            gameField[x][y] = "\uD83D\uDEA2";
            if (!Objects.equals(gameField[x][y + 1], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x][y - 1], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x + 1][y + 1], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x + 1][y], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x + 1][y - 1], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x + - 1][y - 1], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x - 1][y], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
            if (!Objects.equals(gameField[x - 1][y + 1], "\uD83D\uDEA2")) {
                gameField[x + 1][y] = "▨";
            }
        }

        while (counter <= 2) {
            if (counter == 2) {
                numberName = "второго";
            }
            System.out.println("Координаты для " + numberName + " трёхпалубного корабля: ");
            coordinates = scanner.nextLine();
            coordinatesArray = coordinates.split(";");
            for (String coordsString : coordinatesArray) { // добавление корабля
                coords = coordsString.split(",");
                x = Integer.parseInt(coords[0]);
                y = Integer.parseInt(coords[1]);

                if (gameField[x][y].equals("☐")) {
                    gameField[x][y] = "\uD83D\uDEA2";
                    if (!Objects.equals(gameField[x][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + - 1][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x - 1][y], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x - 1][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                }
            }
            counter++;
        }

        counter = 1;
        while (counter <= 3) {
            switch (counter) {
                case 1 -> numberName = "первого";
                case 2 -> numberName = "второго";
                case 3 -> numberName = "третьего";
            }
            System.out.println("Координаты для " + numberName + " двухпалубного корабля: ");
            coordinates = scanner.nextLine();
            coordinatesArray = coordinates.split(";");
            for (String coordsString : coordinatesArray) { // добавление корабля
                coords = coordsString.split(",");

                x = Integer.parseInt(coords[0]);
                y = Integer.parseInt(coords[1]);

                if (gameField[x][y].equals("☐")) {
                    gameField[x][y] = "\uD83D\uDEA2";
                    if (!Objects.equals(gameField[x][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + - 1][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x - 1][y], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x - 1][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                }
            }
            counter++;
        }

        counter = 1;
        while (counter <= 4) {
            switch (counter) {
                case 1 -> numberName = "первого";
                case 2 -> numberName = "второго";
                case 3 -> numberName = "третьего";
                case 4 -> numberName = "четвёртого";
            }
            System.out.println("Координаты для " + numberName + " однопалубного корабля: ");
            coordinates = scanner.nextLine();
            coordinatesArray = coordinates.split(";");
            for (String coordsString : coordinatesArray) { // добавление корабля
                coords = coordsString.split(",");

                x = Integer.parseInt(coords[0]);
                y = Integer.parseInt(coords[1]);

                if (gameField[x][y].equals("☐")) {
                    gameField[x][y] = "\uD83D\uDEA2";
                    if (!Objects.equals(gameField[x][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + 1][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x + - 1][y - 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x - 1][y], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                    if (!Objects.equals(gameField[x - 1][y + 1], "\uD83D\uDEA2")) {
                        gameField[x + 1][y] = "▨";
                    }
                }
            }
            counter++;
        }
    }

}
