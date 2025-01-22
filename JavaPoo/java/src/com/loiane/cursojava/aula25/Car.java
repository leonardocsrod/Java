package com.loiane.cursojava.aula25;

public class Car {
	//attributes
	String brand;
	String model;
	int passengerNumber;
	double fuelCapacity;
	double fuelConsuption;
	
	//methods
	void showAutonomy() {
		System.out.println("The autonomy of the vehicle is " + fuelCapacity * fuelConsuption + "KM.");
	}
}
