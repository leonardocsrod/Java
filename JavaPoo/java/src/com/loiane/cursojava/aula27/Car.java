package com.loiane.cursojava.aula27;

public class Car {
	//attributes
			String brand;
			String model;
			int passengerNumber;
			double fuelCapacity;
			double fuelConsuption;
			
		//methods
			void showAutonomy() {
				System.out.println("The autonomy of the vehycle is " + fuelCapacity * fuelConsuption);
			}
			
			double calculateAutonomy() {
				System.out.print("The autonomy was calculated.");
				return fuelCapacity * fuelConsuption;
			}
			
			double calculateFuelQuantity(double km) {
				double fuelQuantity = km / fuelConsuption;
				return fuelQuantity;
			}

}
