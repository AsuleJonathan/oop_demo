package com.oop.demo.inheritance;

public class Cat extends Mammal {

	public Cat(String name) {
		super(name);
	}

	public void greets() {
		System.out.println("Meow");
	}
	
	@Override
	public String toString() {
		return "Cat["+super.toString()+"]";
	}
}