package unit1;

import java.util.Scanner;

/**
 * Description: This program shows what casting is
 * Date: October 18, 2024
 * @author Jonas Im
 */
public class Casting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 *Casting* means to change data from one type to another.

    Implicit casting - changing of data types without specifically writing extra code

    Explicit casting - changing of data types by specifically writing extra code
		 */

		System.out.println("Part 1");

		int intNum;
		intNum = 10;

		double doubleNum;

		// Implicit casting
		doubleNum = intNum;

		// What type of data is printed here? Why?
		// double is printed here because intNum is implicitly cast to double
		System.out.println(doubleNum);  // Output: 10.0

		// Can you explain what is happening in this code?
		// doubleNum is incremented by 2.2, resulting in 12.2
		doubleNum = doubleNum + 2.2;

		// Explicit casting
		intNum = (int) doubleNum;

		// What type of data is printed here? Why?
		// int is printed here, the decimal part of doubleNum is truncated
		System.out.println(intNum);  // Output: 12

		/*
    	Demonstrate casting between each of the data type. Write down whether it is explicit or implicit
      	int to double: Implicit
      	double to int: Explicit
      	int to long: Implicit
      	long to int: Explicit
    	Why do you think these are implicit/explicit? 
    	It is based on the size of each data type. Smaller to larger types are implicit, while larger to smaller types are explicit
		 */

		System.out.println("Part 2");

		// understanding what you can do with casting, can you round the following variable to the nearest 10th?
		double myNum;

		Scanner in = new Scanner(System.in);
		System.out.println("Give me a decimal number up to the hundredth:");

		// Taking user input for a decimal number
		myNum = in.nextDouble();

		// Rounding to the nearest tenth using Math.round
		myNum = Math.round(myNum * 10) / 10.0;

		// Output the rounded number
		System.out.print("Rounding down to the nearest tenth, it is: " + myNum);
	}
}
