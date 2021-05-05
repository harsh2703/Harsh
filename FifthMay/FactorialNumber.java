package com.c2.training;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		sc.close();
		
        long fact = 1;
        for(int i = 1; i <= num; ++i)
        {
            // fact = fact * i;
            fact *= i;
        }
        System.out.printf("Factorial of %d = %d", num, fact);
	}

}
