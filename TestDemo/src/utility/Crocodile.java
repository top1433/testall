package utility;

import base.Reptile;

public class Crocodile extends Reptile {

	private String name;
	private int age;
	
	
	
	public Crocodile(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Crocodile(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("cro eat run");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name+","+age);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("cro sleep run");
	}

	@Override
	public void carwl() {
		// TODO Auto-generated method stub
		System.out.println("cro carwl run");
	}

}
