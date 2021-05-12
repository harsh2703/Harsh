package com.c2.training;

import java.util.*;

public class ListToVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a1 = new ArrayList <Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter list size: ");
		int size = sc.nextInt();
		System.out.print("Enter numbers: ");
		for(int i=0; i<size; i++)
		{
			int n = sc.nextInt();
			a1.add(n);
		}
		sc.close();
		Vector<Integer> vector = new Vector<Integer>(a1);
		System.out.println(" Coverted Vector From List: " + vector);
	}

}
