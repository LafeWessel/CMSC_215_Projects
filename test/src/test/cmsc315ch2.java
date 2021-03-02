package test;

public class cmsc315ch2 {
	public static void main(String[] args) {
		
		
		System.out.println(isEven(1));
		System.out.println(isEven(2));
		System.out.println(isEven(3));
		System.out.println(isEven(4));
		System.out.println(isEven(5));
		System.out.println(isEven(6));
		System.out.println(isEven(7));
		System.out.println(isEven(8));
		System.out.println(isEven(0));
		System.out.println(isEven(-1));


		
	}
	
	
	
	public static boolean isEven (int i)
	{
		try {
		if (i % 2 == 0)
				return true;
		if (i % 2 != 0)
			return false;
		System.out.println("oops");
		}
		catch(Exception e){
			
		}
	} // method isEven
}
