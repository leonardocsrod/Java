package com.loiane.cursojava.aula24;

public class TesteCarro {

	public static void main(String[] args) {
		Car van = new Car();
		van.brand = "Fiat";
		van.model = "Ducato";
		van.passengerNumber = 10;
		van.fuelCapacity = 100;
		van.fuelConsuption = 0.2;
		System.out.println("Brand: " + van.brand);
		System.out.println("Model: " + van.model);
		System.out.println("Number of passengers: " + van.passengerNumber);
		System.out.println("Capacity of fuuel: " + van.fuelCapacity);
		System.out.println("Consuption of fuel: " + van.fuelConsuption);
		
		Car fusca = new Car();
		fusca.brand = "Volkswagen";
		fusca.model = "Fusca";
		fusca.passengerNumber = 4;
		fusca.fuelCapacity = 30;
		fusca.fuelConsuption = 0.15;
		System.out.println("Brand: " + fusca.brand);
		System.out.println("Model: " + fusca.model);
		System.out.println("Number of passengers: " + fusca.passengerNumber);
		System.out.println("Capacity of fuuel: " + fusca.fuelCapacity);
		System.out.println("Consuption of fuel: " + fusca.fuelConsuption);
	}

}
