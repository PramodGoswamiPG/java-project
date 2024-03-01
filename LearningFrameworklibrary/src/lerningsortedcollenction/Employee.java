package lerningsortedcollenction;

public class Employee implements Comparable<Employee> {

	Integer id;
	String Name;
	Double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		Name = name;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", salary=" + salary + "]";
	}
	
	public int compareTo(Employee e)
	{
		return this.id-e.id;
	}
	
}
