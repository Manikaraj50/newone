package org.evennumber;



public class Xpatterns {
	public static void main(String[] args) {
		int number =31;
		for(int i=1,c=0;i<=number;i++,c++)
		{
			for(int j=0;j<=number;j++)                  // i      ==      j
														// 1     == 7-(7-1-0)
														// 2==6-(7-2-1)
			                                         	// 3==5-(7-3-2)
				{if(i==j || i==j-(number-i-c)) {
				System.out.print(i);}
				else {
					System.out.print(" ");}
			}
			System.out.println("");
		}
	}

}
