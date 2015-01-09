package patterns.proxy;


public class Main {
	
	public static void main(String[] args) {
		
		
		
		Hello h = new Hello();
		h.sayHello();
		
		HelloInteface hellowithLogging = new HelloWithLogging();
		hellowithLogging.sayHello();
		
		
		
	}
}
