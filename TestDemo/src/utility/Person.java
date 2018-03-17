package utility;

import base.Mammal;

public class Person extends Mammal {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public void eat() {
		System.out.println("person eat run");
	}

	@Override
	public void show() {
		System.out.println(name+","+age);
	}

	@Override
	public void sleep() {
		System.out.println("person sleep run");
	}

	@Override
	public void milk() {
		System.out.println("person drink milk run");
	}

	
}
