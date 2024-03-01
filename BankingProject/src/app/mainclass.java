package app;

import accounts.Account;
import accounts.AccountCreation;
import transactions.DepositTransaction;
import transactions.FundTransfer;
import transactions.ViewAccountBalance;
import transactions.WithdrawTransaction;

public class mainclass {
	
	public static void main(String[] args) {
		AccountCreation ac =new AccountCreation();
		
		Account A1=ac.CreateAccount("pramod","BKID10",6122672577867l,"ranchi",30000.00);
		Account A2=ac.CreateAccount("priyanka","BKID61511",6151101100l,"hatai",20000.00);
		WithdrawTransaction w1=new WithdrawTransaction(); 
		DepositTransaction d1=new DepositTransaction();
		FundTransfer f1=new FundTransfer();
		
		ViewAccountBalance v1=new ViewAccountBalance();
		
		v1.viewBalance(A1);
		w1.withdraw(A1,5000);
		d1.deposit(A1,2000.00);
		f1.transfer(A1, A2, 1000);
		v1.viewBalance(A2);
		
		
		
		
	
	
	}

}
