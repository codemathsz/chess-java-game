package models;

import utils.Utils;

public class Queen extends Piece{

    public Queen(Integer y, Integer x, PieceColor color){
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        // logic
        if( Utils.isMovementL(newY, newX, this.getY(), this.getX())){
            return false;
        }
        return true;
    }
}
