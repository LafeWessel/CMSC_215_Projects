package PersonSub;

public class Staff extends Employee{
//A staff member has a title.
	private String title;
	
	Staff(){
		super();
		title = "None";
	}
	Staff(String title){
		super();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		return "Name: "+ name + "\nTitle: Staff" + "\nJob Title: " + title;
	}
}
