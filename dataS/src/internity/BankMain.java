package internity;

public class BankMain {

	public static void main(String[] args) {
		
		
		
		Account Customer1 = new Account() ;
		Account Customer2 = new Account() ;
		Account Customer3 = new Account() ;
		Account Customer4 = new Account() ;
		Account Customer5 = new Account() ;
		
		Customer1.deposit(1000);
		System.out.println("Customer 1 has deposite " + Customer1.getBalace() + "rs");
		Customer1.withdraw(800);
		System.out.println("Customer 1 has Withdraw");
		System.out.println("Updated Balance" + Customer1.getBalace());
		
		Customer2.deposit(2000);
		System.out.println("Customer 2 has deposite " + Customer2.getBalace() + "rs");
		Customer2.withdraw(10000);
		System.out.println("Customer 2 has Withdraw");
		System.out.println("Updated Balance" + Customer2.getBalace());
		
		Customer3.deposit(1500);
		System.out.println("Customer 3 has deposite " + Customer3.getBalace() + "rs");
		Customer3.withdraw(301);
		System.out.println("Customer 3 has Withdraw");
		System.out.println("Updated Balance" + Customer3.getBalace());
		
		Customer4.deposit(15);
		System.out.println("Customer 4 has deposite " + Customer4.getBalace() + "rs");
		Customer4.withdraw(5);
		System.out.println("Customer 4 has Withdraw");
		System.out.println("Updated Balance" + Customer4.getBalace());
		
		Customer5.deposit(450);
		System.out.println("Customer 5 has deposite " + Customer5.getBalace() + "rs");
		Customer5.withdraw(300);
		System.out.println("Customer 5 has Withdraw");
		System.out.println("Updated Balance" + Customer5.getBalace());
		
		
		
		
		
	}

}
