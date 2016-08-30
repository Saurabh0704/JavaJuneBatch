package com.saurabh.demo;

public class Car implements  Vehicle{

	@Override
	public int getNoOfWheels() {
		System.out.println("No Of Wheels in Car is 4");
		return 0;
	}

	@Override
	public int getMaxPetrolConsumption() {
		System.out.println("Max petrol Consumption in Car 10 litres");
		return 0;
	}

	@Override
	public int getMileage() {
		System.out.println("Mileage in Car is 45");
		return 0;
	}

}
