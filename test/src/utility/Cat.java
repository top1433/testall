package utility;

import base.Mammal;

public class Cat extends Mammal{
	String property;
	String name;
	
	
	public Cat() {
	}
	public Cat(String property, String name) {
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
		System.out.println("Cat eat");
	}
	public void sleep() {
		System.out.println("Cat sleep");
	}
	public void show() {
		System.out.println(property+" "+name);
	}
	public void milk() {
		System.out.println("Cat milk");
	}
}
