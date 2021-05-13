package com.c2.training;

import java.util.Arrays;

public class ArrayExchange {
	public static <T> void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a={"1","2","3"};
		System.out.println("before: "+Arrays.toString(a));
		swap(a,0,2);
		System.out.println("after: "+Arrays.toString(a));
	}

}
