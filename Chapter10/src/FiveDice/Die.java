package FiveDice;

public class Die {
	
	private int number;
	
	Die(){
		number = 1;
	}
	
	public void setNum(int num) {
		number = num;
	}
	
	public int getNum() {
		return number;
	}
	
	public void roll() {
		number = (int)(Math.random() *6 +1);
	}
	
}
