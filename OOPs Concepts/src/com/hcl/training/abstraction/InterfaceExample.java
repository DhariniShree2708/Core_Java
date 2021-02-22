package com.hcl.training.abstraction;

interface Animal {
	public void animalSound();
}

class Dog implements Animal {
	public void animalSound() {

		System.out.println("The Dog says: bow bow");
	}

}

class InterfaceExample {
	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.animalSound();

	}
}
