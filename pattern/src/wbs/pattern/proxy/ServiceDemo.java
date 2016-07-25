package wbs.pattern.proxy;

public class ServiceDemo {
	public static void main(String[] args) {
		ServiceImpl si = new ServiceImpl();
		ServiceProxy sp = new ServiceProxy(si);
		sp.operation();
	}
}
