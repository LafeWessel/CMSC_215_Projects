
public class TriangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle t1 = new Triangle();
		System.out.println(t1.toString());
		
		Triangle t2 = new Triangle((double)2.0,(double)5.7,(double)3.8);
		System.out.println(t2.toString());
		System.out.println("Perim: " + t2.getPerimeter());
		System.out.println("Area: " + t2.getArea());
	}

}
