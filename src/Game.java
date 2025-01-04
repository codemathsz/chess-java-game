import models.*;

import javax.swing.*;
import java.awt.*;

public class Game  {

  public static void main(String[] args) {
    Piece[][] initialPiece = new Piece [8][8];

    // whites
    initialPiece[0][0] = new Tower(0, 0, PieceColor.WHITE);
    initialPiece[0][7] = new Tower(0, 7, PieceColor.WHITE);
    initialPiece[0][1] = new Horse(0, 1, PieceColor.WHITE);
    initialPiece[0][6] = new Horse(0, 6, PieceColor.WHITE);
    initialPiece[0][2] = new Bishop(0, 2, PieceColor.WHITE);
    initialPiece[0][5] = new Bishop(0, 5, PieceColor.WHITE);
    initialPiece[0][3] = new King(0, 3, PieceColor.WHITE);
    initialPiece[0][4] = new Queen(0, 4, PieceColor.WHITE);

    // pawns white
    for (int x = 0; x < 8; x++){
      initialPiece[1][x] = new Pawn(1,x, PieceColor.WHITE);
    }

    // blacks
    initialPiece[7][0] = new Tower(7, 0, PieceColor.BLACK);
    initialPiece[7][7] = new Tower(7, 7, PieceColor.BLACK);
    initialPiece[7][1] = new Horse(7, 1, PieceColor.BLACK);
    initialPiece[7][6] = new Horse(7, 6, PieceColor.BLACK);
    initialPiece[7][2] = new Bishop(7, 2, PieceColor.BLACK);
    initialPiece[7][5] = new Bishop(7, 5, PieceColor.BLACK);
    initialPiece[7][3] = new King(7, 3, PieceColor.BLACK);
    initialPiece[7][4] = new Queen(7, 4, PieceColor.BLACK);
    for (int x = 0; x < 8; x++){
      initialPiece[6][x] = new Pawn(6,x, PieceColor.BLACK);
    }
    Board board = new Board(initialPiece);

    // interface
    JFrame frame = new JFrame("Tabuleiro de Xadrez");
    frame.add(board); frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}