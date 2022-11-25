package org.test;

public class Name {
public static void main(String[] args) {
	int age=18;
	String name="citizen";
	if(name=="citizen") {
		if(age>17) {
			System.out.println(" the vote is eligiable");
		}else {
			System.out.println("the vote is not eligiable");
		}
	}else {
		System.out.println("this not citizenship");
	}
}
}