package test;

public abstract class Alien {
	private int numEyes;
	private int numAppendages;
	private String name;
	
	Alien(){
		numEyes = 1;
		numAppendages = 1;
		name = "No name";
	}
	
	public int getEyes() {
		return numEyes;
	}
	public int getAppendages() {
		return numAppendages;
	}
	public String getName() {
		return name;
	}
	
	public void setEyes(int eyes) {
		numEyes = eyes;
	}
	public void setAppendages(int appendages) {
		numAppendages = appendages;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name: " + name + "\nEyes: " + numEyes + "\nAppendages: " + numAppendages;
	}
	
}
