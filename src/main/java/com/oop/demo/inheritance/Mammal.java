package com.oop.demo.inheritance;

public class Mammal extends Animal {

	public Mammal(String name) {
		super(name);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mammal["+super.toString()+"]";
	}
}
