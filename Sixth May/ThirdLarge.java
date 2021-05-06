package com.c2.training;

import java.util.Scanner;

public class ThirdLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Third largest number is " + a[a.length-3]);
	}

}
