package lab_4;

public class Account {
//	private long count = 1L;
	private static long accNum = 100000000100L;
	private double balance;
	private Person accHolder;
	
	public Account() {
		accNum++;
	}

	public Account(double balance, Person accHolder) {
		super();
		this.balance = balance;
		this.accHolder = accHolder;
	}

	
	public long getAccNum() {
		return accNum;
	}


	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	void deposit(double val) {
		this.balance += val;
	}
	
	void withdraw(double val) {
		this.balance -= val;
	}
	

	
}

