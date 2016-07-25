package wbs.pattern.template_method;

import java.util.ArrayList;

public abstract class AbstractGame {
	protected int actPlayer;
	protected int playersCount;
	protected boolean isNewGame = true;
	protected ArrayList<String> playerNames = new ArrayList<>();

	public abstract boolean doMove();

	public abstract void greet(String name);

	public abstract boolean gameOver();

	public void playGame() {
		int greets = 0;
		while (!gameOver()) {
			if (isNewGame) {
				greets++;
				greet(playerNames.get(actPlayer));
				if (greets == playersCount) {
					isNewGame = false;
				}
			}
			doMove();
			actPlayer = (actPlayer + 1) % playersCount;
		}
	}
}
