package test;

public class Counter {
	
	/*
	 * Records a non-negative whole number
	 * 
	 */
	
	private int count;
	
	//Constructors
	Counter(){
		count = 0;
	}
	Counter(int ct){
		count = ct;
	}
	
	//Increment count
	public void increment() {
		count++;
	}
	
	//Decrement count, ensuring that it will not become negative
	public void decrement() {
		if(count > 0) {
			count--;
		}
		else {
			count = 0;
			System.out.println("Counter can no longer be decremented");
		}
	}
	
	//Sets the count to zero
	public void setZero() {
		count = 0;
	}
	
	//Returns a string that is the count
	public String displayCount() {
		return Integer.toString(count);
	}
	
	//Returns the current count
	public int getCount() {
		return count;
	}
}
