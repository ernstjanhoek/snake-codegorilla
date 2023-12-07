package snake;

import java.util.ArrayList;
class Snake {
    Snake(Coordinate startPos) {
        this.snakeHead = startPos;
    }
    Directions currentDir;
    Coordinate snakeHead;
    ArrayList<Coordinate> coordinateArray;
    Coordinate currentApple;
    public void setCurrentDir(Directions currentDir) {
        this.currentDir = currentDir;
    }
    public void moveSnake() {
        snakeHead.move(currentDir);
    }
}

// public void placeSnake(Game game) {
//     for (Coordinate coordinate: coordinateArray) {
//         game.gridArray[coordinate.y][coordinate.x] = '@';
//     }
// }
// public void pointSnake(Coordinate coordinate) {
//     coordinateArray = new Coordinate[]{coordinate};
// }
// Snake(int value) {
//     coordinateArray = new Coordinate[value];
//     numberOfElements = value;
// }
// void eatApple(Coordinate appleCoordinate) {
//     numberOfElements++;
//     Coordinate[] newSnakeArray = new Coordinate[numberOfElements];
//     newSnakeArray[0] = appleCoordinate;
//     for (int i = 1; i < numberOfElements; i++) {
//         newSnakeArray[i] = this.coordinateArray[i - 1];
//     }
//     this.coordinateArray = newSnakeArray;
// }
// void updateSnake() {
//     for (int i = this.coordinateArray.length-1; i>= 0; i--) {
//         System.out.println(i + "update");
//         if (i == 0) {
//             this.coordinateArray[0].move(currentDir);
//         } else {
//             this.coordinateArray[i] = this.coordinateArray[i - 1];
//         }
//     }
// }
class Coordinate {
    int x, y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean collision(Coordinate otherCoordinate) {
        return this.x == otherCoordinate.x && this.y == otherCoordinate.y;

    }
    void move(Directions option) {
        switch (option) {
            case UP:
                this.y--;
                break;
            case DOWN:
                this.y++;
                break;
            case LEFT:
                this.x--;
                break;
            case RIGHT:
                this.x++;
                break;
        }
    }
}