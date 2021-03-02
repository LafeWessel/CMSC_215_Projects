package PersonManager;

import java.util.Scanner;

public class Tester {
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean cont = true;
		
		while(cont) {
			System.out.println("Create customer or employee?(c/e)");
			char[] accCE = {'c','e'};
			char ce = readChar(accCE);
			
			if(ce == 'c') {
				createCustomer();
			}
			else {
				createEmployee();
			}
			
			System.out.println("Would you like to continue? (y/n)");
			char[] accYN = {'y','n'};
			char yn = readChar(accYN);
			if(yn == 'n') {
				System.out.println("Exiting");
				cont = false;
			}
			else {
				System.out.println("Continuing");
			}
		}
		
	}
	
	public static String readString() {
		String input = sc.next();
		return input;
	}
	public static String readString(int minLen) {
		String input = sc.next();
		while(input.length() < minLen) {
			System.out.println("Input too short, must be at least " + minLen + " characters, try again.");
			sc.nextLine();
			input = sc.next();
		}
		return input;		
	}
	
	
	//Makes sure that a character is entered and is one of a list of options
	public static char readChar(char[] options) {
		char input = '0';
		boolean validOption = false;
		
		while(!validOption) {
			validOption = false;
			if(sc.hasNext()) {
				input = sc.next().toLowerCase().charAt(0);
				//System.out.println("Input: " + input);
				//Checks to see if what was input is an acceptable value
				for(int i = 0; i < options.length;i++) {
					if(input == options[i]) {
						//System.out.println(input + " = " + options[i]);
						validOption = true;
						return input;
					}
					else {
						//System.out.println(input + " != " + options[i]);
					}
				}				
			}
			if(!validOption){
				System.out.println("Invalid input, try again.");
				sc.nextLine();
			}
		}
		return input;
	}
	
	public static void createCustomer() {
		System.out.println("Enter First Name: ");
		String first = readString();
		
		System.out.println("Enter Last Name: ");
		String last = readString();
		
		System.out.println("Enter Customer Number: ");
		String number = readString();
		
		Customer c = new Customer(first,last,number);
		System.out.println("New Customer Information:\n" + c.toString());
	}
	
	public static void createEmployee() {
		System.out.println("Enter First Name: ");
		String first = readString();
		
		System.out.println("Enter Last Name: ");
		String last = readString();
		
		System.out.println("Enter Employee SSN: ");
		String ssn = readString(9);
		
		Employee e = new Employee(first,last,ssn);
		System.out.println("New Employee Information:\n" + e.toString());		
	}
	
}
