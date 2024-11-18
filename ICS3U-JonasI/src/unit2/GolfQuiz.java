/**
 * 
 */
package unit2;

import java.util.Scanner;
/**
 * Description: This programs a interactive quiz
 * Date: November 13, 2024
 * @author Jonas Im
 */

public class GolfQuiz {
	
	/** 
	 * This is the entry point to the program.
	 * @param args unused
	 */

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		// Types of variables used
		byte correctAnswersCount = 0;       
		short numberOfQuestions = 4;        
		int userAnswerInt;                  
		boolean userReady = false;          
		char userAnswerChar;                

		// Introduction
		System.out.println("Are you ready for a golf quiz?");
		String userReadyResponse = inputScanner.nextLine().trim().toLowerCase();

		// Check if person is ready
		if (userReadyResponse.equals("no")) {
			System.out.println("Okay, here it comes anyway!");
			userReady = false;
		} else if (userReadyResponse.equals("yes")) {
			userReady = true;
		} else {
			System.out.println("Invalid response. We'll start the quiz anyway!");
		}

		// First Question
		System.out.println("\nQ1) How many holes are there in a full round of golf?");
		System.out.println("  1) 10");
		System.out.println("  2) 12");
		System.out.println("  3) 18");
		System.out.print(": ");
		String userAnswerOne = inputScanner.nextLine().trim().toLowerCase();

		if (userAnswerOne.equals("3") || userAnswerOne.equals("18") || userAnswerOne.equals("18 holes")) {
			System.out.println("Correct");
			correctAnswersCount++;
		} else {
			System.out.println("Sorry, the correct answer is 3) 18.");
		}

		// Second Question
		System.out.println("\nQ2) Who is the best at golf?");
		System.out.println("  1) Alex Reydman");
		System.out.println("  2) Tiger Woods");
		System.out.println("  3) Jackson Teshima");
		System.out.print(": ");
		String userAnswerTwo = inputScanner.nextLine().trim().toLowerCase();

		if (userAnswerTwo.equals("3") || userAnswerTwo.equals("jackson teshima") || userAnswerTwo.equals("Jackson Teshima")) {
			System.out.println("That was way too obvious!");
			correctAnswersCount++;
		} else {
			System.out.println("Sorry, the correct answer is 3) Jackson Teshima.");
		}

		// Third Question
		System.out.println("\nQ3) True or False: Jackson Teshima will be playing in the Masters in 10 years.");
		System.out.println("  1) True");
		System.out.println("  2) False");
		System.out.print(": ");
		userAnswerChar = inputScanner.nextLine().trim().toLowerCase().charAt(0);

		if (userAnswerChar == '1' || userAnswerChar == 'T') {
			System.out.println("That's right!");
			correctAnswersCount++;
		} else {
			System.out.println("Sorry, the correct answer is 1) True.");
		}

		// Fourth Question
		System.out.println("\nQ4) What is the best golf outfit of all time?");
		System.out.println("  1) Tiger Woods red on sunday");
		System.out.println("  2) Jackson Teshima untucked golf shirt");
		System.out.println("  3) Aidan Yee wedding fit");
		System.out.print(": ");
		userAnswerInt = Integer.parseInt(inputScanner.nextLine().trim());

		if (userAnswerInt == 3) {
			System.out.println("Awesome!");
			correctAnswersCount++;
		} else {
			System.out.println("Sorry, the correct answer is 3) Aidan Yee wedding fit.");
		}

		// Display final results
		System.out.println("\nYou got " + correctAnswersCount + " out of " + numberOfQuestions + " correct.");
		
		// Calculate and display percentage score using different data types
		double correctAnswersDouble = correctAnswersCount; // convert byte to double
		double totalQuestionsDouble = numberOfQuestions;   // convert short to double
		float userScorePercentage = (float) ((correctAnswersDouble / totalQuestionsDouble) * 100);

		System.out.printf("Your score percentage is: %.2f%%\n", userScorePercentage);

		// Close the scanner
		inputScanner.close();
	}
	}

