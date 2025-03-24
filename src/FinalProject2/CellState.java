package FinalProject2;

public enum CellState {
    EMPTY("⬜"), SHIP("\uD83D\uDEE5"), HIT("\uD83D\uDFE5"), MISS("\uD83D\uDFE6");

    private final String representation;

    CellState(String representation) {
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
