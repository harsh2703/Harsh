package com.c2.training;

public class AllRunningThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllRunningThread t1 = new AllRunningThread();
	      t1.setName("thread1");
	      t1.start();
	      ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
	      int noThreads = currentGroup.activeCount();
	      Thread[] lstThreads = new Thread[noThreads];
	      currentGroup.enumerate(lstThreads);
	      for (int i = 0; i < noThreads; i++)
	      {
	    	  System.out.println("Thread No:" + i + " & The Name of Thread is: " + lstThreads[i].getName());
	      }
	}

}
