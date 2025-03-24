package FinalProject2;

import java.util.List;

public class Ship {
    private List<int[]> coordinates;

    public Ship(List<int[]> coordinates) {
        this.coordinates = coordinates;
    }

    public List<int[]> getCoordinates() {
        return coordinates;
    }
}
