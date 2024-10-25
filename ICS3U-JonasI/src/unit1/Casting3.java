package unit1;

/**
 * Description: This program teaches people how to demonstrate different types of casting
 * Date: October 18, 2024
 * @author Jonas Im
 */
public class Casting3 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/* 
		 * Strings and Back Again
		 */
		//Recall:
		System.out.println("Part 1");

		// Why did it print out this way?
		// Because the first part "1 + 2 + 3" is a String, so it sees the rest as Strings too.
		// Instead of adding numbers, it just joins them together as one big String.
		System.out.println("1 + 2 + 3" + 4 + 5);  // Output: "1 + 2 + 345"

		// Demonstrate casting a double value to a String in this way
		double myDouble = 10.5;
		String doubleToStr = "" + myDouble;  // Adding "" makes the number become a String.
		System.out.println("Double to String: " + doubleToStr);  // Output: 10.5

		// Demonstrate casting a boolean value to a String in this way
		boolean myBool = true;
		String boolToStr = "" + myBool;  // Adding "" turns the boolean into a String.
		System.out.println("Boolean to String: " + boolToStr);  // Output: true

		// Demonstrate casting a char value to a String in this way
		char myChar = 'A';
		String charToStr = "" + myChar;  // Adding "" turns the character into a String.
		System.out.println("Char to String: " + charToStr);  // Output: A

		System.out.println("Part 2");

		// In order to change a String into an integer, we need another set of code
		String strNum = "25";
		int myNum = Integer.parseInt(strNum);  // This changes the String "25" into the number 25.

		System.out.println(strNum + " x 2 = " + (myNum + myNum));  // Output: 25 x 2 = 50

		/*Change strNum to the following values, and see if they work:
		 * "25.2"    Doesn't work because it's a decimal, not a whole number.
		 * "23c"     Doesn't work because "c" is not a number.
		 * "2 3"     Doesn't work because there's a space in between numbers.
		 * "Lol23"   Doesn't work because it starts with letters.
		 * "-5"      Works because "-5" is a valid integer.
		 */

		// Testing different strings
		try {
			strNum = "-5";  // You can change this to "25.2", "23c", "2 3", etc. to test.
			myNum = Integer.parseInt(strNum);
			System.out.println("Parsed integer: " + myNum);
		} catch (NumberFormatException e) {
			System.out.println("Invalid number format: " + strNum);
		}

		// What do you think the code to change a String to double would look like?
		// We use Double.parseDouble() to change a String like "25.2" into a decimal number.
		String strDouble = "25.2";
		double myDoubleNum = Double.parseDouble(strDouble);
		System.out.println(strDouble + " x 2 = " + (myDoubleNum * 2));  // Output: 25.2 x 2 = 50.4

		// When do you think it might be necessary to change a string value into an integer value/double value?
		// We need to do this when we get input from the user or from a file, which is usually in String form.
		// If we want to do math with that input, we have to turn it into a number
	}
}
