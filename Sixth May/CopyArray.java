package com.c2.training;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int l = sc.nextInt();
		int[] a = new int[l]; 
		System.out.println("Enter array elements: ");
		for(int i=0; i<l; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		int b[]=new int[a.length];
		
		//copying one array to another
		for(int i=0;i<a.length;++i){
			b[i]=a[i];
		}
		
		//printing array
		System.out.println("Array 1: ");
		for(int i=0;i<a.length;++i){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nArray 2: ");
		for(int i=0;i<b.length;++i){
			System.out.print(b[i]+" ");
		}
	}

}
