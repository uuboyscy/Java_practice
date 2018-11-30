
public class Account {

	String accountNo;
	double balance;
	static String accountNo2;
	static double balance2;
	Account(String accountNo, double balance){
		this.accountNo = accountNo;
		this.balance = balance;
	}
	void printAccData() {
		System.out.println("Account is " + accountNo);
		System.out.println("Balance is " + balance);
	}
	
	static void printAccData2() {
		//accountNo = this.accountNo;
		System.out.println("Account is " + accountNo2);
		System.out.println("Balance is " + balance2);
	}
	
	public static void main(String[] args) {
		
/*		Account cus1 = new Account("124654", 50000);
		cus1.printAccData();
		
		Account ac1 = new Account("127333", 57730);
		CheckingAccount ac2 = new CheckingAccount("837444", 18730, 20);
		ac1.printAccData();
		ac2.printAccData();
*/
		//polymorphism practice
		Account[] a = new Account[2];
		
		a[0] = new Account("12345", 123456);
		a[1] = new CheckingAccount("12346", 654321, 1);
		for(int i = 0 ; i < a.length ; i++) a[i].printAccData();
		
		Account.accountNo2 = "1234";
		Account.balance2 = 1234567;
		
		
	}

}
