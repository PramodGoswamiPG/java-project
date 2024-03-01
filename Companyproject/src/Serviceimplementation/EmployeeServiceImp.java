package Serviceimplementation;

import java.util.ArrayList;
import java.util.Scanner;
import org.Emp.Employee;
import service.EmployeeService;

public class EmployeeServiceImp implements EmployeeService {
	Scanner sc=new Scanner(System.in);
	
	ArrayList<Employee> ae=new ArrayList<Employee>();
	

	@Override
	public void addEmp() {
		
		System.out.println("Employee Details");
		System.out.println("------------------");
		
		System.out.println("Enter Employee Id:  ");
		int eid=sc.nextInt();
		
		System.out.println("Enter Employee Name: ");
		String en=sc.next();
	
		System.out.println("Enter Employee Designation: ");
		String ed=sc.next();
		
		System.out.println("Enter Employee Salary: ");
		double es=sc.nextDouble();
		
		System.out.println("Enter Employee Phone No:");
		long ep=sc.nextLong();
		
		System.out.println("Enter Employee Age: ");
		int ea=sc.nextInt();
		Employee e1=new Employee(eid, en, ed, es, ep, ea);
		
//		ae.add(new Employee(eid, en, ed, es, ep, ea));
		ae.add(e1);
		System.out.println("Employee Added Successfully ");
	}

	@Override
	public void getallEmp() {
		
		
		System.out.println(" Employee Details");
		if(ae.size()==0)
		{
			System.out.println("There is no Employee ");
		}
		else
		{
			for (Employee emp : ae) {
				System.out.println(emp);
		
		}
	}
	
	

	}

	@Override
	public void getEmpByEid() {
		boolean flag=false;
		
		System.out.println("Enter Employee ID");
		int eid=sc.nextInt();
		System.out.println("searching Employee by id");
		for (Employee emp : ae) {
			if(emp.getE_id()==eid)
			{
				System.out.println(emp);
				flag=true;
				break;
				
			}
			if(flag==false)
			{
				System.out.println("Eid not found");
			}
		}

		
	}

	@Override
	public void findempBySal() {
	System.out.println("Enter lowest sal");
	int ls=sc.nextInt();
	System.out.println("enter heighest sal");
	int hs=sc.nextInt();
	boolean flag=false;
	for (Employee emp : ae) {
		if(emp.getE_sal()>=ls && emp.getE_sal()<=hs)
		{
			System.out.println(emp);
			flag=true;
		}
	
		
	}
	if(flag==false)
	{
		System.out.println("no Employee found..!!!!");
	}

}

//	@Override
//	public void updateemp() {
//		System.out.println("Updation Employee");
//		System.out.println("1.Eid\n2.Ename\n3.Esal");
//		int io=sc.nextInt();
//	
//		
//	}
}
