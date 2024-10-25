package unit1;
/**
 * Description: This program teaches the programmer how to use math operators in java
 * Date: October 1st, 2024
 * @author Jonas Im
 */
public class Mathoperstors {
	/**
	 *This is the entry point to the program
	 * @param
	 */
	public static void main (String [] args) {
		/*
         Pre: Kind of Math, but not really
         What do you notice is happening?
		 */

		//      System.out.println("Butter" + "fly");

		//      System.out.println("1 + 2 + 3 + 4 + 5");

		//      System.out.println(1 + 2 + 3 + 4 + 5);

		//      System.out.println(1 + 2 + "3 + 4 + 5");

		//      System.out.println("1 + 2 + 3" + 4 + 5);


		//Why do you think the last two outputs act so differently?
		System.out.println("They act differenty because the quotations marks are in different places");

		//Summary: What are two possible roles of the + operator?
		System.out.println("They combine strings and add numbers");


		/*
         Part 1 
         Figure out what is the meaning of each operator. Use print statements
         to verify your answer and explain.
		 */

		// + means: 
		System.out.println("The operator + means addition");
		// - means:
		System.out.println("The operator - means substraction");
		// * means:
		System.out.println("The operator * means multiplication");
		// / means: 
		System.out.println("The operator / means division");


		//Print the following expression: (3 + 2) * 5
		System.out.println((3 + 2) * 5);
		//Print the following expression: 3 + 2 * 5
		System.out.println(3 + 2 * 5);
		//Was this expected? Why or why not?
		/*Yes this was expected because we have to use order of operations

         Part 2 - Calculate Using Operators
         Print out, using one println statement, what 45 degrees Celsius is in Fahrenheit
		 */
		System.out.println(45 * 9/5 + 32);

		/*


         Print out, using a print and a println statement, what 900 Fahrenheit is in Celsius
		 */ 
		System.out.print((900 - 32) * 5/9);
		System.out.println(" degrees Celsius");  

		/*
         Part 3
         Figure out what is the meaning of % as a math operator. Use print statements
         to check your answer.
		 */

		//I think % means: 
		System.out.println("The operator % means to find the remainder after doing division");
	}
}