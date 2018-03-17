package utility;

import base.Reptile;

public class Snake extends Reptile {

	private String name;
	private int age;
	
	
	
	public Snake(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Snake(String name) {
		super();
		this.name = name;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("snake eat run");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(name+","+age);
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("snake sleep run");
	}

	@Override
	public void carwl() {
		// TODO Auto-generated method stub
		System.out.println("snake carwl run");
	}

}
