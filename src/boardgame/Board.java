package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece Piece(int row, int column) { //retorna a peça, e não o vetor
		return pieces[row][column];
	}
	
	
	public Piece Piece(Position position) { //retorna a peça, e não o vetor
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
