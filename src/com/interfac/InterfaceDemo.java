package com.interfac;

public class InterfaceDemo implements InterfaceA,InterfaceB {
	
		 public void myMethod(){
			 System.out.println("Multiple Inheritance Example using Interfaces");
		 }
		 public static void main(String[] args) {
			InterfaceDemo id=new InterfaceDemo();
			id.myMethod();
		}
		
	

}
