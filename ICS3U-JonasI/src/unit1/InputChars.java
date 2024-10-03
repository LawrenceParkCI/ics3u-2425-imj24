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
public class InputChars {

	/**
	 *  This is the entry pount to the program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		char ch1, ch2, ch3;
		System.out.println("Type in any three characters on the keyboard");
		System.out.println("Press <Enter> after each.");
		ch1 = sc.nextLine().charAt(0);
		ch2 = sc.nextLine().charAt(0);
		ch3 = sc.nextLine().charAt(0);
		System.out.println();
		System.out.println("Together these 3 letters spell: " + (ch1 + ch2 + ch3));
		sc.close();
		
		
	}
	

}
