package Snake;

import java.util.Objects;

class Coordinate {
    int x, y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean collides(Coordinate otherCoordinate) {
        return this.x == otherCoordinate.x && this.y == otherCoordinate.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    void update(Directions option) {
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
