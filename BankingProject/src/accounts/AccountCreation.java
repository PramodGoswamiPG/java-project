package accounts;

public class AccountCreation {
	
	 public Account CreateAccount(String accholdername,String iFSC_CODE,long acc_no,String branch_name,double acc_bal)
	{
	Account A1=new Account(accholdername,iFSC_CODE,acc_no,branch_name,acc_bal);
    return A1;
	}
	
}
