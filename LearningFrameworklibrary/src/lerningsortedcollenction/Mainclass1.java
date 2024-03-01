package lerningsortedcollenction;

import java.util.TreeSet;

public class Mainclass1 {
	public static void main(String[] args) {
		NameComparator namewise=new NameComparator();
		SalaryCompartor salrywise=new SalaryCompartor();
		TreeSet<Employee> empset=new TreeSet<Employee>(namewise);
		
		Employee e1=new Employee(2433, "pramod", 34000.00);
		Employee e2=new Employee(6776, "dimple", 7675.00);
		Employee e3=new Employee(3534, "manish", 3785.00);
		Employee e4=new Employee(1248, "priy", 98765.00);
		Employee e5=new Employee(2773, "guddu", 67899.00);
		
		empset.add(e1);
		empset.add(e2);
		empset.add(e3);
		empset.add(e4);
		empset.add(e5);
		
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("ID\tNAME\tSALARY");
		System.out.println("----\t-----\t------");
		for (Employee emp : empset) {

			
			System.out.println(emp.id+"\t"+emp.Name+"\t"+emp.salary);
			
		}
		
	}

}
