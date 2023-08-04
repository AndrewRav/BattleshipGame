import java.util.Scanner;

public class GameField {

    public static String[][] createField() {
        String[][] field = new String[11][11];
        for (int i = 1; i < field.length; i++) {
            for (int j = 1; j < field.length; j++) {
                field[i][j] = "☐";
            }
        }
        return field;
    }

    public static void printField(String[][] fieldToPrint) {
        System.out.println();
        for (int i = 1; i < fieldToPrint.length; i++) {
            for (int j = 1; j < fieldToPrint.length; j++) {
                System.out.print(fieldToPrint[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void fillField(String[][] gameField) {
        Scanner scanner = new Scanner(System.in);
        String coordinates;
        String[] coordinatesArray, coords;
        int counter = 1;
        String numberName = "первого";

        System.out.println("Координаты для четырёхпалубного корабля: ");
        coordinates = scanner.nextLine();
        coordinatesArray = coordinates.split(";");
        for (String coordsString : coordinatesArray) {
            coords = coordsString.split(",");
            gameField[Integer.parseInt(coords[0])][Integer.parseInt(coords[1])] = "\uD83D\uDEA2"; // добавление корабля
        }

        while (counter <= 2) {
            if (counter == 2) {
                numberName = "второго";
            }
            System.out.println("Координаты для " + numberName + " трёхпалубного корабля: ");
            coordinates = scanner.nextLine();
            coordinatesArray = coordinates.split(";");
            for (String coordsString : coordinatesArray) {
                coords = coordsString.split(",");
                gameField[Integer.parseInt(coords[0])][Integer.parseInt(coords[1])] = "\uD83D\uDEA2"; // добавление корабля
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
            for (String coordsString : coordinatesArray) {
                coords = coordsString.split(",");
                gameField[Integer.parseInt(coords[0])][Integer.parseInt(coords[1])] = "\uD83D\uDEA2"; // добавление корабля
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
            for (String coordsString : coordinatesArray) {
                coords = coordsString.split(",");
                gameField[Integer.parseInt(coords[0])][Integer.parseInt(coords[1])] = "\uD83D\uDEA2"; // добавление корабля
            }
            counter++;
        }
    }

}
