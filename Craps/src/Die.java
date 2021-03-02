
public class Die {
	private int roll;
	
	Die(){
		roll=0;
	}
	public void roll() {
		roll = (int)(Math.random()*6) + 1;
	}
	public int getValue() {
		return roll;
	}
}
