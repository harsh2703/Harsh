package com.c2.training;

public class ThreadRunnableInterface implements Runnable {

	public void run() {
		System.out.print("Thread using Runnable Interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThreadRunnableInterface tri = new ThreadRunnableInterface();
Thread t = new Thread(tri);
t.start();
	}

}
