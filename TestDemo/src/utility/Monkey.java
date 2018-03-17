package utility;

import base.Mammal;

public class Monkey extends Mammal {

	private String name;
	private int age;
	
	public Monkey(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void eat() {

		System.out.println("Monkey eat run");
	}

	@Override
	public void show() {
		System.out.println(name+","+age);
	}

	@Override
	public void sleep() {
		System.out.println("Monkey sleep run");
	}

	@Override
	public void milk() {
		System.out.println("Monkey drink milk run");
	}

}
