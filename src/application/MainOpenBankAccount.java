package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class MainOpenBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount account;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		//POR QUE TEM ESSA LINHA NEXTLINE????????
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit?(y/n) ");
		char depositExistence = sc.next().charAt(0);
		
		
		if (depositExistence == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			account = new BankAccount(accountNumber,name,deposit);
		}else {
			account = new BankAccount(accountNumber,name);
		}
		
		System.out.println();
		System.out.print("Account data: ");
		System.out.print(account.toString());
		System.out.println();
		System.out.print("Enter a deposit value: ");
		account.deposit(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.print( account.toString());
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		System.out.print("Updated account data: ");
		System.out.print( account.toString());
		

		sc.close();
	}

}
