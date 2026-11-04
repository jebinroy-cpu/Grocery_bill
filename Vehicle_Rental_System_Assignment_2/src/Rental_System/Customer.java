package Rental_System;

public class Customer {

	private String customerId;
	private String customerName;
	private String phoneNumber;

	// Constructor
	public Customer(String customerId, String customerName, String phoneNumber) {

		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}

	// Setter and Getter for customerId
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerId() {
		return customerId;
	}

	// Setter and Getter for customerName
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	// Setter and Getter for phoneNumber
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
