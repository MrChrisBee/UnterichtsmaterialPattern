package wbs.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * Das Subjekt Informiert alle bei Ihm 
 * registrierten Observer über jede Zustandsänderung
 * 
 * es bietet Methoden zur Registrierung und Deregistrierung von Observern
 * und es bietet eine Methode zum setzen des Zustandes
 */
public class Subject {

	private int state;
	private List<Observer> observer = new ArrayList<>();

	public void registriere(Observer beobachter) {
		
		if (!observer.contains(beobachter)) {
			observer.add(beobachter);
		}
	}
	public void deregistriere(Observer beobachter) {
		observer.remove(observer);
	}
	
	public int gibZustand(){
		return state;
	}
	public void setzeZustand(int state) {
		if (this.state != state) {
			this.state = state;
			for (Observer aktObserver : observer) {
				benachrichtigen(aktObserver);
			}
		}
	}

	private void benachrichtigen(Observer beobachter) {
		beobachter.stateChanged();
	}
} 