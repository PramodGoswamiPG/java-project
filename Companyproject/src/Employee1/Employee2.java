package Employee1;

import java.util.Comparator;

public class Employee2  implements Comparable <Employee2> {
	
	String ename;
	double esal;
	int eage;
	String edesgn;
	long ephone;
	public Employee2(String ename, double esal, int eage, String edesgn, long ephone) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.eage = eage;
		this.edesgn = edesgn;
		this.ephone = ephone;
	}
	
	@Override
	public String toString() {
		return "Employee2 [ename=" + ename + ", esal=" + esal + ", eage=" + eage + ", edesgn=" + edesgn + ", ephone="
				+ ephone + "]";
	}
	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return this.ename.compareTo(ename);
	}
	
	class Empsortbysal implements Comparator<Employee2>
	{

		@Override
		public int compare(Employee2 o1, Employee2 o2) {
			if(o1.esal==o2.esal)
			{
				return o1.ename.compareTo(ename);
			} else if(o1.esal>o2.esal)
			{
				return 1;
			}
			else {
				return -1;
			}
			
		}
		
	}
	
	
	class Empsortbydesgn implements Comparator<Employee2>
	{

		@Override
		public int compare(Employee2 o1, Employee2 o2) {
			return o1.edesgn.compareTo(edesgn);
			
		}
		
	}
	
	


}


class Empsortbysal implements Comparator<Employee2>
{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		if(o1.esal==o2.esal)
		{
			return o1.ename.compareTo(o2.ename);
		} else if(o1.esal>o2.esal)
		{
			return 1;
		}
		else {
			return -1;
		}
		
	}
	
}


class Empsortbydesgn implements Comparator<Employee2>
{

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		return o1.edesgn.compareTo(o2.edesgn);
		
	}
	
}