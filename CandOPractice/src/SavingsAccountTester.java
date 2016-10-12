
public class SavingsAccountTester {

	public static void main(String[] args) {
		
		SavingsAccount s1 = new SavingsAccount(1000.00);
		s1.addInterest(.1);
		System.out.println(s1.balance);
		
	}

}
