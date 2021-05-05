package com.c2.training;

import java.util.Scanner;

public class SunnyNumber {

	/*public static boolean isSunny(int num) {
	      if(Math.sqrt(num+1)%1 == 0)
	         return true;
	      else return false;
	   }
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      int num = 0;
	      //boolean result = false;

	      Scanner sc = new Scanner(System.in);

	      System.out.print("Enter an integer num: ");
	      num = sc.nextInt();

	      /*result = isSunny(num);

	      if(result)
	          System.out.println(num +
	                  " is a Sunny num.");
	      else
	          System.out.println(num +
	                 " is not a Sunny num.");
*/
	      
	      //Method code is commented
	      
	      //Without using method
	      if(Math.sqrt(num+1)%1 == 0) {
	    	  System.out.println(num + "is a Sunny Number.");
	      }
	      sc.close();
	}

}
