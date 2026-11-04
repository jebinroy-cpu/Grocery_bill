package Rental_System;

public class Bike extends Vehicle {

	private int engineCapacity;
	private String helmetAvailable;

	Bike(String id, String number, String brand, String model, String type, double rate, int ec, String ha) {
		super(id, number, brand, model, type, rate);
		this.engineCapacity = ec;
		this.helmetAvailable = ha;
	}

	public void setengineCapacity(int ec) {
		this.engineCapacity = ec;
	}

	public int getengineCapacity() {
		return engineCapacity;
	}

	public void sethelmetAvailable(String ha) {
		this.helmetAvailable = ha;
	}

	public String gethelmetAvailable() {
		return helmetAvailable;
	}

	@Override
	void displayVehicles() {
		System.out.println("vehicle type :" + getType());
		System.out.println("vehicle id : " + getVehicleId());
		System.out.println("vehicle brand :" + getBrand());
		System.out.println("vehicle model : " + getModel());
		System.out.println("vehicle Rate :" + getRentalRate());
		System.out.println("availabilty : " + isAvailability());
		System.out.println("engiine capacity " + getengineCapacity());
		System.out.println("Helmet avalable or not : " + gethelmetAvailable());
		System.out.println("\n");

	}

	@Override
	void calculateRentalCost(int days) {
		totalcost = getRentalRate() * days;
		setTotalFare(totalcost);
	}

}
