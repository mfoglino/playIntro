package patterns.visitor;

public class Rectangle implements ShapeArea {
	
	private double sideA;
	private double sideB;
	
	
	public Rectangle(double sideA, double sideB) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
	}


	@Override
	public double area() {
		return sideA*sideB;
	}

}
