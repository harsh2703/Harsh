package com.c2.training;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of integer values: ");
		int n = sc.nextInt();
		sc.close();
		for(int i=1; i<=n; i++) {
			int a = sc.nextInt();
			String str = Integer.toString(a);
			s1 = s1 + str;
		}
		System.out.print(s1);
	}
}
