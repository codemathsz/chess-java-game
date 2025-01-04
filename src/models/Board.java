package models;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Board extends JPanel {
  private static final int TILE_SIZE = 80;
  private static final int BOARD_SIZE = 8;
  private Piece[][] board;
  private Piece selectedPiece;
  private int selectedRow = -1;
  private int selectedCol = -1;

  public Board(Piece[][] board){
    this.board = board;
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        int col = e.getX() / TILE_SIZE; int row = e.getY() / TILE_SIZE; handleMouseClick(row, col);
      }
    });
  }

  private void handleMouseClick(int row, int col) {
    if (selectedPiece == null) {
      selectedPiece = board[row][col];
      selectedRow = row;
      selectedCol = col;

      if(selectedPiece != null){
        System.out.println(selectedPiece.getY());
        System.out.println(selectedPiece.getX());
      }
    }else{
      System.out.println(row);
      System.out.println(col);
      System.out.println(selectedPiece.movedValid(row, col));
      if(board[row][col] != null && selectedPiece.getColor().equals(board[row][col].getColor())){
        selectedPiece = null;
        selectedRow = -1;
        selectedCol = -1;
      } else if(selectedPiece.movedValid(row, col)){
        this.board[selectedRow][selectedCol] = null;
        board[row][col] = selectedPiece;
        selectedPiece.setY(row);
        selectedPiece.setX(col);
        selectedPiece = null;
        selectedRow = -1;
        selectedCol = -1;
        repaint();
      }else{
        selectedPiece = null;
        selectedRow = -1;
        selectedCol = -1;
      }
    }
    repaint();
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int col = 0; col < BOARD_SIZE; col++) {
        boolean isWhite = (row + col) % 2 == 0;
        if (selectedPiece != null && row == selectedRow && col == selectedCol) {
          g.setColor(Color.GREEN);
        }else {
          g.setColor(isWhite ? Color.WHITE : Color.BLACK);
        }
        g.fillRect(col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Desenhar as peças
        Piece piece = board[row][col];
        if (piece != null) {
          g.setColor(piece.getColor() == PieceColor.WHITE ? Color.LIGHT_GRAY : Color.DARK_GRAY);
          g.fillOval(col * TILE_SIZE + 10, row * TILE_SIZE + 10, TILE_SIZE - 20, TILE_SIZE - 20);

          //
          g.setColor(piece.getColor() == PieceColor.WHITE ? Color.BLACK : Color.WHITE);
          g.setFont(new Font("Arial", Font.BOLD, 20));
          String pieceName = piece.getClass().getSimpleName().substring(0, 1);
          g.drawString(pieceName, col * TILE_SIZE + 35, row * TILE_SIZE + 45);
        }
      }
    }
  }

  @Override public Dimension getPreferredSize() { return new Dimension(TILE_SIZE * BOARD_SIZE, TILE_SIZE * BOARD_SIZE); }
}
