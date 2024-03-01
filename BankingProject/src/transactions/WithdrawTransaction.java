package transactions;

import accounts.Account;

public class WithdrawTransaction {
	
	 public Boolean withdraw(Account A1,double withamt)
	{
		if(A1.getAcc_bal()>withamt)
		{
			A1.setAcc_bal(A1.getAcc_bal()-withamt);
			return true;
		}
		else
		{
			return false;
		}
	}

}
