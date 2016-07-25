package wbs.design_by_contract;


import java.util.List;

class Person {
	Integer alter;

	private Person mutti;
	private Person vati;
	private List<Person> kinder;

	public Person getMutti() {
		return mutti;
	}

	public void setMutti(Person mutti) {
		if (mutti.getAlter() > this.getAlter())
			this.mutti = mutti;
		else
			throw new IllegalArgumentException(
					"Deine Mutter hat es mit dem Kinderwunsch erheblich übertrieben und schon weit vor Ihrer Geburt ...");
	}

	public Person getVati() {
		return vati;
	}

	public void setVati(Person vati) {
		if (vati.getAlter() > this.getAlter())
			this.vati = vati;
		else
			throw new IllegalArgumentException(
					"Dein Vater hat es mit dem Kinderwunsch erheblich übertrieben und schon weit vor seiner Geburt ...");
	}

	public List<Person> getKinder() {
		return kinder;
	}

	public void setKind(Person kind) {
		if (this.alter > kind.alter)
			this.kinder.add(kind);
		else throw new IllegalArgumentException(
				"Wie kanst Du ein Kind bekommen das älter ist als Du, adoption? Is nich, das ist gegen die OCL, wieder abgeben!");
	}

	public void bekommtKind(Person mutti, Person vati) {
		Person kind = new Person();
		kind.setAlter(0);
		kind.setMutti(mutti);
		kind.setVati(vati);
		
		this.kinder.add(kind);
	}
 
	public void hatGeburtstag() {
		this.alter++;
	}

	public Integer getAlter() {
		return alter;
	}

	public void setAlter(Integer alter) {
		if (!(alter < 0))
			if ((alter < mutti.alter))
				this.alter = alter;
			else
				throw new IllegalArgumentException("Wiso bist Du älter als deine Mutter?");
		else
			throw new IllegalArgumentException("Das Alter darf nicht negativ sein");
	}

}

class UrAhnen extends Person {
	public UrAhnen() {
		this.alter = 999;
	}
}

@SuppressWarnings("unused")
class Auto {
	private String kennzeichen;
	private String marke;
	private Integer erstzulassung;
	private Integer baujahr;

}
@SuppressWarnings("unused")
public class OCLDemo {

	public static void main(String[] args) {
		Person urAhn = new UrAhnen();
		Person klausDieter = new Person();

	}

}
