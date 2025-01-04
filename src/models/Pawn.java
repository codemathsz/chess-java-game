package models;

public class Pawn extends Piece{

    public Pawn(Integer y, Integer x, PieceColor color) {
        super(y, x, color);
    }

    public boolean movedValid(Integer newY, Integer newX) {
        if (this.getColor() == PieceColor.BLACK) {
            // Movimento de uma casa para frente
            if (newY == this.getY() - 1 && newX == this.getX()) {
                return true;
            }
            // Movimento de duas casas para frente a partir da posição inicial
            if (this.getY() == 6 && newY == this.getY() - 2 && newX == this.getX()) {
                return true;
            }
            // Captura na diagonal
            if (newY == this.getY() - 1 && (newX == this.getX() - 1 || newX == this.getX() + 1)) {
                return true;
            }
        } else {
            // Movimento de uma casa para frente
            if (newY == this.getY() + 1 && newX == this.getX()) {
                return true;
            }
            // Movimento de duas casas para frente a partir da posição inicial
            if (this.getY() == 1 && newY == this.getY() + 2 && newX == this.getX()) {
                return true;
            }
            // Captura na diagonal
            if (newY == this.getY() + 1 && (newX == this.getX() - 1 || newX == this.getX() + 1)) {
                return true;
            }
        }
        return false;
    }
}
