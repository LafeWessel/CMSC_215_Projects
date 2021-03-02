package PersonManager;

public class Person {
	protected String firstName;
	protected String lastName;
	
	Person(){
		firstName = "";
		lastName = "";
	}
	Person(String first, String last){
		firstName = first;
		lastName = last;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String first) {
		firstName = first;
	}
	public void setLastName(String last) {
		lastName = last;
	}
	
	public String toString() {
		return "Name: " + firstName + " " +  lastName;
	}
	
}
