package com.c2.training;

public class PriorityThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityThread m1=new PriorityThread();  
		PriorityThread m2=new PriorityThread();
		PriorityThread m3=new PriorityThread();
		  m1.setPriority(Thread.MAX_PRIORITY);  
		  m2.setPriority(Thread.MIN_PRIORITY);  
		  m3.setPriority(Thread.NORM_PRIORITY);
		  m1.start();  
		  m2.start(); 
		  m3.start();
	}
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName());  
		   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
		  
		  }
}
