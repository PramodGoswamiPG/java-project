package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class MainclassE {
	

	public static void main(String[] args) {
		ArrayList<Employee> l1=new ArrayList<Employee>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the eid");
		int id=sc.nextInt();
		System.out.println("enter the ename");
		String en=sc.next();
		System.out.println("enter the esal");
		double ed=sc.nextDouble();
		
		Employee e1=new Employee(id, en,ed, "HR", 9122646056L);
		Employee e2=new Employee(102, "prIYANKA",23000.00, "CEO", 9122646056L);
		
		l1.add(e1);
		l1.add(e2);
		
		
		double max=l1.get(0).getEsal();
		
		for (Employee object : l1) {
			if(max<object.getEsal())
			{
				max=object.getEsal();
			}
			
		
			
		}
		for (Employee object  : l1) {
			if(max==object.getEsal())
			{
				System.out.println(object);
			}
		}
		
	}

}
