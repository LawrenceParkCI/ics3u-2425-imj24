package unit1;
/**
 * Description: This program teaches the programmer how to use math operators in java
 * Date: October 2nd, 2024
 * @author Jonas Im
 */
import java.util.Scanner;

/**
 * This is the enrty point to the program
 * @param args unused
 */
public class MakeLabels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);


		String subject;
		String name;
		String last;
		
		System.out.println("Type in the subject and press <enter>");
		subject=sc.next();

		
		System.out.println("Type in the name and press <shift>");
		name = sc.next();
		
		System.out.println("Type in the name and press <shift>");
		last = sc.next();

		

		System.out.println();
		System.out.println("******************************");
		System.out.println(name + last);
		System.out.println(subject);
		System.out.println("******************************");
		sc.close();
	}

}
