package test;

public class Pizza {

	private int size; //0 = small, 1 = medium, 2 = large
	private int pepperoni;
	private int cheese;
	private int ham;
	
	Pizza(){ //Default to medium cheese pizza
		size = 1; 
		pepperoni = 0;
		cheese = 1;
		ham = 0;
	}
	Pizza(int sizeI, int pepI, int cheI, int hamI){
		size = sizeI;
		pepperoni = pepI;
		cheese = cheI;
		ham = hamI;
	}
	
	public int getSize(){	
		return size;
	}
	public int getPepperoni(){
		return pepperoni;
	}
	public int getCheese() {
		return cheese;
	}
	public int getHam() {
		return ham;
	}
	
	public void setSize(int sizeI) {
		size = sizeI;
	}
	public void setPepperoni(int pepI) {
		pepperoni = pepI;
	}
	public void setCheese(int cheI) {
		cheese = cheI;
	}
	public void setHam(int ham) {
		this.ham = ham;
	}
	
	public double calcCost() {
		double total = 0;
	//Calculate size cost
		total += (10 + (2*size));
		
	//Calculate toppings
		total += 2*(pepperoni + ham + cheese);
		return total;
	}
	
	public String getDescription() {
		String desc = "";
		
		String pSize = "";
		if(size == 0) {
			pSize = "Small";
		}
		else if(size == 1) {
			pSize = "Medium";
		}
		else {
			pSize = "Large";
		}
		
		desc = "Size:\t" + pSize + "\nCheese:\t" + cheese +"\nPepperoni:\t" + pepperoni +
				"\nHam:\t" + ham + "\nTotal Cost:\t" + calcCost();
		return desc;
	}
}
