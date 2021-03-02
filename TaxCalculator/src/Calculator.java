
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Marital status:
		//0 = single, 1 = married
		//An int was used so that expansion of statuses is easily implementable
		int status = 0;
		int ti = 47500; // Taxable income
		float tax = 0.0f;
		
		String output = "";
		
		if(status == 0){ //Single
			output = "You are single, and you owe ";
			if(ti > 32000) {
				tax = (ti-32000) * 0.25f + 4400;
			}
			else if(ti > 8000) {
				tax = (ti-8000) * 0.15f + 800;
			}
			else if(ti > 0) {
				tax = ti * 0.1f;
			}
			else {
				System.out.println("Invalid taxable income");
			}
		}
		else if(status == 1) { //Married
			output = "You are married, and you owe ";
			if(ti > 64000) {
				tax = (ti-64000) * 0.25f + 8800;
			}
			else if(ti > 16000) {
				tax = (ti-16000) * 0.15f + 1600;
			}
			else if(ti > 0) {
				tax = ti * 0.1f;
			}
			else {
				System.out.println("Invalid taxable income");
			}
		}
		else {
			System.out.println("Invalid Marital Status");
		}
		
		output += (tax + " dollars.");
		System.out.println(output);
	}
}
