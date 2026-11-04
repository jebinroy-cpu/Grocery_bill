package Rental_System;

import java.util.*;

import exception.IllegalArguementException;
import exception.InvalidPhoneNumberException;

public class VehicleRentalSystem {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Vehicle> vehicles = new ArrayList<>();
	static ArrayList<Rental> rentals = new ArrayList<>();
	static ArrayList<Customer> customers = new ArrayList<>();

	static int rental_counter = 1;
	static int vehicle_counter = 1;
	static int customer_counter = 1;
	String vehicle_id;
	String number;
	String brand;
	String model;
	String type;
	static String vname;
	static String vnumber;
	static double totalrent;
	static double rate;

	public static void main(String args[]) {

		System.out.println("========================================");
		System.out.println("Vehicle Rental System");
		System.out.println("========================================");
		System.out.println("1.Add Vehiicle");
		System.out.println("2.Display All Vehicles");
		System.out.println("3.Display Available Vehicles");
		System.out.println("4.Rent Vehicle");
//	System.out.println("5.Calculate Rental Cost");
		System.out.println("6.Exit");

		boolean repeat = true;
		while (repeat) {
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			try {
				if (choice < 1 || choice > 6) {
					throw new IllegalArguementException("choice must be between 1 - 6");
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			switch (choice) {
			case 1:
				addVehicle();
				break;
			case 2:
				displayallvehicles();
				break;
			case 3:
				displayAvailableVehicles();
				break;
			case 4:
				rentVehicle();
				break;
			case 5:
				returnVehcle();
				break;
			case 6:
				System.out.println("Thank you for visiting.");
				repeat = false;
			}
		}
	}
	
	
	
	
	
	
	
	

	public static void addVehicle() {
		
		

		System.out.println("Enter Vehicle Type: (Bke or Car)");
		String type = sc.next();

		try {
			if (type.equalsIgnoreCase("Car")) {

				String vehicle_id = "v" + vehicle_counter;
				vehicle_counter++;

				System.out.println("Enter Vehicle Number:");
				String number = sc.next();

				System.out.println("Enter Brand:");
				String brand = sc.next();

				System.out.println("Enter Model:");
				String model = sc.next();

				System.out.println("Enter Rental Rate:");
				double rate = sc.nextDouble();

				System.out.println("Enter the number of seats :");
				int seats = sc.nextInt();

				System.out.println("Enter the Fuel type :");
				String fuel_type = sc.next();

				Car car = new Car(vehicle_id, number, brand, model, type, rate, seats, fuel_type);

				vehicles.add(car);

			} else if (type.equalsIgnoreCase("Bike")) {

				String vehicle_id = "v" + vehicle_counter;
				vehicle_counter++;

				System.out.println("Enter Vehicle Number:");
				String number = sc.next();

				System.out.println("Enter Brand:");
				String brand = sc.next();

				System.out.println("Enter Model:");
				String model = sc.next();

				System.out.println("Enter Rental Rate:");
				double rate = sc.nextDouble();

				System.out.println("Enter the ec :");
				int ec = sc.nextInt();

				String helmet;
				while (true) {
					System.out.println("Helmet available or not  :");
					System.out.println(" 1.Yes \n 2.No");
					helmet = sc.next();

					try {
						if (helmet.equalsIgnoreCase("yes") || helmet.equalsIgnoreCase("1")) {
							helmet = "Helmet Available";
							break;
						} else if (helmet.equalsIgnoreCase("No") || helmet.equalsIgnoreCase("2")) {
							helmet = "Helmet Not Available";
							break;
						} else {
							throw new IllegalArguementException("select yes or not");
						}
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}

				Bike bike = new Bike(vehicle_id, number, brand, model, type, rate, ec, helmet);
				vehicles.add(bike);
			} else {
				throw new IllegalArguementException("Vehicle type must be Car or Bike");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	
	
	
	

	public static void displayallvehicles() {

		for (Vehicle v : vehicles) {
			v.displayVehicles();
		}
	}

	
	
	
	
	public static void displayAvailableVehicles() {
		for (Vehicle v : vehicles) {
			if (v.isAvailability())
				v.displayVehicles();
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	public static void rentVehicle() {

		String rental_id = "r" + rental_counter;
		rental_counter++;

		String name;
		while (true) {
			try {
				System.out.println("enter the name : ");
				name = sc.next();
				if (!name.matches("[a-zA-Z]+")) {
					throw new IllegalArguementException("Enter Valid Name");
				}
				break;
			} catch (IllegalArguementException e) {
				System.err.println("Enter Valid Name");
			}
		}

		String phone_no;
		while (true) {
			try {
				System.out.println("enter the customer Phone_No :");
				phone_no = sc.next();
				if (!phone_no.matches("[0-9]{10}")) {
					throw new InvalidPhoneNumberException("Phone number Should contain 10 number and digits");
				}
				break;
			} catch (InvalidPhoneNumberException e) {
				System.err.println("Phone number Should contain 10 number");
			}
		}

		String customer_id = "c" + customer_counter;
		customer_counter++;

		System.out.println("enter the available vehicle id from below : ");

		for (Vehicle v : vehicles) {
			if (v.isAvailability()) {
				System.out.println(v.getVehicleId());
			}
		}
		String vid = sc.next();
		
		
		
		
		
		int nodays ;
//		boolean repeat1 = true;
//while(repeat1) {
//	try {
		System.out.println("enter the number of days : ");
		 nodays = sc.nextInt();
//		 if(nodays<1 || nodays>366) {
//			 throw new InputMismatchException("Enter the days in number "); 
//		 }
//break;
//	}
//	catch(InputMismatchException e) {
//		System.out.println("Enter the days in number ");
//	}
//}
		 
		 
		 
		Vehicle selectedvehicle = null;

		for (Vehicle v : vehicles) {
			if (v.getVehicleId().equalsIgnoreCase(vid)) {

				selectedvehicle = v;
				vname = v.getModel();
				vnumber = v.getVehicleNumber();
//			v.setAvailability(false);
				v.rentVehicle();
				break;
			}
		}

		Customer c = new Customer(customer_id, name, phone_no);
		customers.add(c);
		Rental r = new Rental(rental_id, c, selectedvehicle, nodays, totalrent);
		rentals.add(r);
		selectedvehicle.calculateRentalCost(nodays);
		totalrent = selectedvehicle.getTotalFare();
		System.out.println("Rental Succesfully done");

		System.out.println("Rental ID :" + r.getRentalId());
		System.out.println("Customer ID :" + c.getCustomerId());

		System.out.println("Customer Name :" + c.getCustomerName());
		System.out.println("Customer Phone Number :" + c.getPhoneNumber());
		System.out.println("Vehicle Name :" + vname);
		System.out.println("Vehicle Number :" + vnumber);
		System.out.println("Total cost :" + totalrent);
	}
	
	
	
	
	

	public static void returnVehcle() {
		System.out.println("Enter the vehicle id : ");
		String vid = sc.next();

		for (Vehicle v : vehicles) {
			if (v.getVehicleId().equalsIgnoreCase(vid)) {
//			v.setAvailability(true);
				v.returnVehicle();
				break;
			}
		}

		System.out.println("Total amount should you need to pay : " + totalrent);
		System.out.println("Vehicle Returned..........!");
	}

}
