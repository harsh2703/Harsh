package com.c2.training;

import java.util.Scanner;

public class SquareRoot {

	public static double square(int num) {  
		double t;  
		double sqrt=num/2;  
		do   
		{  
			t=sqrt;  
			sqrt=(t+(num/t))/2;  
		}while((t-sqrt)!= 0);  
		
		return sqrt;  
	}  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		System.out.println("The square root of "+ n+ " is: "+ square(n));
		sc.close();
	}

}
