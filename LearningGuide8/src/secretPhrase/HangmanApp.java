package secretPhrase;

public class HangmanApp {
	private static String phrase;
	private static String display;
	private static int guesses;
	
	public static void main(String[] args) {
		char c = 'A';
		char c2 = 'a';
		for(int i = 0; i < 27; i++) {
			System.out.println(i + " : " + c + " : " + c2 + " : " + (c-c2));
			c++;
			c2++;
		}
		
		System.out.println((char)(c+32));
		c += 32;
		System.out.println(c);
		System.out.println((int)'0');
	}
	
	
	
	
	
	
}
