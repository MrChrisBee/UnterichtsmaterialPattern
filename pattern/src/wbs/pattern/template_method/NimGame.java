package wbs.pattern.template_method;

public class NimGame extends AbstractGame {
	int gc = 0;

	public NimGame(String name1, String name2) {
		super();
		this.actPlayer = 0;
		this.playersCount = 2;
		this.playerNames.add(name1);
		this.playerNames.add(name2);
	}

	@Override
	public boolean doMove() {
		System.out.println(playerNames.get(actPlayer)  + " Dein Zug. Sag an was ich tun kann!");
		return false;
	}

	@Override
	public void greet(String name) {
		System.out.println("Hallo " + name + " du willst also jetzt Nim Spielen? Kennst Du überhaupt die Regeln?");
	}

	@Override
	public boolean gameOver() {
		gc++;
		return !(gc < 10);
	}

}
