package com.saurabh.demo;

public class Cycle implements  Vehicle{

	@Override
	public int getNoOfWheels() {
		System.out.println("No of wheels in truck is 2");
		return 0;
	}

	@Override
	public int getMaxPetrolConsumption() {
		System.out.println("Max Petrol COnsumption of cycle is is 0 litres");
		return 0;
	}

	@Override
	public int getMileage() {
		System.out.println("Max Mileage is 50");
		return 0;
	}

}
