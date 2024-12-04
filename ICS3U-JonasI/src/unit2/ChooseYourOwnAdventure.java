/**
 * 
 */
package unit2;

import java.util.Random;
import java.util.Scanner;

public class ChooseYourOwnAdventure {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		boolean start = false;

		// Introduction to the game "The Lost Jungle"
		Thread.sleep(500);
		System.out.println("=======================================================");
		System.out.println("           Welcome to 'Stranded in the Jungle'         ");
		System.out.println("=======================================================");
		System.out.println("Your vacation flight crashed, leaving you stranded in a dense jungle.");
		System.out.println("You must survive, make smart choices, and find a way to escape.");
		System.out.println("Good luck! Your survival depends on your decisions.");
		System.out.println("=======================================================\n");
		Thread.sleep(1500);

		// Asking user if they want to start
		System.out.println("Do you wish to proceed?");
		Thread.sleep(750);
		System.out.println("Yes or No");
		System.out.print("> ");
		String userStart = scanner.nextLine().trim().toLowerCase();

		// If the user responds with yes
		if (userStart.equalsIgnoreCase("yes")) {
			start = true;
			System.out.println("Great! Let's begin your adventure!");
		} 
		// If the user responds with no
		else if (userStart.equals("no")) {
			start = false;
			System.out.println("Ok, come back when you're ready for an adventure.");
			return; // Exit the program if the user doesn't want to proceed
		} 
		// If the user responds with anything other than yes or no
		else {
			System.out.println("Invalid response, please restart the game and respond with 'yes' or 'no'.");
			return; // Exit the program for invalid input
		}
		// **Question 1: Destination**
		System.out.println("\n=== Question 1: ===");
		System.out.println("Where are you traveling?");
		System.out.println("1. Cuba");
		System.out.println("2. North Korea");
		System.out.println("3. Bahamas");
		System.out.print("> ");
		int destinationChoice = scanner.nextInt();

		switch (destinationChoice) {
		case 1 -> System.out.println("Cool! you are heading to relax by the ocean");
		case 2 -> System.out.println("Nice, go do Pameli and Reydman's adventure then.");
		case 3 -> System.out.println("Awesome! it will be hot!");
		}
		// Pre-adventure: Flight experience
		System.out.println("\n=== Your Flight Experience ===");

		// **Question A: Plane Seating**
		System.out.println("Where will you sit on the plane?");
		System.out.println("1. Window seat");
		System.out.println("2. Middle seat");
		System.out.println("3. Aisle seat");
		System.out.print("> ");
		int seatChoice = scanner.nextInt();

		switch (seatChoice) {
		case 1 -> System.out.println("You were gazing at the clouds when the plane began to shake violently.");
		case 2 -> System.out.println("You were squeezed between two strangers, trying to relax before the turbulence hit.");
		case 3 -> System.out.println("You were ready to get up and stretch when the chaos began.");
		default -> System.out.println("Regardless of where you sat, no one could prepare for what came next.");
		}
		// **Question C: Interaction with Fellow Passengers**
		System.out.println("\nDo you talk to any passengers?");
		System.out.println("1. Yes, you have a pleasant conversation.");
		System.out.println("2. No, you keep to yourself.");
		System.out.print("> ");
		int interactionChoice = scanner.nextInt();

		if (interactionChoice == 1) {
			System.out.println("One of the passengers shared some survival tips with you");
		} else {
			System.out.println("You chose not to engage, focusing instead on your thoughts.");
		}
		// **Question B: Carry-on Item**
		System.out.println("\nWhat item do you have in your carry-on?");
		System.out.println("1. A water bottle");
		System.out.println("2. A flashlight");
		System.out.println("3. A first aid kit");
		System.out.print("> ");
		int carryOnChoice = scanner.nextInt();

		String carryOnItem = "";
		switch (carryOnChoice) {
		case 1 -> carryOnItem = "a water bottle";
		case 2 -> carryOnItem = "a flashlight";
		case 3 -> carryOnItem = "a first aid kit";
		default -> carryOnItem = "nothing useful";
		}
		System.out.println("You managed to grab " + carryOnItem + " before the plane crashed.");

		// Transition to main adventure
		System.out.println("\nThe plane crashes violently into the jungle. As you regain consciousness, you find yourself surrounded by dense foliage and debris.");
		System.out.println("You must now rely on your instincts and choices to survive. The adventure begins...\n");


		// Game Variables
		int hydrationLevel = 0;           // Integer for water level
		double health = 100.0;            // Double for health percentage
		String escapeStatus = "Stranded"; // Player's status
		boolean hasShelter = false;       // Boolean for shelter
		char direction = ' ';             // Char for navigation

		// **Question 2: Immediate Survival Priority**
		System.out.println("\n=== Question 2: Survival Priorities ===");
		System.out.println("What will you do first?");
		System.out.println("1. Look for water");
		System.out.println("2. Find shelter");
		System.out.println("3. Search for other survivors");
		System.out.print("> ");
		int priorityChoice = scanner.nextInt();

		if (priorityChoice == 1) {
			System.out.println("You find a small stream and drink water, increasing your hydration.");
			hydrationLevel += 20;
		} else if (priorityChoice == 2) {
			System.out.println("You build a temporary shelter, offering protection from the elements.");
			hasShelter = true;
		} else {
			System.out.println("You search for survivors but find no one. You lose time and energy.");
			health -= 10.0;
		}

		// **Question 3: Exploring the Jungle**
		System.out.println("\n=== Question 3: Jungle Exploration ===");
		System.out.println("You decide to explore the jungle. Which direction will you go?");
		System.out.println("N. North");
		System.out.println("S. South");
		System.out.println("E. East");
		System.out.println("W. West");
		System.out.print("> ");
		direction = scanner.next().toUpperCase().charAt(0);

		switch (direction) {
		case 'N' -> {
			System.out.println("You find a fruit tree and replenish some health.");
			health += 10.0;
		}
		case 'S' -> {
			System.out.println("You encounter a wild animal and barely escape!");
			health -= 20.0;
		}
		case 'E' -> {
			System.out.println("You stumble upon a clean water source.");
			hydrationLevel += 20;
		}
		case 'W' -> {
			System.out.println("You get lost and waste precious time.");
			health -= 10.0;
		}
		default -> {
			System.out.println("Invalid direction. You wander aimlessly.");
			health -= 5.0;


			// **Question 4: River Encounter**
			System.out.println("\n=== Question 4: Crossing the River ===");
			System.out.println("You come across a fast-flowing river. Will you attempt to cross it?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("> ");
			int riverChoice = scanner.nextInt();

			if (riverChoice == 1) {
				int diceRoll = random.nextInt(6) + 1; // Dice roll (1-6)
				System.out.println("You rolled a " + diceRoll + "!");
				if (diceRoll >= 4) {
					System.out.println("You successfully cross the river.");
				} else {
					System.out.println("You fall into the river and lose health.");
					health -= 20.0;
				}
			} else {
				System.out.println("You decide to stay put, but time is running out.");
				health -= 5.0;
			}

			// **Question 5: Mysterious Cave**
			System.out.println("\n=== Question 5: Mysterious Cave ===");
			System.out.println("You discover a hidden cave. Do you want to enter?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("> ");
			int caveChoice = scanner.nextInt();

			if (caveChoice == 1) {
				System.out.println("You find supplies left by a previous traveler. Hydration and health restored!");
				hydrationLevel += 20;
				health += 20.0;
			} else {
				System.out.println("You avoid the cave, but miss an opportunity to recover.");
			}

			// **Question 6: Crafting a Weapon**
			System.out.println("\n=== Question 6: Crafting a Weapon ===");
			System.out.println("You come across sharp rocks and sturdy branches. Do you craft a spear?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("> ");
			int weaponChoice = scanner.nextInt();

			if (weaponChoice == 1) {
				System.out.println("You craft a spear, which may help in future encounters.");
			} else {
				System.out.println("You decide against crafting a weapon, leaving you defenseless.");
			}

			// **Question 7: Strange Noises**
			System.out.println("\n=== Question 7: Strange Noises ===");
			System.out.println("You hear strange noises nearby. What will you do?");
			System.out.println("1. Investigate the noise");
			System.out.println("2. Hide and wait for it to pass");
			System.out.print("> ");
			int noiseChoice = scanner.nextInt();

			if (noiseChoice == 1) {
				System.out.println("You find an injured animal. It runs off, but you gain confidence.");
				health += 10.0;
			} else {
				System.out.println("You stay safe but miss an opportunity to learn more about the area.");
			}

			// **Question 8: Fruit or Trap?**
			System.out.println("\n=== Question 8: Fruit or Trap? ===");
			System.out.println("You spot some fruit hanging from a tree. Do you risk climbing for it?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("> ");
			int fruitChoice = scanner.nextInt();

			if (fruitChoice == 1) {
				if (random.nextBoolean()) {
					System.out.println("You successfully gather the fruit and restore energy.");
					health += 15.0;
				} else {
					System.out.println("You slip and fall, injuring yourself.");
					health -= 20.0;
				}
			} else {
				System.out.println("You decide it's too risky and move on.");
			}

			// **Question 9: Nighttime Survival**
			System.out.println("\n=== Question 9: Survival at Night ===");
			for (int night = 1; night <= 3; night++) {
				System.out.println("\nNight " + night + ": Will you:");
				System.out.println("1. Sleep in your shelter");
				System.out.println("2. Keep watch for predators");
				System.out.print("> ");
				int nightChoice = scanner.nextInt();

				if (nightChoice == 1 && hasShelter) {
					System.out.println("You sleep soundly and regain some health.");
					health += 10.0;
				} else if (nightChoice == 1) {
					System.out.println("You sleep on the ground and feel vulnerable.");
					health -= 10.0;
				} else if (nightChoice == 2) {
					System.out.println("You stay awake and keep watch, but lose energy.");
					health -= 5.0;
				}
			}

			// **Question 10: Final Escape**
			System.out.println("\n=== Question 10: Final Escape Plan ===");
			System.out.println("You find a river that could lead to freedom. Will you build a raft?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("> ");
			int raftChoice = scanner.nextInt();

			if (raftChoice == 1) {
				System.out.println("You successfully build a raft and start navigating the river.");

				scanner.close();
			}

		}
		}
	}
}



