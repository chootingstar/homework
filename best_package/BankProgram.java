package best_package;

public class BankProgram {
	
	public static void main(String[] args) {
		CheckingAccount c = new CheckingAccount();
		SavingsAccount s = new SavingsAccount();
		CertificateOfDeposit cd = new CertificateOfDeposit();
		
		BankAccount bc = new CheckingAccount();
		//can do this but limited only to common methods
		
		//CheckingAccount cb = new BankAccount();
		//cannot do this (you cannot be your own parent)
		
		c.limit = 6000.00;
		bc.accntNumber = "50050050";
		c.balance = 200.00;
		
		s.transfers = 5;
		s.accntNumber = "60606000";
		s.balance = 8000.10;
		
		cd.accntNumber = "11272021";
		cd.balance = 14000.50;
		
		System.out.println(c.limit);
		System.out.println(bc.accntNumber);
		System.out.println(s.balance);
		System.out.println(cd.balance);
		System.out.println(s.transfers);
	}

}
