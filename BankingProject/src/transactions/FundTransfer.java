package transactions;

import accounts.Account;

public class FundTransfer {
	 
	public boolean transfer(Account Fromacc, Account toacc, double Fund)
	{
		if(Fromacc.getAcc_bal()>Fund)
		{
			Fromacc.setAcc_bal(toacc.getAcc_bal()-Fund);
			toacc.setAcc_bal(toacc.getAcc_bal()+Fund);
			return true;
		}
		else
		{
			return false;
		}
	
	}

}
