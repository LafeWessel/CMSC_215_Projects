package test;

public class CreateAlien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Martian matt = new Martian();
		System.out.println(matt.toString());
		
		Martian joe = new Martian(1,5,"joe",8);
		System.out.println(joe.toString());
		
		Jupiterian jack = new Jupiterian();
		System.out.println(jack.toString());
		
		Jupiterian arnold = new Jupiterian(4,5,"Arnold",true);
		System.out.println(arnold.toString());
		
	}

}
