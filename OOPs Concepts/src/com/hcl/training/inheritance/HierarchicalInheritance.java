package com.hcl.training.inheritance;

class ElectronicGadgets {
	public void display() {
		System.out.println("Electronic Gadgets class!");
	}
}

class Mobile extends ElectronicGadgets {
	public void show() {
		System.out.println("Mobile class!");
	}
}

class Laptop extends ElectronicGadgets {
	public void view() {
		System.out.println("Laptop class!");
	}
}

class Tablet extends ElectronicGadgets {
	public void read() {
		System.out.println("Tablet class!");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {
		Mobile m = new Mobile();
		m.show();
		m.display();

		Laptop l = new Laptop();
		l.view();

		l.display();

		Tablet t = new Tablet();

		t.read();

		t.display();

	}
}