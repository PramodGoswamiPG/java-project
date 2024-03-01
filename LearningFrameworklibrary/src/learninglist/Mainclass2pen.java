package learninglist;

import java.util.ArrayList;

public class Mainclass2pen {
	public static void main(String[] args) {
		Pen p1=new Pen("cello","balck",25.00);
		Employee e1=new Employee("pramod",101,2000.00);
		NoteBook n1=new NoteBook("Math",40,300);
		Student s1=new Student("priyanka", 40, "A");
		
		ArrayList l1=new ArrayList();
		l1.add(p1);
		l1.add(e1);
		l1.add(n1);
		l1.add(s1);
		l1.add(p1);
		for (Object element : l1) {
			if(element instanceof Employee)
			{
			System.out.println(element);
			}
		}
		
		//cheking equality based on hashcode
		if(l1.get(0).equals(l1.get(4)))
		{
			System.out.println("doplicate pen object");
		}
		
	
	}

}
