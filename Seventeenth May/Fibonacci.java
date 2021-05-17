package com.c2.training;

import java.util.Scanner;

public class Fibonacci {
	static void reverseFibonacci(int n) 
    { 
		int d=0, e=1, f=0;
        int a[] = new int[n];       
        a[0] = 0; 
        a[1] = 1; 
      
        for (int i = 2; i < n; i++) 
        {   
            a[i] = a[i - 2] + a[i - 1]; 
        } 
        System.out.print("reverse fibonacci series: ");
        for (int i = n - 1; i >= 0; i--)  
        { 
            System.out.print(a[i] +" "); 
        } 
        
        System.out.print("\nFibonacci series: ");
        while (n>0)
        {
             System.out.print(f+" ");
             d=e;
             e=f;
             f=d+e;
             n=n-1;
        }
    }       
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	System.out.print("enter number: ");
    	int n=sc.nextInt();
        reverseFibonacci(n); 
        sc.close();
	}

}
