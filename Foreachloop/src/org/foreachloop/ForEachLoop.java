package org.foreachloop;

public class ForEachLoop {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5,6};
		int sum=0;
		String [] name= {"jona","sin"};
		// normal looping statements
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("   ");
		//for each loop condition
		//this condition first declaration of array int so is using loop inside int datatypes
		for(int x : numbers) {
			System.out.println(x);
			sum+=x;
			System.out.println(sum);
		}
		System.out.println( " ");
		for(String j : name) {
			System.out.println(j);
		}
		
	}

}
