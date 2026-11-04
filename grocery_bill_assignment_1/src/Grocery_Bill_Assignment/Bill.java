package Grocery_Bill_Assignment;

public class Bill {
	int discount;

	void display(double grand_total_amount) {

		if (grand_total_amount >= 10000) {
			discount = 15;
		} else if (grand_total_amount >= 5000) {
			discount = 10;
		} else if (grand_total_amount >= 1000) {
			discount = 5;
		} else {
			discount = 0;
		}

		System.out.println("sub total ....................." + grand_total_amount);
		System.out.println("Discount(" + discount + "% ....................." + (grand_total_amount * discount / 100));
		double discount_amount = (grand_total_amount * discount / 100);
		System.out.println("Amount After Discount ................" + (grand_total_amount - discount_amount));
		double amount = (grand_total_amount - discount_amount);
		System.out.println("GST(18%) ....................." + (amount * 18 / 100));
		System.out.println(".......................................................................");
		System.out.println("Final Payable Amount............" + (amount + (amount * 18 / 100)));
		System.out.println("========================================================");
		System.out.println("!......THANK YOU FOR SHOPPING.....!");


	}
}
