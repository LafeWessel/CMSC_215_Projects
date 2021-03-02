import java.util.Scanner;

public class Descriptor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		
		char[] input = {'0','0','0'};
		String shand = "";
		String output = "";
		
		System.out.println("Enter your shorthand (e.g. QS for Queen of Spades) :");
		shand = sc.next();
		
		//Assumes there are only 2 characters in the string
		input[0] = shand.charAt(0);
		//Case for 10
		if((input[0] == '1') && (shand.charAt(1) == '0')) {
			input[1] = shand.charAt(2);
		}
		//Checking for a number that starts with 1 but isn't 10
		else if((input[0] == '1') && !(shand.charAt(1) == '0')) {
			input[0] = '0';
			input[1] = shand.charAt(2);
		}
		else {
			input[1] = shand.charAt(1);
		}
//		System.out.println(input[0]);
//		System.out.println(input[1]);
		
		//For number of card
		switch(input[0]) {
		case ('2'):
			output = "Two of ";
			break;
		case ('3'):
			output = "Three of ";
			break;
		case ('4'):
			output = "Four of ";
			break;
		case ('5'):
			output = "Five of ";
			break;
		case ('6'):
			output = "Six of ";
			break;
		case ('7'):
			output = "Seven of ";
			break;
		case ('8'):
			output = "Eight of ";
			break;
		case ('9'):
			output = "Nine of ";
			break;
		case ('1'):
			output = "Ten of ";
			break;
		case ('J'):
			output = "Jack of ";
			break;
		case ('Q'):
			output = "Queen of ";
			break;
		case ('K'):
			output = "King of ";
			break;
		case ('A'):
			output = "Ace of ";
			break;
		default:
			System.out.println("Invalid number entered");
		}
		
		
		//For Suit of card
		switch(input[1])
		{
		case ('S'):
			output += "Spades";
			break;
		case ('H'):
			output += "Hearts";
			break;
		case ('C'):
			output += "Clubs";
			break;
		case ('D'):
			output += "Diamonds";
			break;
		default:
			System.out.println("Invalid suit entered");
		}
		
		System.out.println(output);
		sc.close();
	}

}
