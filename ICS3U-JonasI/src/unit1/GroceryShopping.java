package unit1;


import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Description: This program generates a grocery receipt 
 * Date: Oct 23, 2024
 * @author Jonas Im
 */
public class GroceryShopping {
	/**
	 * This is the entry point to the program
	 * @param args unused
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Declare variables to store product information
		String product1, product2;
		double price1, price2;
		int quantity1, quantity2;

		// Display header
		System.out.println("|| $$$ \\\\ ========= \"Welcome to Mr. Im's Grocery\" ========= /// $$$ ||");
		System.out.println("______________________________________________________________");

		// Collect details for the first product
		System.out.print("\nWhat would you like to purchase? ");
		product1 = scanner.next();
		System.out.print("How much does it cost? ");
		price1 = scanner.nextDouble();
		System.out.print("How many are you buying? ");
		quantity1 = scanner.nextInt();
		System.out.println("Got it");

		// Collect details for the second product
		System.out.print("\nEnter the second product you're purchasing: ");
		product2 = scanner.next();
		System.out.print("How much does it cost? ");
		price2 = scanner.nextDouble();
		System.out.print("How many are you buying: ");
		quantity2 = scanner.nextInt();
		System.out.println("Great choice");

		//Print receipt
		System.out.println("\nHere's your receipt:\n");


		System.out.format("%35s", "Mr. Im's Grocery");

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("\nMM/dd/yyyy HH:mm");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now));
		NumberFormat currency = NumberFormat.getCurrencyInstance();

		// Calculations for totals
		double totalCost1 = price1 * quantity1, totalCost2 = price2 * quantity2;
		final double taxRate = 0.13;
		double subtotal = totalCost1 + totalCost2;
		double taxAmount = subtotal * taxRate;
		double grandTotal = subtotal + taxAmount;
		int roundedTotal = (int) Math.round(grandTotal);  // Nearest dollar for Challenge +1
		double roundedToFiveCents = Math.round(grandTotal * 20.0) / 20.0;  // Nearest 5 cents for Challenge +2

		// Print out product details in a formatted table
		System.out.format("\n%-12s | %-10s | %-10s | %11s", "Product", "Price", "Quantity", "Total");
		System.out.println("\n-----------------------------------------------------------");
		System.out.format("%-12s | %10s | %10d | %12s\n", product1, currency.format(price1), quantity1, currency.format(totalCost1));
		System.out.format("%-12s | %10s | %10d | %12s\n", product2, currency.format(price2), quantity2, currency.format(totalCost2));
		System.out.println("-----------------------------------------------------------");

		// Display subtotal, tax, and total
		System.out.format("%39s: %12s\n", "Subtotal", currency.format(subtotal));
		System.out.format("%39s: %12s\n", "Tax (13%)", currency.format(taxAmount));
		System.out.format("%39s: %12s\n", "Total", currency.format(grandTotal));

		// Challenge +1: Print rounded to nearest dollar
		System.out.format("%39s: %12s\n", "Rounded to nearest dollar", "$" + roundedTotal);

		// Challenge +2: Print rounded to nearest 5 cents
		System.out.format("%39s: %12s\n", "Rounded to nearest 5 cents", currency.format(roundedToFiveCents));


		System.out.println("\nThis rounds to approximately $" + roundedTotal + ".");   
		System.out.println("\nThank you for shopping at Mr. Im's Grocery!");
		System.out.println("We look forward to serving you again soon!");


		scanner.close();
	}
}
