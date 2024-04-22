package Snake;

import java.util.ArrayList;

public class Snake extends Game {
    TileEnum[][] gridArray;
    Directions currentDir;
    Coordinate snakeHead;
    Coordinate currentApple;
    ArrayList<Coordinate> coordinateArray;

    Snake(Coordinate startPos) {
        this.snakeHead = startPos;
        this.coordinateArray = new ArrayList<>();
        this.gridArray = super.getOriginalGrid();
        this.placeSnake();
        this.currentApple = AppleGenerator.generateAppleCoordinates(this.snakeHead, this.coordinateArray, this.gridArray.length);
        this.placeApple();
    }

    public void setCurrentDir(Directions currentDir) {
        this.currentDir = currentDir;
    }

    public void updateGrid() {
        this.gridArray = super.getOriginalGrid();
        this.placeApple();
        this.placeSnake();
    }

    private void placeSnake() {
        for (Coordinate coordinate : this.coordinateArray) {
            this.gridArray[coordinate.y][coordinate.x] = TileEnum.SNAKE;
        }
        this.gridArray[snakeHead.y][snakeHead.x] = TileEnum.SNAKE;
    }

    private void placeApple() {
        this.gridArray[currentApple.y][currentApple.x] = TileEnum.APPLE;
    }

    public void move() throws Exception {
        if (snakeHead.collides(this.currentApple)) { // grow and move
            this.coordinateArray.add(this.currentApple);
            this.currentApple = AppleGenerator.generateAppleCoordinates(this.snakeHead, this.coordinateArray, gridArray.length);// generate new and set new apple!
        }
        for (int i = coordinateArray.size()-1; i >= 0; --i) {
           if (i == 0 ) {
               coordinateArray.set(i, new Coordinate(snakeHead.x, snakeHead.y));
           } else {
               coordinateArray.set(i, coordinateArray.get(i-1));
           }
        }
        this.snakeHead.update(this.currentDir);
        if (this.coordinateArray.contains(this.snakeHead)) {
            throw new Exception ();
        }
    }
}
