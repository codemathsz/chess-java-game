package models;

public class Tower extends Piece{
    public Tower(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        return Math.abs(this.getY() - newY) != Math.abs(this.getX() - newX);
    }
}
