import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Common Divisor Calculator

		Scanner sc = new Scanner(System.in);
		
		String cont = "y";
		
		int num1 = 0;
		int num2 = 0;
		
		while(cont.equalsIgnoreCase("y")) {
			
			//num1 = x
			//num2 = y
			
			System.out.println("Enter your first number to factor:");
			num1 = sc.nextInt();
			System.out.println("Enter your second number to factor:");
			num2 = sc.nextInt();
			System.out.println("Numbers gotten: " + num1 + ", " + num2);
			
			//Ensures num2 is larger than num1
			if(num1 > num2) {
				int med = num1;
				num1 = num2;
				num2 = med;
				System.out.println("Numbers swapped");
			}
			
			while(num1 != 0) {
				while(num2 >= num1) {
					num2 -= num1;
					System.out.println("Num1:" + num1);
					
				}
				if(num1 > num2) {
						int medium = num2;
						num2 = num1;
						num1 = medium;
						System.out.println("Num2:" + num2 + " Num1: " + num1);
				}
			}
			System.out.println(num2 + " is GCD");

			System.out.println("\nWould you like to continue(y/n)?");
			cont = sc.next();
		}
		
		
		
		
	}
}
