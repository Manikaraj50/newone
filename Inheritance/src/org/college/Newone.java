package org.college;


class Employee{
	String name;
	double salary;
	Employee(String n, double s){
	   name=n;
	salary=s;
	}
	   String getName() { return name;}
	   void setName(String n){ name=n;}
	   Double getSaalry() {return salary;}
	   void setSalary(Double s) {salary=s;}
	    
	  void  raisesalary(double percent){
		   salary=salary*percent/100;
	   }
	
	
	
	
	
	public class Newone{
		public static void main(String[] args) {
			Employee e=new Employee("jona",120000);
			e.raisesalary(10);
			System.out.println(e.getSaalry());
			//System.out.println(e.getName());
			
		}
	}
 
	
	
	



	}
