package learningset;

import java.util.HashSet;

public class Mainclass2 {

	public static void main(String[] args) {
		System.out.println("main started");
		
		
		Employee e1=new Employee("pramod", 1234,20009.00 );
		Employee e2=new Employee("priyan", 1235,200899.00 );
		Employee e3=new Employee("dimple", 1236,20022.00 );
		Employee e4=new Employee("julee", 1237,20023.00 );
		Employee e5=new Employee("prity", 1238,20045.00 );
		
		HashSet<Employee> s1=new HashSet<Employee>();
		
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		System.out.println("total employee: "+s1.size());
		System.out.println("---------------------------");
		System.out.println("Name\t"+"ID\t"+"Salary\t");
		System.out.println("---------------------------");
		for (Employee emp : s1) {
			System.out.println(emp.name+"\t"+emp.id+"\t"+emp.salary);
			
		}
		System.out.println("---------------------------");
		System.out.println("main ended");
	}
}
