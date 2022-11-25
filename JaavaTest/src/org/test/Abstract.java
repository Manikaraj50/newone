package org.test;

abstract class hotels{
	abstract void noodles();

	abstract void biriyani();
}


public class Abstract extends hotels{

	
	@Override
	void noodles() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void biriyani() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Abstract a=new Abstract();
		a.biriyani();
		a.noodles();
	}

	
	

}
