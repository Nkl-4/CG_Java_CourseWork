package lab_4;

public class CurrentAccount extends Account{
	final double overdraftLimit = 5000.0d;
	
	void withdraw(double val) {
		double bal = this.getBalance();
		
		if(bal >= overdraftLimit) {
			return new Boolean(true);
		}
		else {
			return false;
		}
	}

}
