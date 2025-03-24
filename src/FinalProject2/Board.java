package FinalProject2;

public class Board {
    private final int SIZE = 10;
    private Cell[][] grid;

    public Board() {
        grid = new Cell[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = new Cell();
            }
        }
    }

    public void placeShip(Ship ship) {
        for (int[] coord : ship.getCoordinates()) {
            grid[coord[0]][coord[1]].setState(CellState.SHIP);
        }
    }

    public boolean attack(int x, int y) {
        if (grid[x][y].getState() == CellState.SHIP) {
            grid[x][y].setState(CellState.HIT);
            return true;
        } else {
            grid[x][y].setState(CellState.MISS);
            return false;
        }
    }

    public void printBoard(boolean hideShips) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (hideShips && grid[i][j].getState() == CellState.SHIP) {
                    System.out.print(CellState.EMPTY.getRepresentation() + " ");
                } else {
                    System.out.print(grid[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public Cell[][] getGrid() {
        return grid;
    }
}
