package com.c2.training;

import java.util.Scanner;

public class Stack {

	private int arr[];
	private int top;
	private int capacity;
	
	Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}
	
	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack OverFlow");
	
			System.exit(1);
		}
	
		System.out.println("\nInserting " + x);
		arr[++top] = x;
	}
	
	public int pop() {
	
		if (isEmpty()) {
			System.out.println("STACK EMPTY");
			System.exit(1);
		}
	
		return arr[top--];
	}
	
	public int getSize() {
		return top + 1;
	}
	
	public Boolean isEmpty() {
		return top == -1;
	}
	
	public Boolean isFull() {
		return top == capacity - 1;
	}
	
	public void printStack() {
		for (int i = 0; i <= top; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int size = sc.nextInt();
		Stack stack = new Stack(size);
		
		System.out.print("Enter Array Element to push: ");
		for(int i=0;i<=size ; i++)
		{
			int n = sc.nextInt();
			stack.push(n);
			System.out.print("Stack: ");
			stack.printStack();
		}
		
		for(int i=size; i>=0; i--)
		{
			stack.pop();
			System.out.print("\nAfter popping out\n");
			stack.printStack();
		}
		sc.close();
	}
	
}