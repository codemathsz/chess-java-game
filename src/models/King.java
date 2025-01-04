package models;

public class King extends Piece{
  
  public King(Integer y, Integer x, PieceColor color){
    super(y, x, color);
  }

  public boolean movedValid(Integer newY, Integer newX) {
    // logic
    this.setY(newY);
    this.setX(newX);
    return false;
  }
}
