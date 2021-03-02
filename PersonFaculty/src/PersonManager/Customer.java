package PersonManager;

public class Customer extends Person{
	private String number;
	
	Customer(){
		super();
		number = "";
	}
	Customer(String first, String last, String number){
		firstName = first;
		lastName = last;
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return super.toString() + "\nCustomer Number: " + number;
	}
}
