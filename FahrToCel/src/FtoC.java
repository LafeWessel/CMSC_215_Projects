import java.util.Scanner;

public class FtoC {

	public static void main(String args[])
	{
		
		float fahr = 0;
		float cel = 0;
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter a Fahrenheit value:");
		fahr = sc.nextFloat();
		
		cel = FtoC(fahr);
		
		System.out.println(fahr + "F is " + cel + " C");
	}
	
	public static float FtoC(float fahr)
	{
		return (fahr - 32) * 5/9;
	}
	
	public static float CtoF(float cel)
	{
		return cel * 9/5 + 32;
	}
}
