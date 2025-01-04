package models;

public class Tower extends Piece{
    public Tower(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        // logic
        this.setY(newY);
        this.setX(newX);
        return false;
    }
}
