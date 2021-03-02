package test;

public class PizzaOrderTester {
	public static void main(String[] args) {
		PizzaOrder po = new PizzaOrder();
		System.out.println("total cost:" + po.calcTotal());
		po.setNumberOfPizzas(2);
		Pizza p2 = new Pizza(1,1,1,2);
		po.setPizza1(p2);
		po.setPizza2(p2);
		po.setPizza3(p2);
		System.out.println("total Cost(2):" + po.calcTotal());
		po.setNumberOfPizzas(1);
		System.out.println("total Cost(1):" + po.calcTotal());
		po.setNumberOfPizzas(3);
		System.out.println("total Cost(3):" + po.calcTotal());
		p2.setCheese(4);
		p2.setPepperoni(3);
		p2.setSize(2);
		p2.setHam(2);
		po.setPizza1(p2);
		po.setPizza2(p2);
		po.setPizza3(p2);
		System.out.println("total Cost(2):" + po.calcTotal());
		po.setNumberOfPizzas(1);
		System.out.println("total Cost(1):" + po.calcTotal());
		po.setNumberOfPizzas(3);
		System.out.println("total Cost(3):" + po.calcTotal());
	}
}
