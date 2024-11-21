package unit1;

/**
 * Description: This program shows casting using char and int
 * Date: October 18, 2024
 * @author Jonas Im
 */
public class Casting2 {

	/**
	 * This is the entry point to the program.
	 * @param args unused
	 */
	public static void main(String[] args) {
		/*
    Char and int
		 */
		char myChar = 'a';
		System.out.println(myChar);  // Output: a
		System.out.println(myChar + 1);  // Output: 98 (ASCII value of 'a' is 97, so 97 + 1 = 98)

		char myChar2 = (char) (myChar + 1);  // Explicit casting from int to char
		System.out.println(myChar2);  // Output: b

		//Explain what is happening in the code. Where is there explicit casting, where is there implicit casting?
		//Implicit casting happens when char is used in arithmetic
		//Explicit casting happens when the result is cast back to a char

		//Why do you think this happens?
		//Char is represented as an ASCII value in Java so arithmetic on chars involves their ASCII values.

		//Investigate what is ASCII. What is it?
		//ASCII is a character standard where each character has a numeric code.

		//Can you find the number value for 'a'? Does it match with your findings above?
		//The ASCII value of 'a' is 97, and 'a' + 1 results in 98.

		// Create a new character myCharCap, and transform myChar into a capital 'A' and print it
		char myCharCap = (char) (myChar - 32);
		System.out.println(myCharCap);  // Output: A
	}
}