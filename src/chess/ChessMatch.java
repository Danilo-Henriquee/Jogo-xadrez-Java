package chess;

import boardgame.Board;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	/* esse metodo vai ter que retornar uma matriz de peças de xadrez
	 * correspondetes a uma partida */
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		/* esse for serve para percorrer a matriz de peças que é o board
		 * e para cada peça do meu tabuleiro vou fazer um downcasting
		 * para ChessPiece */ 
		for (int i=0; i<board.getRows(); i++) {
			for(int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
}
