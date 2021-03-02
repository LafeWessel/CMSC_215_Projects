package test;

public class PizzaOrder {
	private int numPizzas;
	private Pizza p1;
	private Pizza p2;
	private Pizza p3;
	
	PizzaOrder(){
		numPizzas = 0;
		p1 = null;
		p2 = null;
		p3 = null;
	}
	PizzaOrder(int numPizzas){
		this.numPizzas = numPizzas;
		p1 = null;
		p2 = null;
		p3 = null;
	}
	
	
	public Pizza getPizza1() {
		return p1;
	}
	public Pizza getPizza2() {
		return p2;
	}
	public Pizza getPizza3() {
		return p3;
	}
	public int getNumberOfPizzas() {
		return numPizzas;
	}
	
	public void setNumberOfPizzas(int numPiz) {
		numPizzas = numPiz;
	}
	public void setPizza1(Pizza p) {
		p1 = p;
	}
	public void setPizza2(Pizza p) {
		p2 = p;
	}
	public void setPizza3(Pizza p) {
		p3 = p;
	}
	
	public double calcTotal() {
		double total = 0.0;
		if(numPizzas >= 1) {
			total += p1.calcCost();
		}
		if(numPizzas >= 2) {
			total += p2.calcCost();
		}
		if(numPizzas >= 3) {
			total += p3.calcCost();
		}
		return total;
	}
	
	
}
