package com.hcl.training.inheritance;

class Subject {
	public void disp() {
		System.out.println("Subject");
	}
}

class Science extends Subject {
	public void disp() {
		super.disp();
		System.out.println("Science is a Subject");
	}
}

class Maths extends Subject {
	public void disp() {
		super.disp();
		System.out.println("Maths is a Subject");
	}

}

class Physics extends Science {
	public void disp() {
		super.disp();
		System.out.println("Physics belongs to Science");
	}
}

public class HybridInheritance {

	public static void main(String args[]) {
        Maths o = new Maths();
        Science s = new Science();
		Physics obj = new Physics();
		o.disp();
		s.disp();
		obj.disp();
	}
}