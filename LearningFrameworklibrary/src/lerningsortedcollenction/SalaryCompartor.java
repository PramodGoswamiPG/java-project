package lerningsortedcollenction;

import java.util.Comparator;

public class SalaryCompartor implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.salary.compareTo(e2.salary);
	}

}
