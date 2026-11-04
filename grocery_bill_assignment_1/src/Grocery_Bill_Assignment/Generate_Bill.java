package Grocery_Bill_Assignment;

import java.util.Scanner;

import exception.InvalidGenerateBillExpression;

public class Generate_Bill extends Main {

	Scanner sc = new Scanner(System.in);
	static double grand_total_amount = 0;

	void generate(int no_item) throws InvalidGenerateBillExpression{
		
		while(true) {
			try {
		System.out.println("generate bill (yes/no)");
		String command1 = sc.next();

		if (command1.equalsIgnoreCase("yes")) {
			c.display();
			for (int i = 0; i < no_item; i++) {
				grocerys[i].display();
				grand_total_amount += grocerys[i].total_price;

			}
			bills.display(grand_total_amount);
			break;

		} else if (command1.equalsIgnoreCase("no")) {
			System.out.println("Thank you for adding  billing data");
			break;
		} 
		else {
			throw new InvalidGenerateBillExpression("add proper command for further processing");
			
		}
		}
		catch(InvalidGenerateBillExpression e) {
			System.err.println("error in generation : " + e.getMessage());
		}
		}
		
		}
	

}
