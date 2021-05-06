package com.c2.training;

import java.util.Scanner;

public class ElementFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int l = sc.nextInt();
		int[] arr = new int[l]; 
		System.out.println("Enter array elements: ");
		for(int i=0; i<l; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }           
        
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("Frequency of "+ arr[i] + " : " + fr[i]);  
        }  
    }  
}


