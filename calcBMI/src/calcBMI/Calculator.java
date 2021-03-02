package calcBMI;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float height = 0;
		float weight = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height in meters: ");
		height = sc.nextFloat();
		
		System.out.println("Enter weight in kilograms: ");
		weight = sc.nextFloat();
		
		float calculation = calculate(height, weight);
		
		System.out.println("Your BMI is: " + calculation);
		
	}
	
	public static float calculate(float height, float weight)
	{
		return weight / (height*height);
	}

}
