package unit1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DFOutput {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Run the following program with a cost of 10.00.
        // What value is displayed in the output?
        // When cost = 10.00, the total displayed will be 11.30 since 10.00 + (10.00 * 0.13) = 11.30
        
        final double TAX_RATE = 0.13;  // Define the tax rate as 13%
        DecimalFormat money = new DecimalFormat("0.00");  // Format for currency
        DecimalFormat percent = new DecimalFormat("#.#%");  // Format for percentages

        double cost;  // Declare variable for the cost
        System.out.print("Please enter the cost of an item then press <Enter>: $");
        cost = sc.nextDouble();  // Input cost
        double total = cost + (cost * TAX_RATE);  // Calculate total cost with tax
        
        // Display total without formatting
        System.out.println("The cost of your item with tax is " + total);
        
     
        // Modify the parameter for the DecimalFormat on line 15 to be "$0.00"
        // Run the program again with the cost of 10, output will show as "$11.30"
        
        // Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
        // Run the program again with the cost of 10, the output will also show as "$11.30"
        // This format allows for zero decimal places if the amount is a whole number.
        
        // Modify the parameter for the DecimalFormat on line 15 to be "$0.##"
        // Calculate 10.50 x 1.13 = 11.91
        // Run the program again with the cost of 10.50; it should output "$11.91".
        
        // Modify the parameter for the DecimalFormat on line 15 as you think is appropriate for money.
        // For example, use "$#,##0.00".
        // Run the program again with the cost of 123456, the output will be "$123,456.00".
        
        // Modify the parameter for the DecimalFormat on line 15 to be "$#,###,##0.00"
        // Run the program again with the cost of 123456, the output will show as "$123,456.00".
        // This format adds commas to separate thousands for better readability.
        
        // Uncomment the following print line, and run the program with any value for the cost.
        // What value is printed for the TAX_RATE?
        // System.out.println("The tax rate is " + TAX_RATE);
        // It will print "The tax rate is 0.13".
        
        // Change the above print statement to format the TAX_RATE using the percent DecimalFormat instance.
        // System.out.println("The tax rate is " + percent.format(TAX_RATE));
        // It will now display "The tax rate is 13.0%", showing it as a percentage.

        sc.close(); 
}
}