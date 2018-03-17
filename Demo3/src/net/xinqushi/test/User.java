package net.xinqushi.test;

public class User implements IUser {

	public void before() {
		System.out.println("before...............");
	}
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add is running.............");
	}
	
	
	public void end() {
		System.out.println("end...............");
	}

}
