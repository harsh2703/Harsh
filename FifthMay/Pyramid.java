package com.c2.training;

import java.util.Scanner;

public class Pyramid 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter required number of rows: ");
		int rows = sc.nextInt(); 
		sc.close();
		int k = 0;

	    for (int i = 1; i <= rows; ++i, k = 0) 
	    {
	      for (int space = 1; space <= rows - i; ++space) 
	      {
	        System.out.print("  ");
	      }

	      while (k != 2 * i - 1) 
	      {
	        System.out.print("* ");
	        ++k;
	      }

	      System.out.println();
	    }
	}
}
