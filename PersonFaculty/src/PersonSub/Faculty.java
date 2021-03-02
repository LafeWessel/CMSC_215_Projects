package PersonSub;

public class Faculty extends Employee{
	//A faculty member has office hours and a rank. 
	
	private String officeHours;
	private String rank;
	
	Faculty(){
		super();
		officeHours = "None";
		rank = "None";
	}
	Faculty(String officeHours, String rank){
		super();
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	public String getRank() {
		return rank;
	}
	
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String toString() {
		return "Name: "+ name + "\nTitle: Faculty" + "\nOffice Hours: " + officeHours +
				"\nRank: " + rank;
	}
	
	
	
}
