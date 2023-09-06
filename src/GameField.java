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
}
