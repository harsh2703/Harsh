package com.c2.training;

import java.util.*;

public class IterateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer,String> m = new HashMap <Integer,String> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter map size: ");
		int size = sc.nextInt();
		System.out.print("Enter values: ");
		for(int i=1; i<=size; i++)
		{
			String n = sc.next();
			m.put(i, n);
		}
		sc.close();
		System.out.print("Hashmap: "+m);
	}

}
