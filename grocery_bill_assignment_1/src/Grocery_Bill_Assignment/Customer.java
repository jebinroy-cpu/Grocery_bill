package Grocery_Bill_Assignment;


public class Customer {
	private String name;

	public Customer(String n) {
		this.name = n;

	}

	public void setName(String n) {
		this.name = n;

	}

	public String getName() {
		return name;
	}

	void display() {
		System.out.println("....................\n\n Grocery Bills \n\n........................\n\n");
		System.out.println("Name : " + getName());
		System.out.println("item--------Quantity--------Price--------Total Price");

	}
}
