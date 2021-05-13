package com.c2.training;

import java.util.Scanner;

public class GenericArray {
	public static < E > void printArray( E[] inputArray ) {
	      for(E element : inputArray) {
	         System.out.printf("%s ", element);
	      }
	      System.out.println();
	   }
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Integer Array: ");
		int ia = sc.nextInt();
		System.out.print("Enter Integer Array elements: ");
		Integer[] intArray = new Integer[ia];
		for(int i=0; i<ia; i++) {
			intArray[i] = sc.nextInt();
		}
		
		System.out.print("Enter size of Double Array: ");
		int da = sc.nextInt();
		System.out.print("Enter Double Array elements: ");
		Double[] doubleArray = new Double[da];
		for(int i=0; i<da; i++) {
			doubleArray[i] = sc.nextDouble();
		}
		
		System.out.print("Enter size of Character Array: ");
		int ca = sc.nextInt();
		System.out.print("Enter Character Array elements: ");
		Character[] charArray = new Character[ca];
		for(int i=0; i<ca; i++) {
			String temp;
			temp =sc.next();
			if(temp.length()==1) {
				charArray[i]=temp.charAt(0); 
				}
			else {
				
				System.out.println("Please enter only a character...!");
				
				break;
			}
		}	
		sc.close();
		
	    System.out.println("Array integerArray contains:");
	    printArray(intArray);   // pass an Integer array

	    System.out.println("\nArray doubleArray contains:");
	    printArray(doubleArray);   // pass a Double array

	    System.out.println("\nArray characterArray contains:");
	    printArray(charArray);
	}

}
