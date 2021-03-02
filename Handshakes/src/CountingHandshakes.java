import java.util.Scanner;

public class CountingHandshakes {

	private static int totalHandshakes;
	private static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalHandshakes = 0;
		sc = new Scanner(System.in);
		System.out.println("Enter the number of people in the room to handshake: ");
		int hands = sc.nextInt();
		totalHandshakes = handshakes(hands-1);
		System.out.println("Total number of handshakes: " + totalHandshakes);
		
	}
	
	public static int handshakes(int hands) {
		int handshakes = hands;
		if(hands > 1) {
			handshakes += handshakes(hands-1);
		}
		return handshakes;
	}
	
	

}
