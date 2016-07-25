package wbs.pattern.singelton;
/*
 * lazy initialisation 
 * kontrolle ist eine modifikation von mir
 * eigentlich wird über eine referenz==null entscheiden   
 */
public class Singelton1 {
	private static Singelton1 singelton;
	public static int kontrolle = 0;

	private Singelton1() {
		if (kontrolle != 0)
			throw new AssertionError("Ihr habt mich überlistet! Super!");
		kontrolle++;
	}

	public static synchronized Singelton1 getInstance() {
		return (kontrolle == 0)?singelton = new Singelton1():singelton;
	}
}
