package lab_4;

public class SavingsAccount extends Account{
	final double minimumBalance = 500.0d;
	
	void withdraw(double val) {
		double bal = this.getBalance();
		
		if (bal - val < minimumBalance) {
			
		}
	}
}
