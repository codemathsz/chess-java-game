package models;

public class Bishop extends Piece{

    public Bishop(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        return Math.abs(this.getY() - newY) == Math.abs(this.getX() - newX);
    }
}
