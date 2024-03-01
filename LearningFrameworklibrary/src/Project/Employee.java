package Project;

public class Employee {
	private int Eid;
	private String Ename;
	private double Esal;
	private String Edesignation;
	private long Ephone;
	
	public Employee(int eid, String ename, double esal, String edesignation, long ephone) {
		super();
		Eid = eid;
		Ename = ename;
		Esal = esal;
		Edesignation = edesignation;
		Ephone = ephone;
	}
	
	

	public int getEid() {
		return Eid;
	}



	public void setEid(int eid) {
		Eid = eid;
	}



	public String getEname() {
		return Ename;
	}



	public void setEname(String ename) {
		Ename = ename;
	}



	public double getEsal() {
		return Esal;
	}



	public void setEsal(double esal) {
		Esal = esal;
	}



	public String getEdesignation() {
		return Edesignation;
	}



	public void setEdesignation(String edesignation) {
		Edesignation = edesignation;
	}



	public long getEphone() {
		return Ephone;
	}



	public void setEphone(long ephone) {
		Ephone = ephone;
	}



	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Esal=" + Esal + ", Edesignation=" + Edesignation
				+ ", Ephone=" + Ephone + "]";
	}
	
	
	
	

}
