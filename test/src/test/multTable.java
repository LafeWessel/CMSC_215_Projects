package test;

public class multTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 12;
		String output = "";
		
		for(int r = num; r > 0; r--) {
			for(int c = num; c > 0; c--) {
				output += "\t" + (c*r);
			}
			System.out.println(output);
			output = "";
		}
		System.out.println(output);
	}
}