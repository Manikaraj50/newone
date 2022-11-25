package org.test;

public class Exception {
	
	public void m1() 
	{
		System.out.println(4/2);
		System.out.println(4/0);
		System.out.println("java");
	}

	public void m2() {
		System.out.println("automation");
	}
	public static void main(String[] args) {
		Exception e=new Exception();
		e.m1();
		e.m2();
	}

}
