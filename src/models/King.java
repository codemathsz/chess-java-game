package models;

import utils.Utils;

public class King extends Piece{
  
  public King(Integer y, Integer x, PieceColor color){
    super(y, x, color);
  }

  public boolean movedValid(Integer newY, Integer newX) {

    return Utils.isMovementOneHome(newY, newX, this.getY(), this.getX())
            && !Utils.isDiagonalMove(newY, newX, this.getY(), this.getX());
  }
}
