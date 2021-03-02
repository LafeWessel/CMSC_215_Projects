package hello;
import java.util.Scanner;

public class FriendlyHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.1415926535897932384626466;
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("Enter your name >> ");
		name = sc.nextLine();
		System.out.println("Hello " + name + "!");
		sc.close();
		
		for(int i = 0; i < args.length; i++)
		{
			System.out.println("args at " +i+ " = " + args[i]);
		}
		if(args.length == 0)
		{
			System.out.println("args is empty");
		}
		
	}
}
