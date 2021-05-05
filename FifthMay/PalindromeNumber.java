package com.c2.training;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		int rev = 0, remainder;
	    
	    int orgNum = num;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      rev = rev * 10 + remainder;
	      num /= 10;
	    }
	    
	    if (orgNum == rev) {
	      System.out.println(orgNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(orgNum + " is not Palindrome.");
	    }
	}

}
