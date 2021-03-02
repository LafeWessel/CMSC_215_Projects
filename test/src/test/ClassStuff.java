package test;

public class ClassStuff {

	public
		static int wins;
		static int losses;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		wins = 0;
		losses = 0;
		
		for(int i = 0; i < 10000; i++) {
			int sum = rollDice();
			//System.out.println("Initial sum: " + sum);
			
			//Come out roll
			if((sum == 7) || (sum == 11)) {
				++wins;
			}
			else if((sum == 2) || (sum == 3) || (sum ==12)) {
				++losses;
			}
			else{
				int point = sum;
				sum = rollDice();
				//Keeps rolling the dice until the point or a 7 is rolled
				while(!gameFinished(point,sum)) {
					sum = rollDice();
				}
				if(sum == 7)
				{
					++losses;	
				}
				else {
					++wins;
				}
			}
		}
		
		double percentWin = (double)wins/((double)wins+(double)losses);
		System.out.println("The total number of wins is: " + wins);
		System.out.println("The total number of losses is: " + losses);
		System.out.println("Percent wins: " + percentWin);
	}
	
	//Rolls the dice and returns the sum
	public static int rollDice() {
		return rollDie() + rollDie();
	}
	
	//generates a random num from 1-6
	public static int rollDie() {
		
		return (int)(Math.random() * 6) + 1;
	}
	
	//Checks to see if the the rolled dice equal the point or 7
	public static boolean gameFinished(int point, int sum) {
		
		if(sum == point) {
			//System.out.println("sum = point");
			return true;
		}
		else if(sum == 7){
			//System.out.println("sum = 7");
			return true;	
		}
		else {
			//System.out.println("returned false");
			return false;
		}
	}

}
