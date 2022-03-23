package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;
import entities.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		double payment = 0;
		
		System.out.println("What country?    1 - Brazil 2 - USA" );
		int country = sc.nextInt();
		
		if (country == 1) {
			InterestService is = new BrazilInterestService(2.0);
			payment = is.payment (amount, months);
		}	
		else {
			InterestService is = new UsaInterestService(1.0);
			payment = is.payment (amount, months);
		}
			
		System.out.println("Payment After " + months + " months: ");
		System.out.print(String.format("%.2f", + payment));
		
		sc.close();
	}
	}

	

