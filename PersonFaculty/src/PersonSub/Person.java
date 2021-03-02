package PersonSub;

public class Person {
//A person has a name, address, phone number, and e-mail address.
	protected String name;
	protected String address;
	protected String phoneNum;
	protected String emailAddr;
	
	Person(){
		name= "None";
		address= "None";
		phoneNum= "None";
		emailAddr= "None";
	}
	Person(String name,String addr,String phNum,String emAddr){
		this.name = name;
		address = addr;
		phoneNum = phNum;
		emailAddr = emAddr;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhoneNumber() {
		return phoneNum;
	}
	public String getEmailAddress() {
		return emailAddr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String addr) {
		address = addr;
	}
	public void setPhoneNumber(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void setEmailAddress(String email) {
		emailAddr = email;
	}
	
	
	public String toString() {
		return "Name: " + name + "\nAddress: " + address +
				"\nPhone Number: " + phoneNum + "\nEmail Address:" +
				emailAddr;
	}
	
}
