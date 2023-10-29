package com.oop.demo.abstraction;

class Cat extends Animal implements Jumpable {
	public Cat(String name) {
		super(name);
	}

	// Implementation of the abstract method
	@Override
	public void makeSound() {
		System.out.println(name + " meows.");
	}

	// Implementation of the interface method
	@Override
	public void jump() {
		System.out.println(name + " is jumping.");
	}
}