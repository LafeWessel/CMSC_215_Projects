package ReviewEx4;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class WriteData{
	public static void main(String[] args) throws IOException {
		//create file object - point to a file
		File file = new File("scores.txt");
		
		if(file.exists()){
			System.out.println("File already exists");
			System.exit(1);
		}
		
		//create a file
		PrintWriter output = new PrintWriter(file);
		
		//write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones");
		output.println(85);
		
		//close the file
		output.close();
	}//end main
}//end class