package org.Emp;

public class Employee {
	private int E_id;
	private String E_name;
	private String E_designation;
	private double E_sal;
	private long E_phone;
	private int E_age;

	public Employee(int e_id, String e_name, String e_designation, double e_sal, long e_phone, int e_age) {
		super();
		this.E_id = e_id;
		this.E_name = e_name;
		this.E_designation = e_designation;
		this.E_sal = e_sal;
		this.E_phone = e_phone;
		this.E_age = e_age;
	}

	public int getE_id() {
		return E_id;
	}

	public void setE_id(int e_id) {
		E_id = e_id;
	}

	public String getE_name() {
		return E_name;
	}

	public void setE_name(String e_name) {
		E_name = e_name;
	}

	public String getE_designation() {
		return E_designation;
	}

	public void setE_designation(String e_designation) {
		E_designation = e_designation;
	}

	public double getE_sal() {
		return E_sal;
	}

	public void setE_sal(double e_sal) {
		E_sal = e_sal;
	}

	public long getE_phone() {
		return E_phone;
	}

	public void setE_phone(long e_phone) {
		E_phone = e_phone;
	}

	public int getE_age() {
		return E_age;
	}

	public void setE_age(int e_age) {
		E_age = e_age;
	}
	

	@Override
	public String toString() {
		return "Employee [E_id=" + E_id + ", E_name=" + E_name + ", E_designation=" + E_designation + ", E_sal=" + E_sal
				+ ", E_phone=" + E_phone + ", E_age=" + E_age + "]";
	}
	
	
}
