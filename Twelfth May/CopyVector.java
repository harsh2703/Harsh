package com.c2.training;

import java.util.Scanner;
import java.util.Vector;

public class CopyVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> main = new Vector <String> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter vector size: ");
		int size = sc.nextInt();
		System.out.print("Enter numbers: ");
		for(int i=1; i<=size; i++)
		{
			String n = sc.next();
			main.add(n);
		}
		sc.close();
		Object copied = main.clone();
		System.out.print("Main Vector: "+main);
		System.out.print("\nCopied Vector: "+copied);
	}

}
