package entity;

public class Customer {

	private String cname;
	private int cid;
	private long cphone;
	private String cemail;
	private Address caddress;
	private int cpan;
	private double camt;

	public double getCamt() {
		return camt;
	}

	public void setCamt(double camt) {
		this.camt = camt;
	}

	public Customer(String cname, int cid, long cphone, String cemail, Address caddress, int cpan) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.cphone = cphone;
		this.cemail = cemail;
		this.caddress = caddress;
		this.cpan = cpan;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public long getCphone() {
		return cphone;
	}

	public void setCphone(long cphone) {
		this.cphone = cphone;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public Address getCaddress() {
		return caddress;
	}

	public void setCaddress(Address caddress) {
		this.caddress = caddress;
	}

	public int getCpan() {
		return cpan;
	}

	public void setCpan(int cpan) {
		this.cpan = cpan;
	}

	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", cphone=" + cphone + ", cemail=" + cemail + ", caddress="
				+ caddress + ", cpan=" + cpan + "]";
	}

}
