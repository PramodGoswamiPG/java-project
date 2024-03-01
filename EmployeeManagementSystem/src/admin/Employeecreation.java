package admin;
public class Employeecreation {
	private static int initid=1001;

static public Employee Create(String ename, double esalary, String edept, long ePhoneno, double exp)
	{
//	Employee A1=new Employee(ename,1627, esalary,edept,ePhoneno,exp);
    return new Employee(ename,initid++,esalary,edept,ePhoneno,exp);
	}
}
