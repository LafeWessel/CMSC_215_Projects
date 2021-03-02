package hello;
import java.util.Scanner;
import java.text.NumberFormat;

public class Class1202020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double thing1,thing2,thing3,thing4,thing5;
		double x = 2.5;
		double y = -1.5;
		int m = 18;
		int n = 4;
		thing1 = x+n*y-(x+n)*y;
		thing2 = m / n + m % n;
		thing3 = x * 5;
		thing3 -= n / 5;
		thing4 = (1 - (1 - (1 - (1 - (1-n)))));
		thing5 = Math.sqrt(Math.sqrt(n));
		
		System.out.println(thing1);
		System.out.println(thing2);
		System.out.println(thing3);
		System.out.println(thing4);
		System.out.println(thing5);
		
		
		
		double number = (Math.round(17.5678364847*100.0)) / 100;
		System.out.println(number);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter floor number: ");
		int floor = sc.nextInt();
		
		
		floor = Math.abs(floor);
		
		if((floor != 0) && (floor != 13) && (floor <= 20)){
			System.out.println("The floor is acceptable: " + floor);
		}
		else{
			System.out.println("Floor unacceptable: " + floor);
		}
		
	}

}
