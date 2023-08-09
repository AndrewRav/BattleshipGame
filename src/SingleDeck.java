public class SingleDeck extends Ship {

    public SingleDeck(String coordinates) {
        super(coordinates);
    }

    @Override
    public String[][] createShip(String[][] gameField) {

        return new String[0][];
    }

}
