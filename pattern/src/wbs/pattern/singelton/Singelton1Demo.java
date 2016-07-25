package wbs.pattern.singelton;

public class Singelton1Demo {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Singelton1 singelTon1 = Singelton1.getInstance();
		Singelton1 singelTon2 = Singelton1.getInstance();
		System.out.println(singelTon1.kontrolle + "  " + singelTon2.kontrolle);

	}

}
