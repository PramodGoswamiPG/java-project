package learningset;

import java.util.TreeSet;

public class Maintreeset {
	public static void main(String[] args) {
		

		Employee e1=new Employee("pramod", 1234,20009.00 );
		Employee e2=new Employee("priyan", 1235,200899.00 );
		Employee e3=new Employee("dimple", 1236,20022.00 );
		Employee e4=new Employee("julee", 1237,20023.00 );
		Employee e5=new Employee("prity", 1238,20045.00 );
		TreeSet<Employee> s1=new TreeSet<Employee>();
		
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		
//		s1.add(25);
//		s1.add(34);
//		s1.add(10);
//		s1.add(20);
		System.out.println("total elements: " +s1.size());
		System.out.println("treeSet elements");
		System.out.println(s1);
		for (Object ele : s1) {
			System.out.println(ele);
			
		}
	}

}
