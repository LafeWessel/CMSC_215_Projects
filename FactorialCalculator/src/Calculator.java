import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Factorial Calculator
		
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		int num = 0;
		
		while(cont.equalsIgnoreCase("y")) {
			
			System.out.println("Enter a number to factorialize:");
			num = sc.nextInt();
			long result = 1;
			for(int i = num; i > 1; i--) {
				result *= i;
			}
			
			System.out.println(num + " factorial = " + result);
			System.out.println("\nWould you like to continue(y/n)?");
			cont = sc.next();
		}
		
		
		
	}

}
