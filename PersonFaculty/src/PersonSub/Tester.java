package PersonSub;
import java.util.Date;

public class Tester {
	public static void main(String[] args) {
		//Test Person class
		Person p = new Person();
		//System.out.println("\nPerson: " + p.toString());
		
		p.setAddress("6600 Penn. Ave");
		p.setEmailAddress("No email!");
		p.setName("Bob");
		p.setPhoneNumber("867-5309");
		System.out.println("\nPerson: " + p.toString());
		
		//Test Student class
		Student st = new Student();
		//System.out.println("\nStudent: " + st.toString() );
		st.setAddress("6600 Penn. Ave");
		st.setEmailAddress("No email!");
		st.setName("Bob");
		st.setPhoneNumber("867-5309");
		System.out.println("\nStudent: " + st.toString());
		
		//Test Employee class
		Employee e = new Employee();
		//System.out.println("\nEmployee: " + e.toString());
		e.setAddress("6600 Penn. Ave");
		e.setEmailAddress("No email!");
		e.setName("Bob");
		e.setPhoneNumber("867-5309");
		e.setOffice("Office no.1");
		e.setSalary(52000.00);
		Date hired = new Date();
		e.setDateHired(hired);
		System.out.println("\nEmployee: " + e.toString());
		
		//Test Faculty class
		Faculty f = new Faculty();
		//System.out.println("\nFaculty: " + f.toString());
		f.setAddress("6600 Penn. Ave");
		f.setEmailAddress("No email!");
		f.setName("Bob");
		f.setPhoneNumber("867-5309");
		f.setOffice("Office no.1");
		f.setSalary(52000.00);
		Date hiredf = new Date();
		f.setDateHired(hiredf);
		f.setOfficeHours("11-12pm");
		f.setRank("Adjunct Professor");
		System.out.println("\nFaculty: " + f.toString());
		
		//Test Staff class
		Staff sf = new Staff();
		//System.out.println("\nStaff: " + sf.toString());
		sf.setAddress("6600 Penn. Ave");
		sf.setEmailAddress("No email!");
		sf.setName("Bob");
		sf.setPhoneNumber("867-5309");
		sf.setOffice("Office no.1");
		sf.setSalary(52000.00);
		Date hiredsf = new Date();
		sf.setDateHired(hiredsf);
		sf.setTitle("Janitor");
		System.out.println("\nStaff: " + sf.toString());
	}
}
