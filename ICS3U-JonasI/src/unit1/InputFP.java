/**
 * 
 */
package unit1;

import java.util.Scanner;

/**
 * Description: This program teaches people how to use floating point numbers
 * Date: October 3rd, 2024
 * @author Jonas Im
 */
public class InputFP {

	/**
	 * This is the enrty point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		double num1, num2;
		
		//receive user input
		System.out.print("Type in one floating point number");
		num1 = sc.nextDouble();
		System.out.println("Type in another floating point number");
		num2 = sc.nextDouble();
		
		//Print the output
		System.out.println();
		System.out.println("The first number entered was " + num1);
		System.out.println("The second number entered was " + num2);
		sc.close();
	}	


}
