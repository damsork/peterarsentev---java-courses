package ru.lessons.lesson_13.console;

import ru.lessons.lesson_13.Board;
import ru.lessons.lesson_13.Cell;

/**
 * TODO: comment
 * @author parsentev
 * @since 08.04.2015
 */
public class ConsoleBoard implements Board {
	private Cell[][] cells;

	@Override
	public void drawBoard(Cell[][] cells) {
		this.cells = cells;
		this.redraw(false);
	}

	@Override
	public void drawCell(int x, int y) {
		System.out.println("***** SELECT ******");
		this.redraw(false);
	}

	@Override
	public void drawBang() {
		System.out.println("***** BANG ******");
		this.redraw(true);
	}

	@Override
	public void congratulate() {
		System.out.println("***** CONGRATULATE ******");
	}

	private void redraw(boolean real) {
		for (Cell[] row : cells) {
			for (Cell cell : row) {
				cell.draw(System.out, real);
			}
			System.out.println();
		}
		System.out.println();
	}
}
