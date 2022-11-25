package org.test;

interface hotel {
	 void biriyani();
	 
 }

public class Interface implements hotel {
	@Override
	public void biriyani() {
		System.out.println("the rate is 120");
		
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		i.biriyani();
		
	}

}
