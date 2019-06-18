package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account acc;

		//ENTRADA DE DADOS
		
		System.out.print("Enter account number: ");
		int numAcc = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char answer = sc.next().charAt(0);
		
		if (answer == 'y'){
			System.out.print("Enter a deposit value: ");
			double balance = sc.nextDouble();
			acc = new Account(name, numAcc, balance);
			
		}
		else {
			acc = new Account(name, numAcc);
		}
		
		//MOSTRAR CONTA
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		//INSERIR DEPOSITO
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		acc.deposit(amount);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		//SAQUE
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		acc.withdraw(amount);
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(acc);
		System.out.println();
		
		
		sc.close();
	}

}
