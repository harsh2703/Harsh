package com.c2.training;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int count;
	      Random rnum = new Random();

	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter last number for range: ");
	      int num = sc.nextInt();
	      System.out.println("Enter number of Random numbers required: ");
	      int req = sc.nextInt();
	      System.out.println("Random Numbers:");
	      System.out.println("***************");
	      sc.close();
	      for (count = 1; count <= req; count++) 
	         System.out.println("Number "+count+" = "+rnum.nextInt(num));
	}
}
