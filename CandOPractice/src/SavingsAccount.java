
public class SavingsAccount {
	
	public double balance;
	public double interest;
	
	public SavingsAccount(double b){
		balance = b;
	}
	
	public void Deposit(double d){
		balance += d;
	}
	
	public void Withdraw(double wd){
		balance -= wd;
	}
	
	public void addInterest(double in){
		interest = in;
		balance = balance - (balance * interest);
	}
}
