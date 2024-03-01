package transactions;

import accounts.Account;

public class DepositTransaction {
	
	public  void deposit(Account A1, double deposit)
	{
		A1.setAcc_bal(A1.getAcc_bal()+deposit);
		
	}

}
