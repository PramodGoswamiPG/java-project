package learningset;

public class Employee {
	String name;
	int id;
	double salary;
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public int hashCode()
	{
		return this.id;
		
	}
	
	public boolean equals(Object arg)
	{
		return this.hashCode()==arg.hashCode();
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	

}
