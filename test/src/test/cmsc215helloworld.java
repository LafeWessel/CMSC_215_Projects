package test;
import java.util.ArrayList;

public class cmsc215helloworld 
{
	public static void main(String[] args)
	{
		String str = "try me";
		System.out.println("Hello World\n" + str);
		for(int i = 0; i  < 10; i++)
		{
			System.out.println(i);
		}
		
		String newStr = "";
		for(int i = str.length(); i > 0; i--) {
			newStr += str.charAt(i-1);
		}
		System.out.println(newStr);
	
	
		int runs = 0;
		
		for(int customer = 1; customer <= 20; ++customer){
	
		    for(int color = 1; color <= 3; ++color){
	
		        runs++;
	
		    }
		    System.out.println(runs);
		}
		
		double[][] fees = { {3.00, 3.50, 4.00, 5.00}, {6.35, 7.35, 8.35, 9.00} };
		System.out.println(fees.length);
		
		ArrayList<Integer> nums = new ArrayList<Integer>(25);
		
		int a  =5;
		byte b = 7;
		float f = 6.0f;
		System.out.println(a + b + f);
		
		int j = 3 + 7 * 4 + 2;
		System.out.println(j);
		
		int[] numbers = new int[10];

		for(int i = 0; i < numbers.length; ++i){

		    numbers[i] = i * 2;

		}

		for(int i = 0; i < numbers.length; ++i){

		    System.out.print(numbers[i] / 2 + " ");

		}

		System.out.println();
		
		int p = power(5,3);
		System.out.println(p);
		
	}
	
	public static int power(int x, int n){

	    if( n < 0){

	        System.out.println("Illegal argument to power.");

	        System.exit(1);

	    }
	    
	    else if( n < 1) {
	    	return 1;
	    }
	    
	    else {
	    	return x * power(x, n-1); 
	    }
	 return 0;
	    
	}
	
	public int mean(ArrayList<Integer> nums) {
		int mean = 0;
		for(Integer i : nums) {
			mean += i.intValue();
		}
		return mean;
	}
	
	public int sumArray(int[] a){

	     int sum = 0;
	     for( int i : a) {
	    	 sum += i;
	     }
	     return sum;

	}
	
}
