package models;

public class Horse extends Piece{
    public Horse(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        // logic
        this.setY(newY);
        this.setX(newX);
        return false;
    }
}
