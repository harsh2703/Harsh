package com.c2.training;

import java.util.Scanner;

public class TempleDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float amount = 0, amt=2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of temples visited: ");
		int temple = sc.nextInt();
		System.out.print("Enter Donation amount: ");
		int don = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=temple; i++) {
			amount = (amount*2) + don;
			amt *= 2;
		}
		float final_initial_amount = amount/(amt/2);
		System.out.println("The Intial Amount Is: "+final_initial_amount);
	}
}