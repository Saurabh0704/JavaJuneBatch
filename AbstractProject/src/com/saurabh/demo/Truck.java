package com.saurabh.demo;

public class Truck implements Vehicle{

	@Override
	public int getNoOfWheels() {
		System.out.println("No of wheels in truck is 8");
		return 0;
	}

	@Override
	public int getMaxPetrolConsumption() {
		System.out.println("Max Petrol COnsumption of Truck is is 30 litres");
		return 0;
	}

	@Override
	public int getMileage() {
		System.out.println("Max Mileage is 30");
		return 0;
	}

}
