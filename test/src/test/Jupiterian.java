package test;

public class Jupiterian extends Alien{
	private boolean canFly;
	
	Jupiterian(){
//		this.setAppendages(2);
//		this.setEyes(1);
//		this.setName("Bob");
		canFly = false;
	}
	Jupiterian(int appendages, int eyes, String name, boolean fly){
		this.setAppendages(appendages);
		this.setEyes(eyes);
		this.setName(name);
		canFly = fly;
	}
	
	public boolean getFlight() {
		return canFly;
	}
	
	public void setFlight(boolean fly) {
		canFly = fly;
	}
		
	public String toString() {
		return super.toString() + "\nCan fly: " + canFly;
	}
	
	
}
