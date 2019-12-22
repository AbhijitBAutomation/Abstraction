package com.interfac.runtime;

public class XYZ implements MyInterface {
	@Override
	public void method1() {
		System.out.println("Implemented method 1");
		
	}
	@Override
	public void method2() {
		System.out.println("Implemented method 2");
		
				
	}
	public static void main(String[] args) {
		MyInterface obj=new XYZ();
		obj.method1();
		obj.method2();
	}

}
