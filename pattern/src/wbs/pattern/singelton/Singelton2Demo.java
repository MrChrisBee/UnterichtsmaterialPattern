package wbs.pattern.singelton;

public class Singelton2Demo {

	public static void main(String[] args) {
		Singelton2 singelTon1 = Singelton2.getInstance();
		Singelton2 singelTon2 = Singelton2.getInstance();
		System.out.println(singelTon1 == singelTon2);

	}

}
