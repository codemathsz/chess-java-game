package models;

import utils.Utils;

public class Tower extends Piece{
    public Tower(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        return !Utils.isDiagonalMove(newY, newX, this.getY(), this.getX());
    }
}

