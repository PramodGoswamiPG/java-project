package Employee1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;





public class Mainclass1 {
	
	public static void main(String[] args) {
		
		ArrayList<Employee2> l1=new ArrayList<Employee2>();
		Employee2 e1=new Employee2("pramod",92782 , 023, "BDA", 852445262);
		Employee2 e2=new Employee2("pramod",92782 , 023, "BDA", 852445262);
		Employee2 e3=new Employee2("pramod",92782 , 023, "BDA", 852445262);
		Employee2 e4=new Employee2("pramod",92782 , 023, "BDA", 852445262);
	
		l1.add(e4);
		l1.add(e3);
		l1.add(e2);
		l1.add(e3);
		
		Empsortbydesgn desg=new Empsortbydesgn();
		
		Collections.sort(l1,desg);
		System.out.println("=========sort=========");
		for (Employee2 ele : l1) {
			System.out.println(ele);
			
		}
		
		
		
	}

}
