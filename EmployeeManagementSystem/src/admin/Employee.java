package admin;

public class Employee {
	
	private String Ename;
	private final int Eid;
	private double Esalary;
	private String Edept;
	private long EPhoneno;
	private double exp;
	
	public Employee(String ename, int eid, double esalary, String edept, long ePhoneno, double exp) {
		super();
		Ename = ename;
		Eid = eid;
		Esalary = esalary;
		Edept = edept;
		EPhoneno = ePhoneno;
		this.exp = exp;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public double getEsalary() {
		return Esalary;
	}

	public void setEsalary(double esalary) {
		Esalary = esalary;
	}

	public String getEdept() {
		return Edept;
	}

	public void setEdept(String edept) {
		Edept = edept;
	}

	public long getEPhoneno() {
		return EPhoneno;
	}

	public void setEPhoneno(long ePhoneno) {
		EPhoneno = ePhoneno;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	public int getEid() {
		return Eid;
	}

	@Override
	public String toString() {
		return "Employee [Ename=" + Ename + ", Eid=" + Eid + ", Esalary=" + Esalary + ", Edept=" + Edept + ", EPhoneno="
				+ EPhoneno + ", exp=" + exp + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
