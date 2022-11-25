	package org.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException{
	private void m1() throws FileNotFoundException, InterruptedException  {
	File f=new File("E:\\Abstraction");
	FileInputStream s=new FileInputStream(f);
	Thread.sleep(2000);
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		CheckedException c=new CheckedException();
		//c.m1();
	}
		
				
			
	
	
		
		
	}



		
	
	


