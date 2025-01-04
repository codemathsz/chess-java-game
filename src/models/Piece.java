package models;

public abstract class Piece {
  private Integer y;
  private Integer x;
  private PieceColor color;

  public Piece(Integer y, Integer x, PieceColor color) {
    this.y = y;
    this.x = x; 
    this.color = color; 
  }

  public Integer getY() {
    return y;
  }

  public void setY(Integer y) {
    this.y = y;
  }

  public Integer getX() {
    return x;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public PieceColor getColor() {
    return color;
  }

  public void setColor(PieceColor color) {
    this.color = color;
  }

  public abstract boolean movedValid(Integer newI, Integer newX);
}
