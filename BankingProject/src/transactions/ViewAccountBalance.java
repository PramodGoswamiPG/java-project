package transactions;

import accounts.Account;

public class ViewAccountBalance {
	
	public void viewBalance(Account A1)
	{
		System.out.println(A1.getAcc_bal());
		System.out.println(A1.getAcc_no());
		
	}

}
