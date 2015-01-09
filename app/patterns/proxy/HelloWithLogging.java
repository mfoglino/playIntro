package patterns.proxy;

public class HelloWithLogging implements HelloInteface {
	
	private HelloInteface hello;
	
	public HelloWithLogging() {
		hello = new Hello();
	}
	
	
	@Override
	public void sayHello() {
		
		System.out.println("Calling sayHello");
		hello.sayHello();

	}
}
