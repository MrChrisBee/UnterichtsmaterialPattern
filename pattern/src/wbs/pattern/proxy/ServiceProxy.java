package wbs.pattern.proxy;

public class ServiceProxy implements IService {
	// ServiceProxy is a und has a IService
	
	// Umsetzung des Proxy-Patterns: Objekt-Komposition + Delegation

	private IService iService; // has a    ist eine Objekt-Komposition

	public ServiceProxy(IService is) {
		super();
		this.iService = is;
	}

	@Override
	public void operation() {
		System.out.println("Proxy: vorher"); //around Advice
		iService.operation(); // delegation
		System.out.println("Proxy: nachher");
	}

}
