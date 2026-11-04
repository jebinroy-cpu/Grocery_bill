package Rental_System;

public class Rental {

	private String rentalId;
	private Customer customer;
	private Vehicle vehicle;
	private int numberOfDays;
	private double totalCost;

	// Constructor
	public Rental(String rentalId, Customer customer, Vehicle vehicle, int numberOfDays, double totalCost) {

		this.rentalId = rentalId;
		this.customer = customer;
		this.vehicle = vehicle;
		this.numberOfDays = numberOfDays;
		this.totalCost = totalCost;
	}

	// Setter and Getter for rentalId
	public void setRentalId(String rentalId) {
		this.rentalId = rentalId;
	}

	public String getRentalId() {
		return rentalId;
	}

	// Setter and Getter for customer
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	// Setter and Getter for vehicle
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	// Setter and Getter for numberOfDays
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	// Setter and Getter for totalCost
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public double getTotalCost() {
		return totalCost;
	}
}
