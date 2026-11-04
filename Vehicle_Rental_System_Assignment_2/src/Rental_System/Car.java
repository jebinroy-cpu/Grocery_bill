package Rental_System;

public class Car extends Vehicle {
	private int numberOfSeats;
	private String fuelType;

	Car(String id, String number, String brand, String model, String type, double rate, int nos, String ft) {
		super(id, number, brand, model, type, rate);
		this.numberOfSeats = nos;
		this.fuelType = ft;
	}

	public void setFuelType(String ft) {
		this.fuelType = ft;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setNumberOfSeats(int nos) {
		this.numberOfSeats = nos;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public void displayVehicles() {
		System.out.println("vehicle type :" + getType());
		System.out.println("vehicle id : " + getVehicleId());
		System.out.println("vehicle brand :" + getBrand());
		System.out.println("vehicle model : " + getModel());
		System.out.println("vehicle Rate :" + getRentalRate());
		System.out.println("availabilty : " + isAvailability());
		System.out.println("fuel type " + getFuelType());
		System.out.println("number of seats : " + getNumberOfSeats());
		System.out.println("\n");
	}

	@Override
	void calculateRentalCost(int days) {
		totalcost = getRentalRate() * days;
		setTotalFare(totalcost);
	}

}
