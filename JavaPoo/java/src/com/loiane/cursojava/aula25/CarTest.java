package com.loiane.cursojava.aula25;


public class CarTest {

	public static void main(String[] args) {
		Car van = new Car();
		van.brand = "Fiat";
		van.model = "Ducato";
		van.passengerNumber = 10;
		van.fuelCapacity = 100;
		van.fuelConsuption = 0.2;
		
		van.showAutonomy();

	}

}
