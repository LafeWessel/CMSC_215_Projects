package hello;
import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		
		//Works in feet measurements
		
		float wallWid = 0;
		float wallHei = 0;
		float totalArea = 0;
		int numWindows = 0;
		int windowArea = 6; //= 2ft x 3ft
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the width of the wall (ft):");
		wallWid = sc.nextFloat();
		System.out.println("Enter the height of the wall(ft):");
		wallHei = sc.nextFloat();
		System.out.println("Enter the number of windows:");
		numWindows = sc.nextInt();
		
		totalArea = (wallWid * wallHei) - (numWindows * windowArea);
		
		System.out.println("Total area - window area:" + totalArea + "ft.^2");
	}

}
