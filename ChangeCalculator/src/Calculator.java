import java.util.Scanner;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Change calculator");
		
		String contString= "y";
		Scanner sc = new Scanner(System.in);
		
		int cents = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels= 0;
		int pennies = 0;
		
		while(contString.equalsIgnoreCase("y"))
		{
			System.out.println("Enter number of cents (0-99)");
			cents = sc.nextInt();
			
			quarters = cents/25;
			cents -= quarters*25;
			
			dimes = cents/10;
			cents -= dimes*10;
			
			nickels = cents/5;
			cents -= nickels*5;
			
			pennies = cents;
			System.out.println("Quarters:" + quarters);
			System.out.println("Dimes: " + dimes);
			System.out.println("Nickels: " + nickels);
			System.out.println("Pennies: " + pennies);
			
			System.out.println("Would you like to calculate again?(y/n)");
			contString = sc.next();
		}
		
		sc.close();
	}

}
