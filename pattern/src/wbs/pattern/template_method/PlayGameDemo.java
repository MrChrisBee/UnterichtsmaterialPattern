package wbs.pattern.template_method;

public class PlayGameDemo {

	public static void main(String[] args) {
		AbstractGame chess = new ChessGame("Peter","Susanne");
		AbstractGame nim = new NimGame("Klaus","Hannelore");
		nim.playGame();
		System.out.println("-------------------------------------------------------------------------");
		chess.playGame();
	}

}
