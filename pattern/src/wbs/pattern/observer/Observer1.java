package wbs.pattern.observer;

public class Observer1 implements Observer {
	private Subject subject;

	public Observer1(Subject mySub) {
		subject = mySub;
	}

	@Override
	public void stateChanged() {
		System.out.println("		von o1: Der Wert von " + subject.getClass().getName() 
				+ " hat sich auf " + subject.gibZustand() + " geändert.");
	}

}
