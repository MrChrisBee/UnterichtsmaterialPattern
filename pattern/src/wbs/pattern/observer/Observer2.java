package wbs.pattern.observer;

public class Observer2 implements Observer {
	private Subject subject;

	public Observer2(Subject mySub) {
		subject = mySub;
	}

	@Override
	public void stateChanged() {
		int zus = 0;
		if (((zus = subject.gibZustand()) % 2) == 0)
			System.out.println("von o2: Der Wert von " + subject.getClass().getName() + " hat sich auf " + zus + " geändert.");
	}
}
 