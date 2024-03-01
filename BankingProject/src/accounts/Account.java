package accounts;

public class Account {
	
	private String Accholdername;
	private String IFSC_CODE;
	private long Acc_no;
	private String Branch_name;
	private double Acc_bal;
	
	//creating constructor
	public Account(String accholdername, String iFSC_CODE, long acc_no, String branch_name, double acc_bal) {
		super();
		this.Accholdername = accholdername;
		this.IFSC_CODE = iFSC_CODE;
		this.Acc_no = acc_no;
		this.Branch_name = branch_name;
		this.Acc_bal = acc_bal;
	}
	
	//create getter method 
	public String getAccholdername()
	{
		return Accholdername;
	}
	
	public String getIFSC_CODE()
	{
		return IFSC_CODE;
	}
	
	public long getAcc_no()
	{
		return Acc_no;
	}
	
	public String getBranch_name()
	{
		return Branch_name;
	}
	
	public double getAcc_bal()
	{
		return Acc_bal;
	}
	
	
	//create setter method
	public void setAccholdername(String Accholdername)
	{
		this.Accholdername=Accholdername;
	}
	
	public void setAcc_bal(double Acc_bal)
	{
		this.Acc_bal=Acc_bal;
	}
	
	public void setAcc_no(long Acc_no)
	{
		this.Acc_no=Acc_no;
	}
	
	public void setBranch_name(String Branch_name)
	{
		this.Branch_name=Branch_name;
	}
	
	public void setIFSC_CODE(String IFSC_CODE )
	{
		this.IFSC_CODE=IFSC_CODE;
	}
	
}










