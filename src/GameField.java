public class GameField {
    private static String[][] field = new String[11][11];

    public static void setField(String[][] field) {
        GameField.field = field;
    }

    public static String[][] getField() {
        return field;
    }

    public static String[][] createField() {
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

}
