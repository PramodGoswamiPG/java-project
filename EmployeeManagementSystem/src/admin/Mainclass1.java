package admin;

import repository.EmployeeDB;

public class Mainclass1 {

	public static void main(String[] args) {
		
		EmployeeDB edb=new EmployeeDB(5);
		
		Employee e1=Employeecreation.Create("pramod",2000.00,"hr",91757527572l,3.5);
		
		Employee e2=Employeecreation.Create("priyan",20288.00,"ceo",91757527575l,5.5);
		
Employee e3=Employeecreation.Create("dimple",2000.00,"hr",91757527572l,3.5);
		
		Employee e4=Employeecreation.Create("manish",20288.00,"ceo",91757527575l,5.5);
Employee e5=Employeecreation.Create("anjali",2000.00,"hr",91757527572l,3.5);
		
		Employee e6=Employeecreation.Create("jaya",20288.00,"ceo",91757527575l,5.5);
		
		 edb.addEmployee(e1);
		 edb.addEmployee(e2);
		 edb.addEmployee(e3);
		 edb.addEmployee(e4);
		 edb.addEmployee(e5);
		 edb.addEmployee(e6);
		 
		 edb.viewEmployeeRecords();
		 
		Employee e= edb.getEmployee(1004);
		 System.out.println(e);
		
		 
		
		
		
		
		
	}
}
