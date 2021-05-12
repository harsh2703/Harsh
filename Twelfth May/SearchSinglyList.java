package com.c2.training;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchSinglyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <Integer> ll = new LinkedList <Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Linked List size: ");
		int size = sc.nextInt();
		System.out.print("Enter elements: ");
		for(int i=0; i<size; i++)
		{
			int n = sc.nextInt();
			ll.add(n);
		}
		int found=0;
		boolean flag = false;
		System.out.print("Enter Element to search: ");
		int search = sc.nextInt();
		for(int i=0;i<ll.size();i++)
		{
			if(ll.get(i)==search)
			{
				found += ll.indexOf(search);
				flag=true;
			}
			
		}
		
		if(flag==true)
		{
			System.out.print("Search Found At Index: "+found);
		}
		else {
			System.out.print("Search Not Found");
		}
		sc.close();
	}

}
