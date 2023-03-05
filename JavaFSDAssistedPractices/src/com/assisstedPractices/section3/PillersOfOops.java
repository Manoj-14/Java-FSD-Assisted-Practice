package com.assisstedPractices.section3;

public class PillersOfOops {
	public static void main(String[] args) {
		Car car = new Car();
		car.details("Blue", 4);
		car.printDetails();
	}
}

class Branch {

	public String brName;

	public Branch(String brName) {
		this.brName = brName;
	}
}

class Student extends Branch {
	public int sid;
	public String name;

	public Student(int sid, String name, String brName) {
		super(brName);
		this.sid = sid;
		this.name = name;
	}

}

abstract class Vehical {
	private String color;
	private int noOfWheels;

	abstract void details(String color, int noOfColor);

	abstract void printDetails();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
}

class Car extends Vehical {

	@Override
	public void details(String color, int noOfColor) {
		super.setColor(color);
		super.setNoOfWheels(noOfColor);
	}

	@Override
	void printDetails() {
		if (super.getColor() != null) {
			System.out.println("Color : " + super.getColor());
		} else {
			System.out.println("No color added");
		}
		if (super.getNoOfWheels() != 0) {
			System.out.println("No of wheels : " + super.getNoOfWheels());
		} else {
			System.out.println("No wheels details added");
		}
	}

}
