package unit1;

import java.util.Scanner;

/**
 * Description: This program teaches the programmer how to use math methods in java
 * Date: October 17, 2024
 * @author Jonas Im
 */
public class UsingMathMethods {

	/**
	 * This is the entry point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = 0;

		System.out.println("Part A");

		// Ask the user for any real number and store the input into the num variable
		System.out.print("Enter any real number: ");
		num = sc.nextDouble();

		// Display the results using various Math methods
		System.out.println("Math.round(num): " + Math.round(num));
		System.out.println("Math.rint(num): " + Math.rint(num));
		System.out.println("Math.sqrt(num): " + Math.sqrt(num));
		System.out.println("Math.abs(num): " + Math.abs(num));
		System.out.println("Math.pow(num, 2): " + Math.pow(num, 2));
		System.out.println("Math.pow(num, num): " + Math.pow(num, num));
		System.out.println("Math.pow(num, 3): " + Math.pow(num, 3));

		/*
		 * Run the program and write down the output that is produced
		 * when each of the following values are input:
		 * 
		 *                  num = 16.75      | num = 4.0     | num = -23.45
		 *                  -----------------------------------------------
		 * Math.round(num)          17      |        4         |-23
		 * Math.rint(num)          17.0     |        4.0       |-23.0
		 * Math.sqrt(num) 4.092676385936225 |        2.0       |NaN
		 * Math.abs(num)         16.75      |        4.0       |23.45
		 * Math.pow(num, 2)      280.5625   |        16.0      |549.9024999999999
		 * Math.pow(num, num)3.178689376746782E20|   256.0     |NaN
		 * Math.pow(num, 3)    4699.421875  |        64.0      |-12895.213624999999
		 */

		// Why does the last value (-23.45) give strange output for Math.sqrt(num)?
		// Nan stands for Not a number

		// In your own words describe what the following Math methods do:
		/*
		 * round: Rounds the number to the nearest whole number.
		 * rint: Returns the closest integer to the argument but as a double.
		 * sqrt: Returns the square root of the number.
		 * abs: Returns the absolute value of the number.
		 * pow: Raises the first number to the power of the second number.
		 */

		// The methods round, sqrt, and abs only have one parameter 
		// Why does the pow method have 2 parameters? Explain the purpose of these 2 parameters.
		// The first parameter is the base and the second parameter is the exponent. The result is the base raised to the power of the exponent.

		System.out.println("\nPart B");

		// Ask the user for a real number and an integer
		System.out.print("Enter any real number: ");
		double realNum = sc.nextDouble();
		System.out.print("Enter an integer: ");
		int intPower = sc.nextInt();

		// Display real number, its square root, and raised to the integer power
		System.out.printf("REAL NUMBER\tSQUARE ROOT\tRAISED TO POWER", intPower);
		System.out.printf("%f\t%f\t\t%f\n", realNum, Math.sqrt(realNum), Math.pow(realNum, intPower));

		/*
		 * Write down the results produced by your program when the real number 7.8985 and
		 * the integer 3 are input.
		 * REAL NUMBER	SQUARE ROOT	RAISED TO POWER 7.898500	2.810427		492.758208
		 */

		// Now ask for a real number power instead of an integer
		System.out.print("Enter any real number as a power: ");
		double realPower = sc.nextDouble();

		// Display real number raised to real power
		System.out.printf("REAL NUMBER\tSQUARE ROOT\t\tRAISED TO REAL POWER %f\n", realPower);
		System.out.printf("%f\t%f\t\t%f\n", realNum, Math.sqrt(realNum), Math.pow(realNum, realPower));

		/*
		 * Write down the results produced by your program when the following are input:
		 * a) the number 16 and the real number power 0.5
		 * REAL NUMBER	SQUARE ROOT		RAISED TO REAL POWER 0.500000 
			16.000000	4.000000		4.000000
		 * b) the number 8 and the real number power 0.33
		 * REAL NUMBER	SQUARE ROOT		RAISED TO REAL POWER 0.330000
			8.000000	2.828427		2.020271
		 * Does your program give a different answer if 0.3333333 is input instead of 0.33 for the power?
		 * Yes sligh differences
		 */

		sc.close();
	}




}


