package patterns.visitor;

public class Circle implements ShapeArea{
	private double ratio;
	
	
	public Circle(double ratio) {
		super();
		this.ratio = ratio;
	}


	@Override
	public double area() {
		
		return Math.PI * ratio * ratio;
	}
	
}
