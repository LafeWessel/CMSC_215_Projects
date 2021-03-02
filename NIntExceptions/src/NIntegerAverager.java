import java.util.Scanner;

public class NIntegerAverager {

	public //Make the scanner available to all methods
		static Scanner sc;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		double average = getAverage(getNumberToAverage());
		System.out.println("Average of numbers: " + average);
	}
	
	//Get how many numbers to average
	public static int getNumberToAverage() {
		System.out.println("Enter how many integers you would like to average: ");
		int numberToAverage = 0;
		while(numberToAverage < 1) {
			numberToAverage = getInt(false);
		}
		System.out.println("Num to average:" + numberToAverage);
		return numberToAverage;
	}
	
	//Create a from n inputs and divide it by n before returning
	public static double getAverage(int numberToAverage) {
		int i = 0;
		int sum = 0;
		int nextNum = 0;
		while(i < numberToAverage) {
			while(nextNum < 1) {
				nextNum = getInt(true);
			}
			sum += nextNum;
			nextNum = 0; // reset nextNum so the second while is always triggered
			i++;
		}
		//return the average
		return (double)sum/(double)numberToAverage;
	}
	
	//Get an int from the input stream
	public static int getInt(boolean allowNegative) {
		try {
			int num = sc.nextInt();
			if(num < 1 && !allowNegative) {
				throw new Exception("Must be greater than zero");
			}
			System.out.println("Entered: " + num);
			return num;
		}
		catch(java.util.InputMismatchException e ) {
			System.out.println("Invalid input type, try again!");
			sc.next(); //clear input stream
			return 0;
		}
		catch(Exception e) {
			System.out.println("Invalid input, must be greater than zero, try again!");
			sc.next(); //clear input stream
			return 0;
		}
	}
}
