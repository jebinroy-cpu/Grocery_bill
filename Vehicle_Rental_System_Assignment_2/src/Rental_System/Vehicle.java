package Rental_System;

public abstract class Vehicle {

	private String vehicleId;
	private String vehicleNumber;
	private String brand;
	private String model;
	private String type;
	private double rentalRate;
	private boolean availability;
	private double total_fare;
	double totalcost;

	Vehicle(String id, String number, String brand, String model, String type, double rate) {

		this.vehicleId = id;
		this.vehicleNumber = number;
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.rentalRate = rate;
		this.availability = true;
	}

	public void setVehicleId(String vid) {
		this.vehicleId = vid;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleNumber(String vn) {
		this.vehicleNumber = vn;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setBrand(String b) {
		this.brand = b;
	}

	public String getBrand() {
		return brand;
	}

	public void setModel(String m) {
		this.model = m;
	}

	public String getModel() {
		return model;
	}

	public void setRentalRate(double r) {
		this.rentalRate = r;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setTotalFare(double totalCost) {
		this.total_fare = totalCost;
	}

	public double getTotalFare() {
		return total_fare;
	}

	public boolean setAvailability(boolean av) {
		return this.availability = av;
	}

	public boolean isAvailability() {
		return availability;
	}

	void rentVehicle() {
		availability = false;
	}

	void returnVehicle() {
		availability = true;
	}

	abstract void displayVehicles();

	abstract void calculateRentalCost(int days);
}
