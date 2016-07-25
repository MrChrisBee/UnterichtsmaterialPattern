package wbs.pattern.observer;

public class ObserverDemo {
	/*
	 * Erzeugt ein Subject, einen Observer1, einen Observer2
	 * registriert beider Observer beim Subject
	 * ändert den Zustand von Subject ein paar mal  
	 *  
	 */
	public static void main(String[] args) {
		Subject mySub = new Subject();
		Observer1 obs1 = new Observer1(mySub);
		Observer2 obs2 = new Observer2(mySub);
		mySub.registriere(obs1);
		mySub.registriere(obs2);
		for (int j = 0; j <= 10; j++) {
			mySub.setzeZustand(j);
		}
	}

}
