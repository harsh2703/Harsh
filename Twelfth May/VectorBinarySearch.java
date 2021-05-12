package com.c2.training;
import java.util.*;

public class VectorBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> v = new Vector <Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter vector size: ");
		int size = sc.nextInt();
		System.out.print("Enter numbers: ");
		for(int i=0; i<size; i++)
		{
			int n = sc.nextInt();
			v.add(n);
		}
		Collections.sort(v);
		System.out.print("Enter number to search: ");
		int s = sc.nextInt();
		int index = Collections.binarySearch(v, s);
		sc.close();
		System.out.println("Element is found at index : "+index);
	}

}
