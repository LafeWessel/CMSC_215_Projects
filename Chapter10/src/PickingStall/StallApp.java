package PickingStall;
import java.util.Scanner;

public class StallApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many stalls are in this bathroom?");
		int len = sc.nextInt();
		
		boolean[] stalls = new boolean[len];
		
		//Assign false to all the items in the array
		for(int i = 0; i < stalls.length; i++) {
			stalls[i] = false;
		}
		
		fillStalls(stalls);
	}
	
	//Runs the loop that goes through the stalls
	public static void fillStalls(boolean[] stalls) {
		
		boolean firstLoop = true;
		while(!stallsFull(stalls)) {
			printOccupancy(stalls);
			findNextStall(stalls, firstLoop);
			firstLoop = false;
		}
		printOccupancy(stalls);
	}
	
	//This function finds the longest empty group of stalls and selects the middle stall from that group
	public static void findNextStall(boolean[] stalls, boolean firstLoop) {
		int end = 0;
		int maxEnd = 0;
		int currentLength = 0;
		int maxLength = 0;
		
		if(!firstLoop)
		{
			System.out.println("Not first loop");
			//Find largest open grouping
			for(int i = 0; i < stalls.length; i++) {
				if(!stalls[i]) {
					currentLength++;
					end = i;
					//System.out.println("i: " + i + " : " + stalls[i] + ", CL: " + currentLength + " End: " + end);
				}
				else if(stalls[i]){
					if(currentLength > maxLength) {
						maxLength = currentLength;
						maxEnd = end;
					}
					currentLength = 0;
					end = 0;
					//System.out.println("i: " + i + " : " + stalls[i] + ", CL: " + currentLength + " End: " + end);
				}
			}			
		}
		else if(firstLoop){
			System.out.println("First loop");
			maxLength = stalls.length;
			maxEnd = stalls.length - 1;
			firstLoop = false;
		}
		
		//Make sure another check is performed after the whole array has been looked at, 
		//otherwise the resutls from the second half will be ignored
		if(currentLength >= maxLength) {
			maxLength = currentLength;
			maxEnd = end;
			if(maxEnd == stalls.length-1 && maxLength <= 2) {
				maxLength = 0;
			}
		}
		
		//Ensure that the first stall is chosen if possible
		if(maxEnd-maxLength == 0 && !stalls[0]) {
			maxEnd = 0;
			maxLength = 0;
		}
		
		System.out.println("Max Open Length: " + maxLength + " ending at: " + maxEnd);
		
		//assign middle
		int selection = maxEnd - maxLength/2;
		System.out.println("Selection: " + selection);
		stalls[selection] = true;
		
	}
	
	//Returns true if all of the stalls are full
	public static boolean stallsFull(boolean[] stalls) {
		for(boolean b : stalls) {
			if(!b) {
				return false;
			}
		}
		return true;
	}
	
	//Prints which stalls are filled
	public static void printOccupancy(boolean[] stalls) {
		for(boolean b : stalls) {
			if(b) {
				System.out.print("X");
			}
			else {
				System.out.print("_");
			}
		}
		System.out.println();
	}
	
	
}
