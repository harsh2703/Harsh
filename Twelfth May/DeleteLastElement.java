package com.c2.training;

import java.util.LinkedList;
import java.util.Scanner;

public class DeleteLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Linked List size: ");
		int size = sc.nextInt();
		System.out.print("Enter elements: ");
		for(int i=0; i<size; i++)
		{
			String n = sc.next();
			ll.add(n);
		}
		System.out.println("Linked List Elements Are: "+ll);
		ll.removeLast();
		sc.close();
		System.out.println("Linked List Elements Are: "+ll);
	}

}
