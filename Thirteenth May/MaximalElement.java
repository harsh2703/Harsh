package com.c2.training;

import java.util.*;

public class MaximalElement {
	public static <T extends Comparable<T>> T maximalelement (List<T> list, int from, int to) {
        T max = list.get(from);
        for (int i = from + 1; i < to; i++) {
            T el = list.get(i);
            if (el.compareTo(max) > 0) {
                max = el;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new ArrayList <Integer> ();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter List size: ");
		int size = sc.nextInt();
		System.out.print("Enter list elements: ");
		for(int i=0; i<size; i++)
		{
			int n = sc.nextInt();			
			al.add(n);
		}
		sc.close();
		System.out.print("Maximal Element :"+maximalelement(al,0,size));
	}

}
