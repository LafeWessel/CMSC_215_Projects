import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Travel Time Calculator");
		String contString= "y";
		Scanner sc = new Scanner(System.in);
		
		float miles = 0;
		float mph = 0;
		float hours = 0;
		float minutes = 0;
		
		while(contString.equalsIgnoreCase("y"))
		{
			System.out.print("Enter miles to drive:       ");
			miles = sc.nextFloat();
			
			System.out.print("Enter miles per hour:       ");
			mph = sc.nextFloat();
			
			hours = miles/mph;
			
			System.out.println("Hours:    " + (int)hours);
			minutes = (miles%mph)/mph*60;
			System.out.println("Minutes:  " + (int)minutes);
			System.out.println("Would you like to calculate again?(y/n)");
			contString = sc.next();
		}
		
		sc.close();
	}
}
