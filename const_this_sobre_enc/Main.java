import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//created a blank user just to compile correctly
		BankAccount user = new BankAccount();

		System.out.print("Enter account number: ");
		int acct_num = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		
		//checking for an initial deposit
		char answer_for_deposit = sc.next().charAt(0);
		if(answer_for_deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initial_deposit = sc.nextDouble();
			user = new BankAccount(acct_num, name, initial_deposit);
		} else {
			user = new BankAccount(acct_num, name);
		}
		
		System.out.print("\nAccount data:\n" + user + "\n\n");
		
		System.out.print("Enter a deposit value: ");
		user.deposit(sc.nextDouble());
		System.out.print("Updated account data:\n" + user + "\n\n");
		
		System.out.print("Enter a withdraw value: ");
		user.withdraw(sc.nextDouble());
		System.out.print("Updated account data:\n" + user);
	
		sc.close();

	}
}
