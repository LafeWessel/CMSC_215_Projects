package test;

public class PizzaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza p = new Pizza();
		System.out.println(p.getDescription());
		
		Pizza p2 = new Pizza(1,1,1,2);
		System.out.println("Cheese: " + p2.getCheese());
		System.out.println("Pep: " + p2.getPepperoni());
		System.out.println("Ham: " + p2.getHam());
		System.out.println("Size: " + p2.getSize());
		
		p2.setCheese(4);
		p2.setPepperoni(3);
		p2.setSize(2);
		p2.setHam(2);
		System.out.println(p2.getDescription());
		
	}

}
