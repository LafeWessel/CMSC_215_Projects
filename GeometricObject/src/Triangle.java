
public class Triangle extends GeometricObject{
	
	private double side1,side2,side3;
	
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double area = 0.0;
		double s = (side1 + side2 + side3)/2;
		area = s*(s-side1)*(s-side2)*(s-side3);
		area = Math.sqrt(area);
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		String desc = "Side 1: " + side1 + 
				"\nSide 2: " + side2 +
				"\nSide 3: " + side3 + "\n" +
				super.toString();
		return desc;
	}
}
