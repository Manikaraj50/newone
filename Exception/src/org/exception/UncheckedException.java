package org.exception;
import java.util.*;

public class UncheckedException {
	//Artithamatic exception
	private void m1() {
		System.out.println(4);
		System.out.println(4/0);
		System.out.println(3);

	}
	//null point Exception
	private void m2() {
		Set<Integer>l=new TreeSet();
		l.add(10);
		l.add(null);

	}
	
	private void m3() {
		String s=null;
	   System.out.println(s.charAt(0));

	}
	//InputMismatch
	private void m4() {
      Scanner s=new Scanner(System.in);
      s.nextInt();
	
		
	}
	//IndexOutBoundsExcpetion
	private void m5() {
	List l=new ArrayList();
	System.out.println(l.get(6));

	}
	//ArrayIndexOutBound
	private void m6() {
		int[] a=new int[6];
		a[0]=1;
		System.out.println(a[8]);

	}
	//StringIndexOutBoundException
	private void m7() {
		String s="java";
		System.out.println(s.charAt(10));

	}
	//Number Format Exception
	private void m8() {
		try { //if error -catch ,no error-try block
        String s="123ab";
        int parseInt = Integer.parseInt(s);
        System.out.println(parseInt+5);
        int a=123;;
        System.out.println(a+5);
		}catch(Exception c) {
			System.out.println("Exception handled by super class");
		}finally {
			System.out.println("it will excute everytime");
		}
	}private void m9() {
		String s="java";
		System.out.println(s.charAt(1));

	}
	
	public static void main(String[] args) {
		UncheckedException u=new UncheckedException();
		//u.m1();
		//u.m2();
		//u.m3();
		//u.m4();
		//u.m5();
		//u.m6();
	//u.m7();
		
		u.m8();
		u.m9();
	}

}
