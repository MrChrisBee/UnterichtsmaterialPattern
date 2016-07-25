package wbs.design_by_contract;

import java.util.HashSet;
import java.util.Set;

class C1 {
	int n;

	public C1(int n) {
		this.n = n;
	}

	/*
	 * reflexiv? vergleich mit sich selbst => true
	 * symmetrisch? wenn a == b dann b == a => true
	 * transitiv? wenn a == b und b == c dann a == c => true
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj.getClass() == this.getClass()) {
			result = (this.n == ((C1) obj).n);
		}
		return result;
	}

	/*
	 * Die Klasse C1 verletzt den Vertrag, dass man, wenn man equals() 
	 * überschreibt, auch hashCode() überschreiben muss
	 */
}

/*
 * Wir schreiben nun die Klasse C2, sie stimmt mit der Klasse C1 überein,
 * überschreibt aber hashCode in korrekter Weise 
 */
class C2 extends C1 {

	public C2(int n) {
		super(n);
	}

	@Override
	public int hashCode() {
		return super.n;
	}

}

public class EqualsDemo {
	public static void main(String[] args) {
		System.out.println("So nicht: Wir haben zwar equals() korrekt überschreiben, aber nicht bedacht das auch hashCode() überschrieben werden muss");
		System.out.println("HashSet() besteht eigentlich nur aus verschiedenen Einträgen. \n"
				+ "Ob ein Eintrag sich von vorhandenen unterscheidet erkennt hashSet() indem es equals für die beinhaltende Klasse aufruft.");
		Set<C1> set1 = new HashSet<>();
		C1 c11 = new C1(2);
		C1 c12 = new C1(2);
		set1.add(c11);
		set1.add(c12);
		System.out.println(c11.equals(c12));
		System.out.println("Anzahl der Elemente : " + set1.size());
		System.out.println("__________________----------------________________");
		System.out.println("Jetzt wurde auch hashCode() überschrieben!");
		Set<C2> set2 = new HashSet<>();
		C2 c21 = new C2(2);
		C2 c22 = new C2(2);
		set2.add(c21);
		set2.add(c22);
		System.out.println(c21.equals(c22));
		System.out.println("Anzahl der Elemente : " + set2.size());
		System.out.println("__________________----------------________________");
		/*
		 * wir sorgen dafür das wir in einem HashSet 10 Referenzen 
		 * auf C2-Objekte unterbringen die alle gleich sind
		 */
		Set<C2> set3 = new HashSet<>();
		for(int i=0;i<10;i++) {
			set3.add(new C2(i));
		}
		System.out.println(set3.size());
		// der Gleichmacher
		System.out.println("Anzahl der elemente von set3:" +set3.size());
		for(C2 c2 : set3) {
			c2.n = 1;
		}
		boolean alleElementeSindGleich = true;
		for(C2 c2 : set3) {
			outer:
			for(C2 c2b : set3) {
				if (!c2.equals(c2b)) {
					alleElementeSindGleich = false;
					break outer;
				}
			}
		}
		System.out.println("Anzahl der elemente von set3:" + set3.size());
		System.out.println(alleElementeSindGleich);
	}
}
