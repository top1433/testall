package utility;

import base.Reptile;

public class Crocodile extends Reptile{
	String property;
	String name;

	
	
	public Crocodile() {
	}

	public Crocodile(String property, String name) {
		this.property = property;
		this.name = name;
	}
	
	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println("Crocodile eat");
	}
	public void sleep() {
		System.out.println("Crocodile sleep");
	}
	public void show() {
		System.out.println(property+" "+name);
	}
	public void milk() {
		System.out.println("Crocodile milk");
	}

	@Override
	public void crawl() {
		System.out.println("Crocodile crawl");
	}
}
