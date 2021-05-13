package com.c2.training;

public class StoreAndFetchGeneric<T> {
	private T t;

	   public void store(T t) {
	      this.t = t;
	   }

	   public T fatch() {
	      return t;
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreAndFetchGeneric<Integer> ifs = new StoreAndFetchGeneric<Integer>();
		StoreAndFetchGeneric<String> sfs = new StoreAndFetchGeneric<String>();
	    
	    ifs.store(new Integer(10));
	    sfs.store(new String("Hello World"));

	    System.out.println("Integer Value "+ifs.fatch());
	    System.out.println("String Value ," +sfs.fatch());
	}

}
