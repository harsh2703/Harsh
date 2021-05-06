package com.c2.training;

import java.util.Scanner;

public class TempleDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of temples visited: ");
		int temple = sc.nextInt();
		System.out.print("Enter Donation amount: ");
		int don = sc.nextInt();
		sc.close();
		
		double rem = Math.pow(2, temple);
		amount = (((rem-1)*don)/rem);
		System.out.println("The Intial Amount Is: "+amount);
	}
}