
import java.util.Scanner;

public class Bookstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAXRATE = 1.075;
		
		float[] bookPrices = {0,0,0,0,0};
		float totalPrice = 0, totalShipping = 0;
		
		int shippingCharge = 2;
		


		Scanner sc = new Scanner(System.in);
		String anotherBook = "";
		float bookCost = 0;
		System.out.println("Enter the prices of 5 books.");
		for(int i = 1; i < 6;i++)
		{
			System.out.print("Enter the price of book " + i + " :");
			bookCost = sc.nextFloat();
			
			bookPrices[i-1] = bookCost;
		}
		
		for(int i = 0; i < bookPrices.length; i++)
		{
			totalPrice += bookPrices[i];
		}
		totalShipping = bookPrices.length * shippingCharge;
		
		System.out.println("Total price:" + totalPrice);
		System.out.println("Total price with tax :" + (totalPrice * TAXRATE));
		System.out.println("Total shipping charges:" + totalShipping);
		System.out.println("Total price with charges:" + ((totalPrice * TAXRATE) + totalShipping));
		
	}

}
