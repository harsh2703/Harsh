package com.c2.training;

import java.util.Scanner;

public class PossibleBSTree {
	public static class Node {
		int data;
		Node left, right;
		
		Node(int data){
			this.data = data;
			left = right = null;
		}
	}
	
	public Node root;
	
	public PossibleBSTree() {
		root = null;
	}
	
	public int factorial(int num) {
		int fact = 1;  
        if(num == 0)  
            return 1; 
        else { 
        	while(num > 1) { 
        		fact = fact * num;  
                num--; 
        	}
        	return fact;
        }
	}
	
	public int numOfBST(int key) {  
		int cn = factorial(2 * key)/(factorial(key + 1) * factorial(key));  
        return cn;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PossibleBSTree bst = new PossibleBSTree();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key: ");
		int k = sc.nextInt();
		sc.close();
		System.out.println("Total number of possible Binary Search Trees with given key: " + bst.numOfBST(k));
	}

}
