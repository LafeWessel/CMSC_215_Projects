package test;

import java.util.Scanner;

public class MadLib {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence to turn into pig Latin");
		String sentence = sc.nextLine();	
		String newSentence = "";
		String newWord = "";
		int startSubStr = 0;
		int i = 0;
		while(i < sentence.length()) {
			if((sentence.charAt(i) == ' ')) {
				
				newWord = sentence.substring(startSubStr, i);
				newWord = newWord + newWord.charAt(0);
				newWord = newWord.substring(1);
				newWord += "ay";
				newSentence += newWord + " ";
				startSubStr = i+1;
				System.out.println("New Word: " + newWord);
			}
			else if(i == sentence.length()-1) {
				newWord = sentence.substring(startSubStr, i+1);
				newWord = newWord + newWord.charAt(0);
				newWord = newWord.substring(1);
				newWord += "ay";
				newSentence += newWord + " ";
				startSubStr = i+1;
				System.out.println("New Word: " + newWord);
			}
			i++;
		}
		System.out.println("Old sentence : " + sentence);
		System.out.println("New Sentece: " + newSentence);
	}
}
