package wbs.pattern.observer;

/*
 * Der Observer deklariert eie Methode,
 * die das Subjekt bei einer Zustandsänderung 
 * für alle registrierten Observer aufruft. 
 */
public interface Observer {
	public void stateChanged();
}
