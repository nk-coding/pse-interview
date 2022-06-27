package de.unistuttgart.iste.sqa.pse.interview;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * This class is used to solve some easy tasks.
 */
public class InterviewHamsterGame extends SimpleHamsterGame {

	public InterviewHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/PathWithGrains.ter");
		this.displayInNewGameWindow();
		game.startGame();

	}


	@Override
	protected void run() {
		// Move paule to the next wall and pick up all grains on the way
		// TODO
	}
}
