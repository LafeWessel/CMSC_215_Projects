package test;


public class TestCount {
	public static void main(String args[]) {
		
		Counter ctr = new Counter();
		ctr.increment();
		ctr.increment();
		ctr.increment();
		System.out.println(ctr.displayCount());
		ctr.decrement();
		System.out.println(ctr.displayCount());
		ctr.setZero();
		System.out.println(ctr.displayCount());
		ctr.increment();
		System.out.println(ctr.getCount());
		ctr.decrement();
		ctr.decrement();
		System.out.println(ctr.getCount());
		
		char c = 1;
		for (int i = 0; i < 100; i++) {
			c++;
			System.out.println(i + " " + c);
		}
	}
}
