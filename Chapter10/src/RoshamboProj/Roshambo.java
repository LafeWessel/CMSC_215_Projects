package RoshamboProj;

public enum Roshambo {
	ROCK("Rock"),PAPER("Paper"),SCISSORS("Scissors");
	
	private String description;
	
	private Roshambo(String desc) {
		description = desc;
	}
	
	public String toString() {
		return description;
	}
}
