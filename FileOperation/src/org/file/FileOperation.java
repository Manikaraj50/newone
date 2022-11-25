package org.file;

import java.io.File;
import java.io.IOException;

public class FileOperation {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\Aparna Vincent\\Downloads");
		boolean createNewFile = f.createNewFile();
		System.out.println(createNewFile);
		boolean canRead = f.canRead();
		System.out.println(canRead);
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		boolean exists = f.exists();
		System.out.println(exists);
		
		//to print the console in file
		String[] list = f.list();
		for(String x:list) {
			System.out.println(x);
		}
		File[] listFiles = f.listFiles();
		for (File file : listFiles) {
			System.out.println(file);
			
		}
	}

}
