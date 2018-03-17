package utility;

import base.Mammal;

public class Dog extends Mammal {

	private String name;
	private int age;
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eat run");
	}

	@Override
	public void show() {
		System.out.println(name+","+age);
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep run");
	}

	@Override
	public void milk() {
		System.out.println("Dog drink milk run");
	}

}
