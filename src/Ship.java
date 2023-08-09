public abstract class Ship {
    private int deck;
    private String coordinates;
    private String[] coordinatesArray;

    public Ship(String coordinates) {
        this.coordinatesArray = coordinates.split(";");
        this.deck = coordinatesArray.length;
        this.coordinates = coordinates;
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

    public abstract String[][] createShip(String[][] gameField);
}
