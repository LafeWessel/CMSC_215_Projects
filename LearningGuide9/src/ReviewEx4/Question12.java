package ReviewEx4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question12 {
	public static void main(String[] args) throws Exception {
		File gradeNames  = new File("names.txt");
		Scanner in = new Scanner(gradeNames);
		while(in.hasNextLine()){
		    //executable code goes here
			String line = in.nextLine();
			int i = line.length()-1;
			String grade = line.substring(i+1);	
			while(Character.isDigit(line.charAt(i))){
				i--;
				grade = line.substring(i+1);	
				
			}
			
			String name = line.substring(0,i).trim();
			process(name,grade);	
		}
	}

	public static void process(String n, String g) {
		System.out.println("Name:" + n);
		System.out.println("Grade: " + g);
	}
}