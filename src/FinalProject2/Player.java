package FinalProject2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private String name;
    private Board board;
    private List<Ship> ships;
    private Scanner scanner;

    public Player(String name) {
        this.name = name;
        this.board = new Board();
        this.ships = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        placeShips();
    }

    private void placeShips() {
        int[] shipSizes = {4, 3, 3, 2, 2, 2, 1, 1, 1, 1};

        for (int size : shipSizes) {
            System.out.println(name + ", енгіз координаттарды " + size + "-ұяшықты кеме үшін (x,y;x,y;...)");
            List<int[]> coordinates = new ArrayList<>();
            String[] input = scanner.nextLine().split(";");
            for (String coord : input) {
                String[] xy = coord.split(",");
                coordinates.add(new int[]{Integer.parseInt(xy[0]), Integer.parseInt(xy[1])});
            }
            Ship ship = new Ship(coordinates);
            ships.add(ship);
            board.placeShip(ship);
        }
    }

    public boolean attack(Player opponent) {
        System.out.println(name + ", қарсыласты ат (x,y): ");
        String[] input = scanner.nextLine().split(",");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);

        return opponent.getBoard().attack(x, y);
    }

    public Board getBoard() {
        return board;
    }

    public boolean hasShipsRemaining() {
        return ships.stream().anyMatch(ship -> ship.getCoordinates().stream()
                .anyMatch(coord -> board.getGrid()[coord[0]][coord[1]].getState() == CellState.SHIP));
    }

    public String getName() {
        return name;
    }
}
