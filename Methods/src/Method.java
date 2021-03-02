
import java.util.Scanner;


//ASSUMPTIONS:
//All input is of the correct type, for the assignment never asked us to presume otherwise
public class Method {
	
	//Makes the scanner available to all functions
	public
		static Scanner sc;
	
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Running Sum Digits in Integer method");
		runSumDigits();
		
		System.out.println("Running Palindrome Integer methods");
		runPalindrome();
		
		System.out.println("Running Sort 3 Numbers method");
		runSortThree();
	}
	
	public static void runSumDigits() {
		System.out.println("Enter a long for Sum Digits: ");
		long num = sc.nextLong();
		int sum = sumDigits(num);
		
		System.out.println("Sum of entered digits: " + sum);
	}
	public static int sumDigits(long n) {
		int sum = 0;
		
		while(n > 0) {		
			sum += n % 10;
			n /= 10;	
		}
		return sum;
	}
	
	
	
	public static void runPalindrome() {
		System.out.println("Enter an integer to check if it is a palindrome: ");
		int num = sc.nextInt();
		
		if(isPalindrome(num)) {
			System.out.println("Your number is a palindrome!");
		}
		else {
			System.out.println("Your number is not a palindrome :(");
		}

	}
	public static boolean isPalindrome(int n) {
		
		if(n == reverse(n)) {
			return true;
		}
		else {
			return false;
		}		
	}
	//Gets the remainder of dividing the param by 10, then adds that to the new number
	//before multiplying the new number by 10 to shift that digit forward
	public static int reverse(int n) {
		int newNum = 0;
		
		while(n > 0) {	
			newNum += n % 10;
			n /= 10;
			
			if(n>0) {
				newNum *= 10;
			}
		}
		return newNum;
	}
	
	
	
	public static void runSortThree() {
		System.out.println("Enter your first double:");
		double num1 = sc.nextDouble();
		System.out.println("Enter your second double:");
		double num2 = sc.nextDouble();
		System.out.println("Enter your third double:");
		double num3 = sc.nextDouble();
		displaySortedNumbers(num1,num2,num3);
	}
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		//if num1 > num2
		if(compare(num1,num2)) {
			//if num1 > num3
			if(compare(num1,num3)) {
				//if num1 > num2 > num3
				if(compare(num2,num3)) {
					printSorted(num1,num2,num3);
				}
				//if num1 > num3 > num2
				else {
					printSorted(num1,num3,num2);
				}
				
			}
			//if num3> num1 > num2
			else {
				printSorted(num3,num1,num2);
			}
		}
		//if num2 > num1
		else {
			//if num2 > num3
			if(compare(num2,num3)) {
				//if num2 > num1 > num3
				if(compare(num1,num3)) {
					printSorted(num2,num1,num3);
				}
				//if num2 > num3 > num1
				else {
					printSorted(num2,num3,num1);
				}
			}
			//if num3 > num2 > num1
			else {
				printSorted(num3,num2,num1);
			}
		}		
	}
	
	
	public static void printSorted(double num1, double num2, double num3) {
		System.out.println("Greatest: " + num1 + " Middle: " + num2 + " Least: " + num3);
	}
	
	//returns true if num1 greater, and false if num2 is greater or equal
	public static boolean compare(double num1, double num2) {
		if((num1 - num2) > 0) {
			return true;
		}
		else {
			return false;
		}
	}
}
