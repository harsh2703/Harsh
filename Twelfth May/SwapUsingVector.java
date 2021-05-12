package com.c2.training;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class SwapUsingVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v1 = new Vector<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter First Number: ");
		int n1 = sc.nextInt();
		System.out.print("Please Enter Second Number: ");
		int n2 = sc.nextInt();
		sc.close();
		v1.add(n1);
		v1.add(n2);
		v1.setElementAt(n2, 0);
		v1.setElementAt(n1, 1);
		Iterator<Integer> it = v1.iterator();
		System.out.println("After Swapping: ");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
