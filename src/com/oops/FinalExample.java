package com.oops;

import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	
	public void m1() throws  IOException{
		
		System.out.println("in child class m1");
	}
	
}

public class FinalExample extends A {

	public void m1() throws  FileNotFoundException {
		System.out.println("in prent class  of m1");
	}
	
	
	public final int i;

	/*
	 * public FinalExample (int i){ this.i=i; }
	 */

	{
		i = 20;
	}

	public static void main(String[] args) {

	}
}
