package utility;

import base.Mammal;

public class Cat extends Mammal {

	private String name;
	private int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public void eat() {
		System.out.println("Cat eat run");
	}

	@Override
	public void show() {
		System.out.println(name+","+age);
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep run");
	}

	@Override
	public void milk() {
		System.out.println("Cat drink milk run");
	}

}
