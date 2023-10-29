package com.oop.demo.abstraction;

abstract class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	// Abstract method (no implementation)
	public abstract void makeSound();

	// Concrete method
	public void sleep() {
		System.out.println(name + " is sleeping.");
	}
}