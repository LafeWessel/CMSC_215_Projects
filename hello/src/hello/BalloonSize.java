package hello;

public class BalloonSize {
	public static void main(String[] args)
	{
		//Compute water needed for a 10 cm diameter water balloon
		// W = (PI / 6) * diameter^3
		
		double diameter = 10.0;
		double water = (Math.PI / 6.0 ) * Math.pow(diameter,3.0);
		
		System.out.print(water);
	}
}
