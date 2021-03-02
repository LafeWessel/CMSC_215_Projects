package PersonSub;

import java.util.Date;

public class Employee extends Person{
	//An employee has an office, salary, and date hired. 
	//Use the provided MyDate class to create an object for date hired.
	protected String office;
	protected double salary;
	protected Date dateHired;
	
	Employee(){
		super();
		office = "NULL";
		salary = 0.0;
		dateHired = new Date();
	}
	Employee(String office, double salary, Date dateHired)
	throws CloneNotSupportedException{
		super();
		this.office = office;
		this.salary = salary;
		this.dateHired = (Date)dateHired.clone();
	}
	
	public String getOffice() {
		return office;
	}
	public double getSalary() {
		return salary;
	}
	public Date getDateHired() {
		return dateHired;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDateHired(Date dateHired) 
	//throws CloneNotSupportedException
	{
		this.dateHired =(Date)dateHired.clone();
	}
	
	public String toString() {
		return "Name: "+ name + "\nTitle: Employee" + "\nOffice:" + office + "\nSalary: " + salary +
				"\nDate Hired: " + dateHired.toString();
	}
}
