package PersonSub;

public class Student extends Person{
	//A student has a class status (Freshman, Sophomore, Junior or senior). 
	//The status should be defined as a constant.
	
	private final String classStatus;
	
	Student(){
		super();
		classStatus = "Freshman";
	}
	Student(String classStatus){
		super();
		this.classStatus = classStatus;
	}
	
	public String getClassStatus() {
		return classStatus;
	}
	
	public String toString() {
		return "Name: "+ name + "\nTitle: Student" + "\nClass Status:" + classStatus;
	}
}
