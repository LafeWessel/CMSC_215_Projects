package PersonManager;

public class Employee extends Person{
	String ssn;
	
	Employee(){
		super();
		ssn = "";
	}
	Employee(String first, String last, String ssn){
		firstName = first;
		lastName = last;
		this.ssn = ssn;
	}
	
	public String getSSN() {
		return "xxx-xx-" + getCleanSSN();
	}
	
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public String toString() {
		return super.toString() + "\nSSN: xxx-xx-" + getCleanSSN();
	}
	
	//Should return the last 4 numbers of the SSN
	private String getCleanSSN() {
		String output = ssn.substring(ssn.length()-4);
		//System.out.println("Output: " + output);
		return output;
	}
}
