package wbs.composition_and_delegation;
/*
 * Wir definieren die Interfaces I1 und I2 mit jeweils 2 Methoden
 * 
 * Wir definieren die Klasse C12
 * C12 is a I1
 * C12 is a I2
 * C12 has a I1
 * C12 has a I2
 * 
 * C12 delegiert alle aufrufe der Methoden  von I1 und I2 
 * an die Objekte zu denen eine Has A - Beziehung besteht
 * 
 * (Hinweis: Source / generate delegate Methods)
 * 
 */

interface I1 {
	void m11();
	void m12();
}
interface I2 {
	void m21();
	void m22();
}

class C12 implements I1, I2{

	I1 a;
	I2 b;
	
	public C12(I1 a, I2 b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void m11() {
		a.m11();
	}

	public void m12() {
		a.m12();
	}

	public void m21() {
		b.m21();
	}

	public void m22() {
		b.m22();
	}
	
}

/*
 * Wir definieren nun 2 Hilfsklassen die jeweils eine der Hilfsklassen implementieren
 * und illustrieren die Verwendung der main() - Methode
 */
	
	class I1Impl implements I1 {

		@Override
		public void m11() {
			System.out.println("Meldung aus m11");
		}

		@Override
		public void m12() {
			System.out.println("Meldung aus m12");
		}
	}
	
	class I2Impl implements I2 {

		@Override
		public void m21() {
			System.out.println("Meldung aus m21");
			
		}

		@Override
		public void m22() {
			System.out.println("Meldung aus m22");
		}
	}
	
	public class CompositionAndDelegationDemo {
		
		public static void main(String[] args) {
			I2 i2Imp = new I2Impl();
			I1 i1Imp = new I1Impl();
			C12 c12 = new C12(i1Imp,i2Imp);
			c12.m22();
			c12.m11();
		}
	}
