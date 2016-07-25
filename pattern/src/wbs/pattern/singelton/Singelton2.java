package wbs.pattern.singelton;

/*
 * wir implementieren das Singelton-Pattern unter 
 * Verwendung eines statischen Initialisierers
 */


/*
 * eager initialisation (eager - eifrig, bereitwillig)
 * die Instanz wird immer erzeugt, in Unterschied zu Singelton1,
 * wo sie nur erzeugt wird, wenn die Methode getInstance() auch aufgerufen wird
 */

public class Singelton2 {
	
	static {
		SINGELTON2 = new Singelton2();
	}

	private static final Singelton2 SINGELTON2;

	public static Singelton2 getInstance() {
		return SINGELTON2;
	}
	
	

}
