package TTT;
import java.util.Scanner;

public class TicTacToeLegacy {
	//board[column][row]
	private static char[][] board = {
			{'?','?','?'},
			{'?','?','?'},
			{'?','?','?'},};
	private static char p1 = 'o';
	private static char p2 = 'x';
	private static Scanner sc;
	
//	public static void main(String[] args) {
//		sc = new Scanner(System.in);
//		System.out.println("Welcome to Tic Tac Toe");
//		playGame();
//	}
	
	
	//Alternates turns between the players
	public static void playGame() {
		boolean gameFinished = false;
		while(!gameFinished) {
			printBoard();
			System.out.println("Player 1's turn");
			turn(p1);
			if(checkWin(p1)) {
				gameFinished = true;
				System.out.println("Player 1 has won!");
			}
			else if(boardFull()) {
				gameFinished = true;
				System.out.println("Game to the cat!");
			}
			printBoard();
			if(!gameFinished) {
				System.out.println("Player 2's turn");
				turn(p2);
				if(checkWin(p2)) {
					gameFinished = true;
					System.out.println("Player 2 has won!");
				}
				else if(boardFull()) {
					gameFinished = true;
					System.out.println("Game to the cat!");
				}
			}
		}
	}
	
	//Prints board
	public static void printBoard() {
		System.out.println("  1   2   3");
		System.out.println("1 " + board[0][0] + " | " + board[1][0] + " | " + board[2][0]);
		System.out.println("____________");
		System.out.println("2 " + board[0][1] + " | " + board[1][1] + " | " + board[2][1]);
		System.out.println("____________");
		System.out.println("3 " + board[0][2] + " | " + board[1][2] + " | " + board[2][2]);
	}
	
	//Ensures that an integer is found in an array of integers
	public static boolean validateInputInt(int input, int[] options) {
		boolean valid = false;
		
		for(int i : options) {
			if( input == i) {
				valid = true;
			}
		}
		return valid;
	}
	
	//Checks to see if a spot on the board is empty
	public static boolean checkEmpty(int row, int col) {
		if(board[col][row] == '?') {
			return true;
		}
		return false;
	}
	
	//Checks to see if a certain player has filled win conditions
	public static boolean checkWin(char p) {
		
		for(int i = 0; i < 3;i++) {
			//check column
			if((board[i][0] == p) && (board[i][1] == p) && (board[i][2] == p)) {
				return true;
			}
			
			//check row
			if((board[0][i] == p) && (board[1][i] == p) && (board[2][i] == p)) {
				return true;
			}			
		}
		
		//check diagonals
		if((board[0][0] == p) && (board[1][1] == p) && (board[2][2] == p)) {
			return true;
		}
		else if((board[2][0] == p) && (board[1][1] == p) && (board[0][2] == p)) {
			return true;
		}
		return false;
	}
	
	
	//Check to see if the board is entirely filled
	public static boolean boardFull() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '?') {
					return false;
				}
			}
		}
		return true;
	}
	
	//A players turn in which they select a row/col to fill
	public static void turn(char p) {
		int[] options = {1,2,3};
		int row = 0;
		int col = 0;
		System.out.println("Select a row:");
		row = getInputInt(options) -1;
		System.out.println("Select a column:");
		col = getInputInt(options) -1;
		
		if(!checkEmpty(row,col)) {
			System.out.println("Invalid row,column, that space is occupied");
			turn(p);
			return;
		}
		
		board[col][row] = p;  
		
	}
	
	//gets an integer and ensures that it is valid
	public static int getInputInt(int[] options) {
		int num = 0;
		//Ensure entered data is an integer
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
		}
		num = sc.nextInt();
		//Ensure that the number is valid
		while(!validateInputInt(num,options)) {
			sc.nextLine();
			System.out.println("Invalid input, try again");
			num = sc.nextInt();
		}
		return num;
	}
	
	
}