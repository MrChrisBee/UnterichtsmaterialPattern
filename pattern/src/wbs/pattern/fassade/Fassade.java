package wbs.pattern.fassade;

import wbs.pattern.fassade.package1.Class1;
import wbs.pattern.fassade.package2.Class2;
import wbs.pattern.fassade.package3.Class3;

public class Fassade {
	public int doSomething() {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		Class3 c3 = new Class3();
		c1.doStuff(c2);
		c3.setX(c1.getX());
		return c3.getY();
	}
}
