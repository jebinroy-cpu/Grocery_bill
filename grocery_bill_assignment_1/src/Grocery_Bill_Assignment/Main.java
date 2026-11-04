package Grocery_Bill_Assignment;

import java.util.*;

import exception.InvalidGenerateBillExpression;
import exception.InvalidInputException;

public class Main {

	static Grocery[] grocerys = new Grocery[100];
	static Bill bills = new Bill();
	static Generate_Bill gen = new Generate_Bill();

	static Customer c;
	static String name;
	static String item;

	public static void main(String[] args) throws InvalidGenerateBillExpression, InvalidInputException {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Enter the name : ");
				name = sc.next();
				name = name.trim();

				if (!name.matches("[a-zA-Z]+")) {
					throw new InvalidInputException("Enter valid name");
				}
				c = new Customer(name);
				break;
			} catch (InvalidInputException e) {
				System.err.println("error in name :" + e.getMessage());

			}
		}

		System.out.println("Enter the total items : ");
		int no_item = sc.nextInt();

		for (int i = 0; i < no_item; i++) {

			while (true) {
				try {
					System.out.println("Enter the item name : ");
					item = sc.next();
					if (!item.matches("[a-zA-Z]+")) {
						throw new InvalidInputException("Enter valid item name");
					}
					break;
				} catch (InvalidInputException e) {
					System.err.println("error in name :" + e.getMessage());

				}

			}

			System.out.println("Enter the item quantity : ");
			int quantity = sc.nextInt();

			System.out.println("Enter the item price : ");
			double price = sc.nextDouble();
			Grocery g = new Grocery(item, price, quantity);
			grocerys[i] = g;

		}

		gen.generate(no_item);

	}

}
