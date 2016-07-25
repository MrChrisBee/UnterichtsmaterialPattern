package wbs.pattern.factory_method;

public class KonkreterErzeuger extends Erzeuger {

	@Override
	public Produkt fabrickmethode() {
		Produkt result = new KonkretesProdukt();
		return result;
	}
}
 