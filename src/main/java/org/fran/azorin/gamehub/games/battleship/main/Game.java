package org.fran.azorin.gamehub.games.battleship.main;

import org.fran.azorin.gamehub.games.battleship.table.Table;

/**
 * @author Fran Azorin
 *
 */
public class Game {

	public static void play() {
		
		Table table = new Table();
		table.setShip();
		PrintTable.printTable(table.getTable());
	}

}