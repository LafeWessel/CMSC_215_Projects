package hello;
import java.util.Scanner;

public class Tiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		
		//Working in inches
		int width = 0;
		final int TILEWIDTH=5;
				
		System.out.println("Enter width of room in inches:");
		width = sc.nextInt();

		int numTiles = 0;
		numTiles = ((width - TILEWIDTH) / (2*TILEWIDTH)) * 2 +1;
		
		double gap = (width - (numTiles * TILEWIDTH)) / 2.0;
		
		System.out.println("Number of Tiles: " + numTiles);
		System.out.println("Size of gap: " + gap);
		
	}
}
