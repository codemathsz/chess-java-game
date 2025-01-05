package models;

public class King extends Piece{
  
  public King(Integer y, Integer x, PieceColor color){
    super(y, x, color);
  }

  public boolean movedValid(Integer newY, Integer newX) {

    return (newY == this.getY() + 1 || newY == this.getY() - 1)
            || (newX == this.getX() + 1 || newX == this.getX() - 1)
            && Math.abs(this.getY() - newY) != Math.abs(this.getX() - newX);
  }
}
