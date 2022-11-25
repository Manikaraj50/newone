package greaterthantwonumber;

import java.util.Scanner;

public class TwoNumber {
public static void main(String[] args) {
	//Declare the two number
	Scanner s=new Scanner(System.in);
	System.out.println("enter the fist number");
	int number1=s.nextInt();
	Scanner a=new Scanner(System.in);
	System.out.println("enter the second number");
	int number2=a.nextInt();
	if(number1<number2)	{
		System.out.println(number1 +"   greater than  "+number2);
	}else if(number1<number2) {
		System.out.println(number1 +" less than   "+ number2);
	}
	else {
		System.out.println(number1+"   equalto   " + number2);
	}
}
}
