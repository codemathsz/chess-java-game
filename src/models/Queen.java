package models;

public class Queen extends Piece{

    public Queen(Integer y, Integer x, PieceColor color){
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        // logic
        this.setY(newY);
        this.setX(newX);
        return false;
    }
}
