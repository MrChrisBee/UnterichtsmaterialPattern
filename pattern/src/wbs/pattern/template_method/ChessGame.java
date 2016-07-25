package wbs.pattern.template_method;

public class ChessGame extends AbstractGame{
	private int gc = 0;
	

	public ChessGame(String name1, String name2) {
		super();
		this.actPlayer = 0;
		this.playersCount = 2;
		this.playerNames.add(name1);
		this.playerNames.add(name2);
	}

	@Override
	public boolean doMove() {
		System.out.println(playerNames.get(actPlayer) + " welche Katastrophe wollen Sie dieses mal verursachen? " + actPlayer);
		return true;
	}

	@Override
	public void greet(String name) {
		System.out.println("Hallo " + name + " lass uns Schach Spielen!");
	}

	@Override
	public boolean gameOver() {
		 gc++;
		return !(gc < 10);
	}

}
