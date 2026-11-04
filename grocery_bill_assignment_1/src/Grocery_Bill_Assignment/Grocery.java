package Grocery_Bill_Assignment;

class Grocery {

	String item;
	double price;
	int quantity;
	double total_price;

	Grocery(String item, double price, int quantity) {
		this.item = item;
		this.price = price;
		this.quantity = quantity;
		this.total_price = quantity * price;
	}

	void display() {

		System.out.println(item + "----------" + "x" + quantity + "------------" + price + " rs" + "--------"
				+ total_price + "rs");

	}

}
