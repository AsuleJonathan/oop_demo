package com.oop.demo.inheritance;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}

	public void greet() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Wooof");
	}
	
	@Override
	public String toString() {
		return "Dog["+super.toString()+"]";
	}
}
