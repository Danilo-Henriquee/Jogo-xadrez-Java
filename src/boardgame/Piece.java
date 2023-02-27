package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece() {
	}

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	// only class or subclass are in the same package(boardgame) can acess.
	protected Board getBoard() {
		return board;
	}
	
}
