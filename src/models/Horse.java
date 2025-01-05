package models;

import utils.Utils;

public class Horse extends Piece{
    public Horse(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        return Utils.isMovementL(newY, newX, this.getY(), this.getX());
    }
}
