package test;

public class Martian extends Alien{
	
	private int numTentacles;
	
	Martian(){
//		this.setEyes(2);
//		this.setAppendages(4);
//		this.setName("Matt Damon");
		numTentacles = 0;
	}
	Martian(int eyes, int appendages, String name, int tentacles){
		this.setAppendages(appendages);
		this.setEyes(eyes);
		this.setName(name);
		numTentacles = tentacles;
	}
	
	public int getTentacles() {
		return numTentacles;
	}
	
	public void setTentacles(int tentacles) {
		numTentacles = tentacles;
	}
	
	public String toString() {
		return super.toString() + "\nTentacles: " + numTentacles;
	}
		
	
}
