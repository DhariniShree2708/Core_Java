package com.hcl.training.inheritance;

class Person {
	private String name;

	Person(String s) {
		setName(s);
	}

	public void setName(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void display() {
		System.out.println("Name of Person: " + name);
	}
}

class Staff extends Person {
	private int staffId;

	Staff(String name, int staffId) {
		super(name);
		setStaffId(staffId);
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public void display() {
		super.display();
		System.out.println("Staff Id is: " + staffId);
	}
}

class TemporaryStaff extends Staff {
	private int days;
	private int hoursWorked;

	TemporaryStaff(String sname, int id, int days, int hoursWorked) {
		super(sname, id);
		this.days = days;
		this.hoursWorked = hoursWorked;
	}

	public int Salary() {
		int salary = days * hoursWorked * 60;

		return salary;
	}

	public void display() {
		super.display();
		System.out.println("No. of Days: " + days);
		System.out.println("No. of Hours Worked: " + hoursWorked);
		System.out.println("Total Salary: " + Salary());
	}
}

public class MultilevelInheritance {
	public static void main(String args[]) {
		TemporaryStaff ts = new TemporaryStaff("Dharini", 22, 10, 8);
		ts.display();
	}
}