package FinalProject2;

public class Cell {
    private CellState state;

    public Cell() {
        this.state = CellState.EMPTY;
    }

    public CellState getState() {
        return state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public String toString() {
        return state.getRepresentation();
    }
}
