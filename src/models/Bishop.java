package models;

import utils.Utils;

public class Bishop extends Piece{

    public Bishop(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        return Utils.isDiagonalMove(newY, newX, this.getY(), this.getX());
    }
}
