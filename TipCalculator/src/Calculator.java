import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
//		The application should calculate and display the cost of tipping at 15%, 20% and 25%
//		Use the BigDecimal class to make sure that all calculations are accurate
//		Assume that the user will enter a valid cost for the meal
//		Format the tip percent, the tip amount, and the total
//		The application should continue only if the user enters "y" or "Y" to continue.		
		
		BigDecimal meal = new BigDecimal("0.0");
		Scanner sc = new Scanner(System.in);
		String cont = "y";
		
		while(cont.equalsIgnoreCase("y")) {
			
			System.out.println("Enter your meal cost before tipping:  ");
			meal = sc.nextBigDecimal();
			calculate(meal);
			
			System.out.println("Would you like to continue? (y/n):");
			cont = sc.next();
		}
		sc.close();
	}
	
	
	static void calculate(BigDecimal meal)
	{

		NumberFormat cur = NumberFormat.getCurrencyInstance();
		
		BigDecimal tip;
		BigDecimal fifteenTip = new BigDecimal("0.15");
		BigDecimal twentyTip = new BigDecimal("0.20");
		BigDecimal twentyfiveTip = new BigDecimal("0.25");
		System.out.println("Cost of meal: " + cur.format(meal) + "\n");
		tip = meal;
		tip = tip.multiply(fifteenTip);
		System.out.println("15% tip: " + cur.format(tip));
		System.out.println("Meal total: " + cur.format(meal.add(tip)) + "\n");
		tip = meal;
		tip = tip.multiply(twentyTip);
		System.out.println("20% tip: " + cur.format(tip));
		System.out.println("Meal total: " + cur.format(meal.add(tip)) + "\n");
		tip = meal;
		tip = tip.multiply(twentyfiveTip);
		System.out.println("25% tip: " + cur.format(tip));
		System.out.println("Meal total: " + cur.format(meal.add(tip)) + "\n");
	}
}
