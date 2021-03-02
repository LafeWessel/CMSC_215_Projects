package ReviewEx4;

import java.util.Scanner;
import java.io.File;


public class ReadData{
	public static void main(String[] args) throws Exception{
		//create file
		File file = new File("scores.txt");

		//create Scanner for the file
		Scanner input = new Scanner(file);
		
		//read data from a file
		while(input.hasNext()){
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			
			System.out.println(firstName + " " + mi + " " +
				lastName + " " + score);
		}
		
		//close file
		input.close();
		
	}//end main
}//end class