package models;

public class Bishop extends Piece{

    public Bishop(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        // logic
        if (this.getColor() == PieceColor.BLACK) {
            return true;
        } else {

        }
        return false;
    }
}
