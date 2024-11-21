package unit1;

import java.util.Scanner;

/**
 * Description: This program teaches people how to calcualte the area of a rectangle
 * Date: October 2nd, 2024
 * @author Jonas Im
 */

public class RectangleArea {

	/**
	 * This is the enrty point to the program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//declare variables
		int length, width;
		
		//get the user input
		System.out.println("AREA PROGRAM");
		System.out.println("Type in the length of the rectangle and <Enter>");
		length = sc.nextInt();
		
		System.out.print("Type in the width of the rectangle and <Enter>");
		width = sc.nextInt();
		
		System.out.print("Type in the depth of the rectangle and <Enter>");
		int depth = sc.nextInt();
		
		//calculate the area
		int volume = length * width * depth;

		//Print the output
		System.out.println("The volume of your rectangle is" + volume);
		sc.close();
				
	}

}
