package chessSystem.entitites.chess;

import chessSystem.entities.boardgame.Position;
import chessSystem.exceptions.ChessException;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		// Comparadores aceitam caracteres
		if (column < 'a' || column > 'g' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating Chess Position. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' + position.getColumn()), (8 - position.getRow()));
	}

	public String toString() {
		// Faz assim pra concatenar uma formação de strings
		return "" + column + row;
	}
}
