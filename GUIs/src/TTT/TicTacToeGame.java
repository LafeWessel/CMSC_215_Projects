package TTT;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToeGame extends JFrame implements ActionListener{
	
	public static final int HEIGHT = 350;
	public static final int WIDTH = 350;
	
	private static char[] locations = new char[9];
	
	private static JButton[] board = new JButton[9];
	private static JLabel playerTurn;
	private static char currentPlayer;
	
	private static boolean finished;
	
	
	public static void main(String[] args) {
		for (int i = 0; i < locations.length; i++) {
			locations[i] = (char) ((i+1)+'0');
		}
		//printLocations();
		
		currentPlayer = 'X';
		finished = false;
		TicTacToeGame game = new TicTacToeGame();
		game.setVisible(true);
	}
	
	TicTacToeGame(){
		//Basic window initialization
		super("Tic Tac Toe");
		setSize(WIDTH,HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Tic Tac Toe");

		//Add button array
		JPanel Jboard = new JPanel();
		Jboard.setLayout(new GridLayout(3,3));
		
		for (int i = 0; i < 9; i++) {
			board[i] = new JButton("" + locations[i]);
			board[i].addActionListener(this);
			Jboard.add(board[i]);
		}		
		
		//Add Reset button
		JPanel resetPanel = new JPanel();
		resetPanel.setLayout(new BorderLayout());		
		JButton reset = new JButton("Reset");
		reset.addActionListener(this);
		
		//Add top text box
		playerTurn = new JLabel("Player 1's Turn",SwingConstants.CENTER);
		
		resetPanel.add(playerTurn, BorderLayout.NORTH);
		resetPanel.add(reset, BorderLayout.SOUTH);
		resetPanel.add(Jboard, BorderLayout.CENTER);
		add(resetPanel);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("clicked: " + e.getActionCommand());
		if(e.getActionCommand().equalsIgnoreCase("reset")) {
			resetBoard();
		}
		else if(!finished){
			chooseLocation(e.getActionCommand());
		}
		
	}
	
	//Changes all the values in the board to 1-9
	public static void resetBoard() {
		System.out.println("Reset Called");
		for (int i = 0; i < board.length; i++) {
			board[i].setText("" + (i+1));
			locations[i] = (char)((i+1) + '0');
		}
		//printLocations();
		
		playerTurn.setText("Player 1's Turn");
		currentPlayer = 'X';
		finished = false;
	}
	
	//Updates the board based on what is in the locations array
	public static void updateBoard()
	{	
		System.out.println("Update called");
		for(int i = 0; i < locations.length; i++) {
			board[i].setText("" + locations[i]);
		}
		//printLocations();
	}
	
	//checks if the clicked location is available
	public static void chooseLocation(String loc) {
		char c = loc.charAt(0);
		
		//Invalid location
		//55 is integer value of '9'
		if(c > 59) {
			playerTurn.setText(playerTurn.getText() + "\n Invalid location!");
		}
		else {
			turn(c-49);
		}
		
	}
	
	//Set the correct locations value based on what was clicked
	public static void turn(int loc) {
		locations[loc] = currentPlayer;
		updateBoard();
		nextTurn();
	}
	
	//Changes the class values to reflect the next player
	public static void nextTurn()
	{	
		
		finished = checkGame();
			
		if(!finished) {
			if(currentPlayer == 'X') {
				System.out.println("Player 2 Turn");
				currentPlayer = 'O';
				playerTurn.setText("Player 2's Turn");
			}
			else {
				System.out.println("Player 1 Turn");
				currentPlayer = 'X';
				playerTurn.setText("Player 1's Turn");
			}
		}

		if(finished) {
			System.out.println("Game Over!");
		}
	}
	

	
	//Checks to see if any win condition has been fulfilled
	public static boolean checkGame(){
		
		boolean gameOver = false;
		
		//Row
		if(locations[0] == locations[1] && locations[1]==locations[2]) {
			System.out.println("Check 1");
			gameOver =  true;
		}
		else if(locations[3] == locations[4] && locations[4]==locations[5]) {
			System.out.println("Check 2");
			gameOver =  true;
		}
		else if(locations[6] == locations[7] && locations[7]==locations[8]) {
			System.out.println("Check 3");
			gameOver =  true;
		}
		
		//Column
		if(locations[0] == locations[3] && locations[3]==locations[6]) {
			System.out.println("Check 4");
			gameOver =  true;
		}
		else if(locations[1] == locations[4] && locations[4]==locations[7]) {
			System.out.println("Check 5");
			gameOver =  true;
		}
		else if(locations[2] == locations[5] && locations[5]==locations[8]) {
			System.out.println("Check 6");
			gameOver =  true;
		}		
		
		//Diagonal
		if(locations[0] == locations[4] && locations[4]==locations[8]) {
			System.out.println("Check 7");
			gameOver =  true;
		}
		else if(locations[2] == locations[4] && locations[4]==locations[6]) {
			System.out.println("Check 8");
			gameOver =  true;
		}
		
		//Set the appropriate statement if the game is over
		if(gameOver) {
			if(currentPlayer == 'X') {
				playerTurn.setText("Player 1 has won!");
			}
			else {
				playerTurn.setText("Player 2 has won!");
			}
		}
		
		
		if(!gameOver) {
			boolean emptySpot = false;
			//Makes sure there is an empty spot, otherwise game goes to cat
			for(int i = 0; i < 9; i++) {
				if(!(locations[i] == 'X' || locations[i] == 'O')) {
					emptySpot =  true;
				}
			}
			if(!emptySpot) {
				gameOver =  true;
				playerTurn.setText("Game to the cat!");
			}
		}

		return gameOver;
	}
	
	public static void printLocations() {
		for (int i = 0; i < locations.length; i++) {
			System.out.println(i + " : " + locations[i]);
		}
	}
}
