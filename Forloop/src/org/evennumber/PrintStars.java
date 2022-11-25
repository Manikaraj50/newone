package org.evennumber;

public class PrintStars {
	public static void main(String[] args) {
//		for(int row=1;row<=3;row++)
//		{
//			for(int cole=1;cole<row;cole++) {
//				System.out.print(" ");
//			}
//			for(int col=3;col>=row;col--)
//			{
//				System.out.print(row);
//			}
//			System.out.println("");
//		}

	for(int row=1;row<=5;row++) {
		for(int cole=5;cole>row;cole--)
		{
			System.out.print(" ");
		}
		for(int colp=1;colp<=row;colp++) {
			System.out.print(colp);
		}
		for(int space=2;space<=row;space++) {
			System.out.print(space);

		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	}
	

}
