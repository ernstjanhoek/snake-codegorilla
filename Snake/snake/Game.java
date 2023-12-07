package snake;
public class Game {
    char[][] gridArray;
    Game() {
        this.gridArray = new char[20][20];
        for (int i = 0; i < gridArray.length; i++) {
            for (int j = 0; j < gridArray.length; j++) {
                this.gridArray[i][j] = '.';
            }
        }
    }
    void resetData() {
        for (int i = 0; i < gridArray.length; i++) {
            for (int j = 0; j < gridArray.length; j++) {
                this.gridArray[i][j] = '.';
            }
        }
    }
    public String toString() {
        StringBuilder message = new StringBuilder();
        for (int i = 0; i < this.gridArray.length; i++) {
            for (int j = 0; j < this.gridArray.length; j++) {
                message.append(this.gridArray[i][j]);
            }
            message.append("\n");
        }
        return message.toString();
    }
    public boolean coordinatesOutOfBounds(Coordinate coordinate) {
        return (this.gridArray.length - 1 < coordinate.x || coordinate.x < 0 || coordinate.y < 0 || this.gridArray.length  - 1 < coordinate.y);
    }
}