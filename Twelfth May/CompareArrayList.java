package com.c2.training;
import java.util.*;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		ArrayList <Integer> a2 = new ArrayList <Integer> ();
		System.out.print("Enter The Size Of 1st Array: ");
		int n1 = sc.nextInt();
		System.out.print("Enter The Elements Of 1st Array: ");
		for(int i=0;i<n1;i++)
		{
			a1.add(sc.nextInt());
		}
		System.out.print("Enter The Size Of 2nd Array: ");
		int n2 = sc.nextInt();
		System.out.print("Enter The Elements Of 2nd Array: ");
		for(int i=0;i<n2;i++)
		{
			a2.add(sc.nextInt());
		}
		if(a1.equals(a2))
		{
			System.out.println("Both Are Equal with Size: "+a1.size());
		}
		else {
			System.out.println("Both Are Not Equal An Size For 1st Array is: "+a1.size()+" And"
					+ "Size Of 2nd Array is: "+a2.size());
		}
		sc.close();
	}

}
