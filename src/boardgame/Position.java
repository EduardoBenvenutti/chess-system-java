package boardgame;

public class Position {
	private int row; //atributo linha tipo inteiro
	private int column; //atributo coluna tipo inteiro
	
	public Position() {
	}
	
	public Position(int row, int column) { //construtor
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row+", "+column;
	}
}
