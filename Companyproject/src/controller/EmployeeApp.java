package controller;

import java.util.Scanner;

import Serviceimplementation.EmployeeServiceImp;

public class EmployeeApp {
	public static void main(String[] args) {
		EmployeeServiceImp e=new EmployeeServiceImp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Employee Database");
		while(true)
		{
			
			System.out.println("Menu");
			System.out.println("1.Add Employee\n2.All Employee Details\n3.Getbyid\n4.Find Emp by range sal\n5.Exit");
			System.out.println("Please Enter your option");
			int io=sc.nextInt();
			switch (io) {
			case 1: {
				e.addEmp();
				break;
				
			}
			case 2: {
				e.getallEmp();
				break;
				
			}
			
			case 3: {
				e.getEmpByEid();
				break;
				
			}
			
			case 4: {
				e.findempBySal();
				break;
				
			}
			
		
			case 5: {
				System.out.println("======thank you vist again=======");
				System.exit(0);
				
			}
			default:
				System.out.println("invalid option");
				
			}
		}
	}


}
