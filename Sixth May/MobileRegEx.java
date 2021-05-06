package com.c2.training;

import java.util.Scanner;

public class MobileRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Phone number: ");
	      String phone = sc.next();
	      
	      String regex = "\\d{10}";
	    
	      boolean result = phone.matches(regex);
	      if(result) {
	         System.out.println("Given phone number is valid");
	      } else {
	         System.out.println("Given phone number is not valid");
	      }
	}

}
