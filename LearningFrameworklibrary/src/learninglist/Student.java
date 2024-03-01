package learninglist;

public class Student {
	String Name;
    int rollno;
    String Section;
	public Student(String name, int rollno, String section) {
		super();
		Name = name;
		this.rollno = rollno;
		Section = section;
	}
	
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", rollno=" + rollno + ", Section=" + Section + "]";
	}
    
    

}
