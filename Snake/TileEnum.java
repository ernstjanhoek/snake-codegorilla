package Snake;

enum TileEnum {
    SNAKE('@'), EMPTY(' '), APPLE('*');
    private final char c;

    TileEnum(char c) {
        this.c = c;
    }

    public char getValue() {
        return this.c;
    }
}
