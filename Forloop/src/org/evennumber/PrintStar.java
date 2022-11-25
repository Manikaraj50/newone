package org.evennumber;

public class PrintStar {
	public static void main(String[] args) {
	int n=5;
	for (int i=1;i<n;i++) {
		for (int j=1;j<n;j++) {
			System.out.print("1");
		}
		System.out.println("");
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<i;j++) {
			System.out.print("2");
		}
		System.out.println("");
	}
	System.out.println("   ");
	for(int i=0;i<n;i++) {
		for(int j=i;j<n;j++) {
			System.out.print("3");
		}
		System.out.println("");
	}
	System.out.println("");
	for (int i=1;i<n;i++) {
		for(int j=i;j<n+i;j++) {
	
			System.out.print(j);
		}
		System.out.println("");
	}
	System.out.println("");
	for(int i=1;i<5;i++) {
		for (int j=i+5;j<n+i;j++) {
			System.out.print(j);
		}
		System.out.println("");
	}
	}

	
}
