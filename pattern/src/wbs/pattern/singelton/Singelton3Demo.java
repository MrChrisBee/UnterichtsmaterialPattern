package wbs.pattern.singelton;

public class Singelton3Demo {

	public static void main(String[] args) {
		Singelton3 singelTon1 = Singelton3.INSATANCE;
		Singelton3 singelTon2 = Singelton3.INSATANCE;
		System.out.println(singelTon1 == singelTon2);

	}

}
