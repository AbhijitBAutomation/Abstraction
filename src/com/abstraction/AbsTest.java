package com.abstraction;

public class AbsTest extends AbstractClass_Demo {
	
	public void disp2(){
		System.out.println("I am overridinng Abstract method");
	}
public static void main(String[] args) {
	AbsTest t=new AbsTest();
	t.disp2();
	t.disp1();
	
}
}
