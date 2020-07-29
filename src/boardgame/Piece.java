package boardgame;

public class Piece {
	protected Position position; //posição, atributo row e column
	private Board board; //peça pertence ao tabuleiro
	
	public Piece(Board board) {
		this.board = board;
		position = null; //
	}

	private Board getBoard() {
		return board;
	}
	
}
