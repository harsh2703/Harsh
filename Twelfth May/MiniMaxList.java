package com.c2.training;

import java.util.*;

public class MiniMaxList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> ll = new ArrayList <Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Linked List size: ");
		int size = sc.nextInt();
		System.out.print("Enter elements: ");
		for(int i=0; i<size; i++)
		{
			int n = sc.nextInt();
			ll.add(n);
		}
		sc.close();
		Collections.sort(ll);
		int min = ll.get(0);
		int max = ll.get(ll.size()-1);
		System.out.print("ArrayList Is: "+ll);
		System.out.print("\nMaximum Number Is: "+max);
		System.out.print("\nMinimum Number Is: "+min);
	}

}
