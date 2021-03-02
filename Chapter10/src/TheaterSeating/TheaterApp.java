package TheaterSeating;
import java.util.Scanner;

public class TheaterApp {
	//Size according to the assignment
	//Hardcoding because that's easiest :P
	private static int[][] seats = {
			{10,10,10,10,10,10,20,20,30},
			{10,10,10,10,10,10,20,30,40},
			{10,10,10,20,20,20,30,30,50},
			{10,10,10,20,20,20,30,40,50},
			{10,10,10,20,20,20,40,50,50},
			{10,10,10,20,20,20,40,50,50},
			{10,10,10,20,20,20,30,40,50},
			{10,10,10,20,20,20,30,30,50},
			{10,10,10,10,10,10,20,30,40},
			{10,10,10,10,10,10,20,20,30},
			};	
	private static boolean[][] seatsAvail = {
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			{true,true,true,true,true,true,true,true,true},
			};	
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Here are the seats and their prices");
		
		
		boolean cont = true;
		
		while(cont) {
			printSeats();
			String choice = "";
			String[] options = {"s","p"};
			System.out.println("Would you like to pick a seat or a price?(s/p)");
			choice = sc.next();
			while(!validateInputString(choice,options)) {
				sc.nextLine();
				System.out.println("Invalid input, please try again");
				choice = sc.next();
			}
			if(choice.equalsIgnoreCase("s")) {
				chooseSeat();
			}
			else {
				choosePrice();
			}			
			
			String[] contOptions = {"y" ,"n"};
			String contChoice = "";
			System.out.println("Would you like to reserve another seat?(y/n)");
			contChoice = sc.next();
			while(!validateInputString(contChoice,contOptions)) {
				sc.nextLine();
				System.out.println("Invalid input, please try again");
				choice = sc.next();				
			}
			if(contChoice.equalsIgnoreCase("n")) {
				cont = false;
			}
		}
		
		

		
	}

	public static void chooseSeat() {
		int row = 0;
		int[] rowOptions = {1,2,3,4,5,6,7,8,9};
		int col = 0;
		int[] colOptions = {1,2,3,4,5,6,7,8,9,10};
		
		//Get Column
		System.out.println("Please select a seat by row and column number\nEnter Col:");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
		}
		col = sc.nextInt();
		while(!validateInputInt(col,colOptions)) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
			col = sc.nextInt();
		}
		System.out.println("Column selected: " + col);
		
		//Get row
		System.out.println("Enter Row: ");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
		}
		row = sc.nextInt();
		while(!validateInputInt(row,rowOptions)) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
			row = sc.nextInt();
		}
		System.out.println("Row selected: " + row);
		System.out.println("Row, Column: " + row + ", " + col);
		
		if(seatsAvail[row-1][col-1]) {
			seatsAvail[row-1][col-1] = false;
			System.out.println("Seat reserved");
		}
	}
	
	public static void choosePrice() {
		int choice = 0;
		int[] options = {10,20,30,40,50};
		
		System.out.println("What price would you like? 10,20,30,40, or 50?");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
		}
		choice = sc.nextInt();
		while(!validateInputInt(choice,options)) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
			choice = sc.nextInt();
		}
		
		printPriceSeats(choice);
		chooseSeat();
	}
	
	//Prints the array of seats
	public static void printSeats() {
		System.out.println("r/c  1  2  3  4  5  6  7  8  9 10\n");
		for(int i = 0; i < 9; i++) {
			System.out.print((i+1) + "   ");
			for(int j = 0; j<10; j++) {
				if(seatsAvail[j][i]) {
					System.out.print(seats[j][i] + " ");
				}
				else {
					System.out.print("xx ");
				}
				
			}
			System.out.println();
		}
		System.out.println("\t   Stage");
	}
	
	//Prints the array of seats, but only gives those that have the specified value
	public static void printPriceSeats(int price) {
		System.out.println("    1  2  3  4  5  6  7  8  9  10");
		for(int i = 0; i< 9; i++) {
			System.out.print((i+1) + "   ");
			for(int j = 0; j<10; j++) {
				if(seats[j][i] == price && seatsAvail[j][i]) {
					System.out.print(seats[j][i] + "("+(i+1)+","+(j+1)+") ");
				}
				else {
					System.out.print("xx ");
				}
			}
			System.out.println();
		}
		System.out.println("\t   Stage");
	}
	
	
	//check a string against an array of options
	public static boolean validateInputString(String input, String[] validOptions) {
		boolean valid = false;
		
		for(int i = 0; i < validOptions.length; i++) {
			if( input.equalsIgnoreCase(validOptions[i])) {
				valid = true;
			}
		}
		return valid;
	}
	//Checks an integer against an array of options
	public static boolean validateInputInt(int input, int[] validOptions) {
		boolean valid = false;
		
		for(int i = 0; i < validOptions.length; i++) {
			if( input == validOptions[i]) {
				valid = true;
			}
		}
		return valid;
	}
}
	
