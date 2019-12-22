package com.interfac.boolea;

public class Tyre implements Moveable,Rollable {
	int width;
	@Override
	public boolean isMoveable() {
		
		return true;
	}
	@Override
	public boolean isRollable() {
		
		return true;
	}
	public static void main(String[] args) {
		Tyre t=new Tyre();
		System.out.println(t.isMoveable());
		System.out.println(t.isRollable());
		
	}

}
