package com.c2.training;

import java.util.Scanner;

public class NaturalSum {
	static int sumOfNumber(int n)
	{
		if(n == 0)
			return 0;
		return n + sumOfNumber(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using loop	
		int num, count, sum = 0;

        
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        
        for(count = 1; count <= num; count++){
            sum = sum + count;
        }

        System.out.println("Sum of first "+num+" natural numbers using loop is: "+sum);
        
        //Without using loop
        System.out.println("Sum of first "+num+" natural numbers without using loop is " + sumOfNumber(num));
        
        
        
	}

}
