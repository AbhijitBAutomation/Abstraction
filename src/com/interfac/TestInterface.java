package com.interfac;

public class TestInterface implements Interface2 {
	public void method1(){
		System.out.println("Implemented method1");
		
	}
	
	public void method2(){
		System.out.println("Implemented method2");
		
	}
	public static void main(String[] args) {
		TestInterface t=new TestInterface();
		t.method1();
		t.method2();
	}
	

}
