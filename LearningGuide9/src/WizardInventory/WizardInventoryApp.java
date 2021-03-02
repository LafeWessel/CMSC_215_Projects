package WizardInventory;
import java.util.ArrayList;
import java.util.Scanner;

public class WizardInventoryApp {

	private static ArrayList<String> inventory;
	private static final int MAX_ITEMS = 5;
	private static ArrayList<String> commands; //Keeps track of a list of all the commands that were used
	private static boolean cont;
	private static Scanner sc;
	
	public static void main(String[] args) {
		commands = new ArrayList<String>();
		inventory = new ArrayList<String>();
		makeInventory();
		
		sc = new Scanner(System.in);
		cont = true;
		
		System.out.println("Welcome to Wizard Inventory App\nCommands:\n"
				+ "show - display inventory\ndrop - drop a certain item\n"
				+ "edit - edit the name of an item\ngrab - grab an item"
				+ "exit - exit the app");
		while(cont) {
			System.out.print("Enter a command:");
			getCommand();
		}

	}
	
	//Gets a command and calls the corresponding function
	public static void getCommand() {
		String[] options = {"drop","grab","show","edit","exit"};
		String command = sc.next();
		while(!validateInputString(command,options)) {
			sc.nextLine();
			System.out.println("Invalid command, please try again.");
			command = sc.next();
		}
		sc.nextLine();
		
		if(command.equalsIgnoreCase("drop")) {
			drop();
			commands.add("drop");
		} else if(command.equalsIgnoreCase("grab")) {
			if(inventory.size() < MAX_ITEMS) {
				grab();
				commands.add("grab");	
			} else {
				System.out.println("You cannot carry any more items!");
			}
		} else if(command.equalsIgnoreCase("show")) {
			show();
			commands.add("show");
		} else if(command.equalsIgnoreCase("edit")) {
			edit();
			commands.add("edit");
		} else if(command.equalsIgnoreCase("exit")) {
			commands.add("exit");
			exit();
		} else {
			System.out.println("Something went wrong. getCommand()");
		}
	}
	
	//removes an item from the inventory
	public static void drop() {
		System.out.println("Enter the number of the item that you would like to drop");
		int toDrop = getInt();
		while(!validateInputInt(1,inventory.size(),toDrop)) {
			sc.nextLine();
			System.out.println("Invalid index, try again");
			toDrop = getInt();
		}
		System.out.println("Dropping " + inventory.get(toDrop-1));
		inventory.remove(toDrop-1);
		sc.nextLine();
	}
	
	//adds an entered string to the inventory
	public static void grab() {
		System.out.println("Enter the name of the item that you would like to grab");
		String entered = sc.nextLine();
		System.out.println(entered + " was added");
		inventory.add(entered);
	}
	
	//Prints what is in the inventory
	public static void show() {
		System.out.println("Inventory:");
		int i = 1;
		for(String item : inventory) {
			System.out.println(i + ": " + item);
			i++;
		}
	}
	
	//changes the name of an item in the inventory
	public static void edit() {
		System.out.println("Please enter the number of the item that you would like to edit");
		int toEdit = getInt();
		while(!validateInputInt(1,inventory.size(),toEdit)) {
			sc.nextLine();
			System.out.println("Invalid index, try again");
			toEdit = getInt();
		}
		sc.nextLine();
		System.out.println("Editing " + inventory.get(toEdit-1) + ", please enter new name: ");
		String newName = sc.nextLine();
		inventory.remove(toEdit-1);
		inventory.add(toEdit-1, newName);
	}
	
	//sets the continue boolean to false and prints all the commands used
	public static void exit() {
		System.out.println("Exiting");
		cont = false;
		System.out.println("Commands used:");
		for(String c : commands) {
			System.out.println(c);
		}
		System.out.println("Ending Inventory:");
		show();
	}
	

	//Grab three random items to put in the starting inventory
	public static void makeInventory() {
		inventory.add("Wizard Hat");
		inventory.add("Wooden Staff");
		inventory.add("Cloth Robe");
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
	
	//gets an entered integer from the console
	public static int getInt() {
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Input not an integer, try again");
		}
		int input = sc.nextInt();
		return input;
	}
	
	//ensures that an integer is between two bounds, inclusive
	public static boolean validateInputInt(int lBound, int uBound, int input) {
		if(input < lBound) {
			return false;
		}
		else if(input > uBound) {
			return false;
		}
		return true;
	}

}
