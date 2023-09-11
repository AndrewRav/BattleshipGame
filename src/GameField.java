import java.util.ArrayList;
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

    public static void fillField(String[][] gameField, ArrayList<Ship> ships) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Создание четырёх однопалубных кораблей
            System.out.println("Введите координаты для 1-ого однопалубного корабля:");
            String coordinates = scanner.nextLine();
            Ship oneDeckShip_1 = new Ship(coordinates);
            oneDeckShip_1.createShip(gameField, 1);

            System.out.println("Введите координаты для 2-ого однопалубного корабля:");
            String coordinates1 = scanner.nextLine();
            Ship oneDeckShip_2 = new Ship(coordinates1);
            oneDeckShip_2.createShip(gameField, 1);

            System.out.println("Введите координаты для 3-ого однопалубного корабля:");
            String coordinates2 = scanner.nextLine();
            Ship oneDeckShip_3 = new Ship(coordinates2);
            oneDeckShip_3.createShip(gameField, 1);

            System.out.println("Введите координаты для 4-ого однопалубного корабля:");
            String coordinates3 = scanner.nextLine();
            Ship oneDeckShip_4 = new Ship(coordinates3);
            oneDeckShip_4.createShip(gameField, 1);

            // Создание трёх двухпалубных кораблей
            System.out.println("Введите координаты для 1-ого двухпалубного корабля:");
            String coordinates4 = scanner.nextLine();
            Ship twoDeckShip_1 = new Ship(coordinates4);
            twoDeckShip_1.createShip(gameField, 2);

            System.out.println("Введите координаты для 2-ого двухпалубного корабля:");
            String coordinates5 = scanner.nextLine();
            Ship twoDeckShip_2 = new Ship(coordinates5);
            twoDeckShip_2.createShip(gameField, 2);

            System.out.println("Введите координаты для 3-ого двухпалубного корабля:");
            String coordinates6 = scanner.nextLine();
            Ship twoDeckShip_3 = new Ship(coordinates6);
            twoDeckShip_3.createShip(gameField, 2);

            // Создание двух трёхпалубных кораблей
            System.out.println("Введите координаты для 1-ого трёхпалубного корабля:");
            String coordinates7 = scanner.nextLine();
            Ship threeDeckShip_1 = new Ship(coordinates7);
            threeDeckShip_1.createShip(gameField, 3);

            System.out.println("Введите координаты для 2-ого трёхпалубного корабля:");
            String coordinates8 = scanner.nextLine();
            Ship threeDeckShip_2 = new Ship(coordinates8);
            threeDeckShip_2.createShip(gameField, 3);

            // Создание одного четырёхпалубного корабля
            System.out.println("Введите координаты для четырёхпалубного корабля:");
            String coordinates9 = scanner.nextLine();
            Ship fourDeckShip = new Ship(coordinates9);
            fourDeckShip.createShip(gameField, 4);

            ships.add(oneDeckShip_1);
            ships.add(oneDeckShip_2);
            ships.add(oneDeckShip_3);
            ships.add(oneDeckShip_4);

            ships.add(twoDeckShip_1);
            ships.add(twoDeckShip_2);
            ships.add(twoDeckShip_3);

            ships.add(threeDeckShip_1);
            ships.add(threeDeckShip_2);

            ships.add(fourDeckShip);

            scanner.close();

        } catch (InputCoordinatesException e) {
            ships.clear();
            fillField(gameField, ships);
        }
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
}
