package unit1;

/**
 * Description: This program teaches people comments in code
 * Date: October 18, 2024
 * @author Jonas Im
 */
public class Commenting {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
		 * Comments are meant to communicate ideas with other programmers and to keep track of one's logic
		 */


		/**
		 * This is a javadoc comment
		 * 
		 * These comments are used to create official documentation. We see them at the top of our programs (header) as well as to describe Java-defined blocks of code (class, methods, attributes).
		 *
		 * Javadoc comments can be multi-line.
		 * For now, we don't use Javadoc comments beside the header until unit 3.
		 */

		/*
		 * This is a block comment
		 * 
		 * Block comments can be multi-line.
		 * These comments are used to explain a section of code.
		 */

		// This is a line comment
		// Line comments are single line
		System.out.println("Testing"); // Line comments can also be placed at the end of a line

		/*
		 * Tracing Practice
		 * For the following code:
		 * - Every time a variable is assigned a new value, write a line comment beside it telling what is the value currently stored in the variable.
		 * 
		 * - Every time you see the block comment, write down each variable and what are the values at that time in the code
		 */

		int num1 = 20;  // num1 is initialized to 20
		double num2 = 36.2;  // num2 is initialized to 36.2
		String stringNum = "";  // stringNum is initialized to an empty string

		/*
		 * Variables Name    |   Value
		 * ---------------------------------
		 * num1              |   20
		 * num2              |   36.2
		 * stringNum         |   ""
		 */

		num1 += 20;  // num1 = 20 + 20, so num1 is now 40
		num1 = num1 / 3 * 2;  // num1 = 40 / 3 * 2 = 26 (integer division)
		num1 = (int)(num2 * 3 - (2 + 5) * 8);  // num1 = (int)(36.2 * 3 - 56) = (int)(108.6 - 56) = 52
		num2 = ((int)num2) - num1;  // num2 = 36 - 52 = -16 (after casting num2 to int)
		stringNum = num1 + " " + num2;  // stringNum = "52 -16"

		/*
		 * Variables Name    |   Value
		 * ---------------------------------
		 * num1              |   52
		 * num2              |   -16
		 * stringNum         |   "52 -16"
		 */

		num2 /= 2.5;  // num2 = -16 / 2.5 = -6.4
		num1 /= 2;  // num1 = 52 / 2 = 26
		stringNum = stringNum + "; ";  // Adds "; " to the stringNum
		stringNum = stringNum + num1 + " " + num2;  // stringNum = "52 -16; 26 -6.4"

		/*
		 * Variables Name    |   Value
		 * ---------------------------------
		 * num1              |   26
		 * num2              |   -6.4
		 * stringNum         |   "52 -16; 26 -6.4"
		 */
	}
}
