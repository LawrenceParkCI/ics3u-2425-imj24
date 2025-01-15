package unit2;

import java.awt.Color;
import java.util.Random;
import hsa_new.Console;

/**
 * Description: A satisfying and interactive journey through the lost jungle, resulting in different outcomes based on your actions.
 * Date: Dec. 4, 2024
 * @author Caden Vandeweghe and Jonas Im
 */

public class AdventureGame {

	// Constants for game stats
	private static final double MAX_HEALTH = 100.0;
	private static final double MAX_ENERGY = 100.0;

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Console c = new Console(30, 120, 16, "The Lost Jungle Adventure");
		Random random = new Random();

		// Set background to black and text to dark green
		c.setTextBackgroundColor(Color.BLACK);
		c.setTextColor(new Color(0, 128, 0));
		
		boolean playAgain;
		do {

		// Game Variables
		double health = MAX_HEALTH;
		double energy = MAX_ENERGY;

		// Destination Choice
		c.println("Where would you like to travel to?");

		String[] countries = { "Thailand", "China", "Bahamas", "Italy", "Zimbabwe" };


		for (int i = 0; i < countries.length; i++) {
			c.println(Integer.toString(i + 1) + ". " + countries[i]);
		}

		c.print("> ");
		int destinationChoice = c.readInt();

		switch (destinationChoice) {
		case 1 -> c.println("Cool");
		case 2 -> c.println("Nice!");
		case 3 -> c.println("Awesome!");
		case 4 -> c.println("Amazing!");
		case 5 -> c.println("Great!");
		}

		c.println("Are you excited for your trip?!");
		String excitement = c.readLine();

		if (excitement.equalsIgnoreCase("yes")) {
			c.println("Great, it’s going to be such a fun trip!");
		} else {
			c.println("That sucks, but you should try and make the most of it");          
		}


		// Pre-adventure: Flight experience
		c.println("\n=== Your Flight Experience ===");

		// Plane Seating
		c.println("Where will you sit on the plane?");
		c.println("1. Window seat");
		c.println("2. Middle seat");
		c.println("3. Aisle seat");
		c.print("> ");
		int seatChoice = c.readInt();

		switch (seatChoice) {
		case 1 -> c.println("You were gazing at the clouds when the plane began to shake violently.");
		case 2 -> c.println("You were squeezed between two strangers, trying to relax before the turbulence hit.");
		case 3 -> c.println("You were ready to get up and stretch when the chaos began.");
		default -> c.println("Regardless of where you sat, no one could prepare for what came next.");
		}

		// Interaction with Fellow Passengers
		c.println("\nDo you talk to any passengers?");
		c.println("1. Yes, you have a pleasant conversation.");
		c.println("2. No, you keep to yourself.");
		c.print("> ");
		int interactionChoice = c.readInt();

		if (interactionChoice == 1) {
			c.println("One of the passengers shared some survival tips with you");
		} else {
			c.println("You chose not to engage, focusing instead on your thoughts.");
		}

		// Carry-on Item
		c.println("\nWhat item do you have in your carry-on?");
		c.println("1. A water bottle");
		c.println("2. A flashlight");
		c.println("3. A first aid kit");
		c.print("> ");
		int carryOnChoice = c.readInt();

		switch (carryOnChoice) {
		case 1 -> c.println("The water bottle might keep you hydrated in emergencies.");
		case 2 -> c.println("The flashlight could be useful in the dark jungle.");
		case 3 -> c.println("The first aid kit could save your life after an injury.");
		default -> c.println("You forgot to bring anything useful!");
		}

		// Begin Path Based on Destination
		if (destinationChoice == 1) {
			thailandQuestions(c, random, health, energy);
		} else if (destinationChoice == 2) {
			chinaQuestions(c, random, health, energy);
		} else if (destinationChoice == 3) {
			bahamasQuestions(c, random, health, energy);
		} else if (destinationChoice == 4) {
			italyQuestions(c, random, health, energy);
		} else if (destinationChoice == 5) {
			zimbabweQuestions(c, random, health, energy);
		}
		
		
			// Asking user if he wants to play again
			c.println("Would you like to play again? (yes/no)");
			String replay = c.readLine();
			playAgain = replay.equalsIgnoreCase("yes");
		} while (playAgain);
		
		// What happens when you say no


//		// Location-Specific Path
//		switch (destinationChoice) {
//		case 1 -> thailandPath(c, random, health, energy);
//		case 2 -> chinaPath(c, random, health, energy);
//		case 3 -> bahamasPath(c, random, health, energy);
//		case 4 -> italyPath(c, random, health, energy);
//		case 5 -> zimbabwePath(c, random, health, energy);
//		}
	}




	private static void displayStats(Console c, double health, double energy) {
		c.println("\n=== Player Stats ===");
		c.println("Health: " + health + "/" + MAX_HEALTH);
		c.println("Energy: " + energy + "/" + MAX_ENERGY);
		c.println("=======================");
	}
	// Thailand Path
	private static void thailandPath(Console c, Random random, double health, double energy) throws InterruptedException {
		thailandQuestions(c, random, health, energy);
	}

	private static void thailandQuestions(Console c, Random random, double health, double energy) throws InterruptedException {
		c.println("\n=== Thailand Path ===");

		// Question 1
		c.println("You hear rustling in the bushes. What do you do?");
		c.println("1. Investigate the noise.");
		c.println("2. Stay still and quiet.");
		c.print("> ");
		int choice1 = c.readInt();
		if (choice1 == 1) {
			c.println("You find helpful resources but risk being noticed by predators.");
			energy -= 5;
		} else {
			c.println("You avoid danger but gain nothing.");
		}

		// Question 2
		c.println("You find a river. What do you do?");
		c.println("1. Catch fish for food.");
		c.println("2. Drink water from the river.");
		c.print("> ");
		int choice2 = c.readInt();
		if (choice2 == 1) {
			c.println("You catch fish and restore energy.");
			energy += 10;
		} else {
			c.println("The water is contaminated and reduces your health.");
			health -= 10;
		}

		int attempts = 3;
		boolean successful = false;

		while (attempts > 0 && !successful) {
		    c.println("You see a snake blocking your path. How do you handle it?");
		    c.println("1. Scare it away.");
		    c.println("2. Find another route.");
		    c.print("> ");
		    int choice = c.readInt();

		    if (choice == 1) {
		        c.println("You scare the snake, saving time but risking health.");
		        health -= 5;
		        successful = true; // Exit the loop
		    } else if (choice == 2) {
		        c.println("You take a safer but longer route, costing energy.");
		        energy -= 10;
		        successful = true; // Exit the loop
		    } else {
		        c.println("Invalid choice. Try again.");
		        attempts--;
		    }
		}

		if (!successful) {
		    c.println("You ran out of attempts and missed the opportunity.");
		}

		// Question 4
		c.println("A rainstorm starts. What’s your move?");
		c.println("1. Take shelter under a tree.");
		c.println("2. Continue moving.");
		c.print("> ");
		int choice4 = c.readInt();
		if (choice4 == 1) {
			c.println("You stay dry but lose precious time.");
			energy -= 5;
		} else {
			c.println("You push forward but get soaked, losing health.");
			health -= 10;
		}

		// Question 5
		c.println("You discover a small hut. Do you explore?");
		c.println("1. Enter to find supplies.");
		c.println("2. Avoid in case of danger.");
		c.print("> ");
		int choice5 = c.readInt();
		if (choice5 == 1) {
			c.println("You find tools to help your journey.");
			energy += 10;
		} else {
			c.println("You avoid danger but miss potential resources.");
		}

		// Question 6
		c.println("You meet a local guide. How do you respond?");
		c.println("1. Seek help.");
		c.println("2. Avoid interaction.");
		c.print("> ");
		int choice6 = c.readInt();
		if (choice6 == 1) {
			c.println("The guide shares survival tips and restores your energy.");
			energy += 15;
		} else {
			c.println("You miss out on valuable advice.");
		}

		// Question 7
		c.println("Night falls. Where do you rest?");
		c.println("1. Build a shelter.");
		c.println("2. Sleep in the open.");
		c.print("> ");
		int choice7 = c.readInt();
		if (choice7 == 1) {
			c.println("You sleep safely, restoring energy.");
			energy += 10;
		} else {
			c.println("You risk exposure to predators and lose health.");
			health -= 15;
		}

		// Question 8
		c.println("A marked trail appears. Do you follow it?");
		c.println("1. Stay on the trail.");
		c.println("2. Blaze your own path.");
		c.print("> ");
		int choice8 = c.readInt();
		if (choice8 == 1) {
			c.println("The trail leads to useful resources.");
			energy += 5;
		} else {
			c.println("You lose energy creating your path.");
			energy -= 10;
		}

		// Question 9
		c.println("You find a fruit tree. Do you eat?");
		c.println("1. Try the fruit.");
		c.println("2. Avoid it, unsure of safety.");
		c.print("> ");
		int choice9 = c.readInt();
		if (choice9 == 1) {
			c.println("The fruit restores energy.");
			energy += 10;
		} else {
			c.println("You stay hungry but avoid potential poisoning.");
		}

		int rescueAttempts = 3;
		boolean rescued = false;

		while (rescueAttempts > 0 && !rescued) {
		    c.println("A helicopter flies overhead. What do you do?");
		    c.println("1. Signal for help.");
		    c.println("2. Hide to avoid detection.");
		    c.print("> ");
		    int choice = c.readInt();

		    if (choice == 1) {
		        c.println("The helicopter spots you and rescues you!");
		        rescued = true; // Exit the loop
		    } else {
		        c.println("You miss the chance. Try again.");
		        rescueAttempts--;
		    }
		}

		if (!rescued) {
		    c.println("You missed all your chances for rescue.");
		}
		displayStats(c, health, energy);
	}
	// China path
	private static void chinaPath(Console c, Random random, double health, double energy) throws InterruptedException {
		chinaQuestions(c, random, health, energy);
	}

	private static void chinaQuestions(Console c, Random random, double health, double energy) throws InterruptedException {
		c.println("\n=== China Path ===");

		// Question 1
		c.println("You come across an ancient ruin. What do you do?");
		c.println("1. Explore the ruin for supplies.");
		c.println("2. Avoid it and continue your journey.");
		c.print("> ");
		int choice1 = c.readInt();
		if (choice1 == 1) {
			c.println("You find a hidden stash of food and water, restoring energy.");
			energy += 10;
		} else {
			c.println("You miss out on valuable resources.");
		}

		// Question 2
		c.println("You see a steep cliff ahead. How do you proceed?");
		c.println("1. Climb the cliff to save time.");
		c.println("2. Take the long but safer route around.");
		c.print("> ");
		int choice2 = c.readInt();
		if (choice2 == 1) {
			c.println("You climb successfully but lose energy.");
			energy -= 15;
		} else {
			c.println("You conserve energy but lose precious time.");
			health -= 5;
		}

		// Question 3
		c.println("A wild animal blocks your path. What do you do?");
		c.println("1. Scare it away with loud noises.");
		c.println("2. Wait for it to leave.");
		c.print("> ");
		int choice3 = c.readInt();
		if (choice3 == 1) {
			c.println("The animal flees, but you expend energy.");
			energy -= 10;
		} else {
			c.println("You wait and conserve energy but waste time.");
		}

		// Question 4
		c.println("You find an old bridge. Do you cross it?");
		c.println("1. Cross the bridge quickly.");
		c.println("2. Test its stability before crossing.");
		c.print("> ");
		int choice4 = c.readInt();
		if (choice4 == 1) {
			c.println("The bridge holds, and you make it across.");
		} else {
			c.println("Testing the bridge ensures safety but delays your progress.");
			energy -= 5;
		}

		// Question 5
		c.println("You find a hidden cave. Do you explore it?");
		c.println("1. Enter to look for shelter.");
		c.println("2. Avoid it in case of danger.");
		c.print("> ");
		int choice5 = c.readInt();
		if (choice5 == 1) {
			c.println("You find shelter and recover some energy.");
			energy += 10;
		} else {
			c.println("You miss a potential safe spot but avoid risks.");
		}

		// Question 6
		c.println("You come across a rushing river. What do you do?");
		c.println("1. Attempt to swim across.");
		c.println("2. Look for a shallow crossing.");
		c.print("> ");
		int choice6 = c.readInt();
		if (choice6 == 1) {
			c.println("You make it across but lose energy.");
			energy -= 15;
		} else {
			c.println("You conserve energy but lose time.");
		}

		// Question 7
		c.println("Night falls. How do you stay warm?");
		c.println("1. Build a fire.");
		c.println("2. Find natural shelter.");
		c.print("> ");
		int choice7 = c.readInt();
		if (choice7 == 1) {
			c.println("The fire keeps you warm and safe from predators.");
			energy += 10;
		} else {
			c.println("You stay hidden but lose health due to the cold.");
			health -= 10;
		}

		// Question 8
		c.println("You hear a loud noise in the distance. What do you do?");
		c.println("1. Investigate the source.");
		c.println("2. Stay where you are.");
		c.print("> ");
		int choice8 = c.readInt();
		if (choice8 == 1) {
			c.println("You find other survivors who share supplies.");
			energy += 15;
		} else {
			c.println("You avoid potential danger but gain nothing.");
		}

		// Question 9
		c.println("You find a strange plant. Do you eat it?");
		c.println("1. Eat the plant.");
		c.println("2. Avoid it.");
		c.print("> ");
		int choice9 = c.readInt();
		if (choice9 == 1) {
			if (random.nextBoolean()) {
				c.println("The plant restores energy.");
				energy += 10;
			} else {
				c.println("The plant was toxic and reduces health.");
				health -= 10;
			}
		} else {
			c.println("You remain cautious and stay safe.");
		}

		int rescueAttempts = 3;
		boolean rescued = false;

		while (rescueAttempts > 0 && !rescued) {
		    c.println("A helicopter flies overhead. What do you do?");
		    c.println("1. Signal for help.");
		    c.println("2. Hide to avoid detection.");
		    c.print("> ");
		    int choice = c.readInt();

		    if (choice == 1) {
		        c.println("The helicopter spots you and rescues you!");
		        rescued = true; // Exit the loop
		    } else {
		        c.println("You miss the chance. Try again.");
		        rescueAttempts--;
		    }
		}

		if (!rescued) {
		    c.println("You missed all your chances for rescue.");
		}

		displayStats(c, health, energy);
	}
	// Bahamas path
	private static void bahamasPath(Console c, Random random, double health, double energy) throws InterruptedException {
		bahamasQuestions(c, random, health, energy);
	}

	private static void bahamasQuestions(Console c, Random random, double health, double energy) throws InterruptedException {
		c.println("\n=== Bahamas Path ===");

		// Question 1
		c.println("You see a beautiful beach with some washed-up supplies. What do you do?");
		c.println("1. Search the supplies for useful items.");
		c.println("2. Ignore them and focus on finding shelter.");
		c.print("> ");
		int choice1 = c.readInt();
		if (choice1 == 1) {
			c.println("You find food and a small fishing net.");
			energy += 10;
		} else {
			c.println("You focus on finding shelter but miss out on resources.");
		}

		// Question 2
		c.println("You encounter a small freshwater pool. What do you do?");
		c.println("1. Drink water from the pool.");
		c.println("2. Use the water to clean wounds.");
		c.print("> ");
		int choice2 = c.readInt();
		if (choice2 == 1) {
			c.println("The water refreshes you and restores some energy.");
			energy += 10;
		} else {
			c.println("You clean your wounds, preventing infection but expending energy.");
			energy -= 5;
			health += 5;
		}

		// Question 3
		c.println("A group of crabs is near the shore. What do you do?");
		c.println("1. Try to catch some for food.");
		c.println("2. Leave them alone and move on.");
		c.print("> ");
		int choice3 = c.readInt();
		if (choice3 == 1) {
			c.println("You catch some crabs and cook them, restoring energy.");
			energy += 15;
		} else {
			c.println("You conserve energy but miss out on a meal.");
		}

		// Question 4
		c.println("You see a cave nearby. What do you do?");
		c.println("1. Explore the cave for shelter.");
		c.println("2. Stay outside and set up a temporary camp.");
		c.print("> ");
		int choice4 = c.readInt();
		if (choice4 == 1) {
			c.println("You find shelter in the cave, staying safe from the elements.");
			energy += 10;
		} else {
			c.println("You remain exposed but manage to rest a little.");
			energy += 5;
		}

		// Question 5
		c.println("You notice a storm approaching. What do you do?");
		c.println("1. Seek higher ground to stay safe from flooding.");
		c.println("2. Stay low and secure your camp.");
		c.print("> ");
		int choice5 = c.readInt();
		if (choice5 == 1) {
			c.println("You avoid the flood but expend extra energy climbing.");
			energy -= 10;
		} else {
			c.println("You secure your camp but risk being caught in rising water.");
			health -= 10;
		}

		// Question 6
		c.println("You find a trail of footprints in the sand. What do you do?");
		c.println("1. Follow the footprints.");
		c.println("2. Ignore them and continue your own path.");
		c.print("> ");
		int choice6 = c.readInt();
		if (choice6 == 1) {
			c.println("The footprints lead to a small group of survivors who share resources.");
			energy += 15;
		} else {
			c.println("You stay on your path, conserving energy but finding nothing new.");
		}

		// Question 7
		c.println("Night falls, and the temperature drops. What do you do?");
		c.println("1. Start a fire to keep warm.");
		c.println("2. Bundle up and try to sleep through the cold.");
		c.print("> ");
		int choice7 = c.readInt();
		if (choice7 == 1) {
			c.println("The fire keeps you warm, restoring energy.");
			energy += 10;
		} else {
			c.println("You endure the cold, losing some health.");
			health -= 10;
		}

		// Question 8
		c.println("You discover a wrecked boat on the shore. What do you do?");
		c.println("1. Search the boat for supplies.");
		c.println("2. Leave it alone, fearing instability.");
		c.print("> ");
		int choice8 = c.readInt();
		if (choice8 == 1) {
			c.println("You find a flare gun and some canned food.");
			energy += 10;
		} else {
			c.println("You avoid the wreck but gain nothing.");
		}

		// Question 9
		c.println("You hear distant voices. What do you do?");
		c.println("1. Investigate the voices.");
		c.println("2. Stay hidden and observe.");
		c.print("> ");
		int choice9 = c.readInt();
		if (choice9 == 1) {
			c.println("The voices belong to a rescue team that helps you.");
			energy += 20;
		} else {
			c.println("You avoid potential danger but miss out on rescue.");
		}

		int rescueAttempts = 3;
		boolean rescued = false;

		while (rescueAttempts > 0 && !rescued) {
		    c.println("A helicopter flies overhead. What do you do?");
		    c.println("1. Signal for help.");
		    c.println("2. Hide to avoid detection.");
		    c.print("> ");
		    int choice = c.readInt();

		    if (choice == 1) {
		        c.println("The helicopter spots you and rescues you!");
		        rescued = true; // Exit the loop
		    } else {
		        c.println("You miss the chance. Try again.");
		        rescueAttempts--;
		    }
		}

		if (!rescued) {
		    c.println("You missed all your chances for rescue.");
		}

		displayStats(c, health, energy);
	}
	// Italy Path
	private static void italyPath(Console c, Random random, double health, double energy) throws InterruptedException {
		italyQuestions(c, random, health, energy);
	}

	private static void italyQuestions(Console c, Random random, double health, double energy) throws InterruptedException {
		c.println("\n=== Italy Path ===");

		// Question 1
		c.println("You come across a vineyard. What do you do?");
		c.println("1. Pick some grapes for food.");
		c.println("2. Look around for other resources.");
		c.print("> ");
		int choice1 = c.readInt();
		if (choice1 == 1) {
			c.println("The grapes restore some energy.");
			energy += 10;
		} else {
			c.println("You find a water source and quench your thirst.");
			energy += 5;
		}

		// Question 2
		c.println("You find a steep hillside. How do you proceed?");
		c.println("1. Climb carefully to save time.");
		c.println("2. Take the longer but easier path.");
		c.print("> ");
		int choice2 = c.readInt();
		if (choice2 == 1) {
			c.println("You make it up the hill, but it drains your energy.");
			energy -= 10;
		} else {
			c.println("You conserve energy but lose time.");
		}

		// Question 3
		c.println("You encounter a shepherd. What do you do?");
		c.println("1. Ask for help.");
		c.println("2. Avoid contact and continue alone.");
		c.print("> ");
		int choice3 = c.readInt();
		if (choice3 == 1) {
			c.println("The shepherd gives you food and directions.");
			energy += 15;
		} else {
			c.println("You avoid any potential trouble but miss out on assistance.");
		}

		// Question 4
		c.println("You see a small abandoned villa. What do you do?");
		c.println("1. Explore for supplies.");
		c.println("2. Stay away in case of danger.");
		c.print("> ");
		int choice4 = c.readInt();
		if (choice4 == 1) {
			c.println("You find useful items to aid your journey.");
			energy += 10;
		} else {
			c.println("You avoid danger but gain nothing.");
		}

		// Question 5
		c.println("You hear a stream nearby. What do you do?");
		c.println("1. Follow the sound to find water.");
		c.println("2. Stay on your current path.");
		c.print("> ");
		int choice5 = c.readInt();
		if (choice5 == 1) {
			c.println("You find clean water and restore energy.");
			energy += 15;
		} else {
			c.println("You conserve time but remain thirsty.");
		}

		// Question 6
		c.println("A pack of wild boars crosses your path. What do you do?");
		c.println("1. Hide and wait for them to leave.");
		c.println("2. Try to scare them off.");
		c.print("> ");
		int choice6 = c.readInt();
		if (choice6 == 1) {
			c.println("You stay safe but lose precious time.");
		} else {
			c.println("You scare them off but lose some energy in the process.");
			energy -= 5;
		}

		// Question 7
		c.println("You discover a cave. What do you do?");
		c.println("1. Enter to seek shelter.");
		c.println("2. Avoid it and move on.");
		c.print("> ");
		int choice7 = c.readInt();
		if (choice7 == 1) {
			c.println("You rest safely and regain energy.");
			energy += 10;
		} else {
			c.println("You stay exposed but avoid any hidden dangers.");
		}

		// Question 8
		c.println("You see a distant village. What do you do?");
		c.println("1. Head toward the village for help.");
		c.println("2. Stay hidden and observe from afar.");
		c.print("> ");
		int choice8 = c.readInt();
		if (choice8 == 1) {
			c.println("The villagers provide food and water.");
			energy += 20;
		} else {
			c.println("You avoid potential risks but gain nothing.");
		}

		// Question 9
		c.println("You find an old olive grove. What do you do?");
		c.println("1. Pick olives to eat.");
		c.println("2. Ignore it and keep moving.");
		c.print("> ");
		int choice9 = c.readInt();
		if (choice9 == 1) {
			c.println("The olives restore your energy.");
			energy += 10;
		} else {
			c.println("You miss out on a chance to replenish your energy.");
		}

		int rescueAttempts = 3;
		boolean rescued = false;

		while (rescueAttempts > 0 && !rescued) {
		    c.println("A helicopter flies overhead. What do you do?");
		    c.println("1. Signal for help.");
		    c.println("2. Hide to avoid detection.");
		    c.print("> ");
		    int choice = c.readInt();

		    if (choice == 1) {
		        c.println("The helicopter spots you and rescues you!");
		        rescued = true; // Exit the loop
		    } else {
		        c.println("You miss the chance. Try again.");
		        rescueAttempts--;
		    }
		}

		if (!rescued) {
		    c.println("You missed all your chances for rescue.");
		}
		displayStats(c, health, energy);
	}
	
	private static void zimbabweQuestions(Console c, Random random, double health, double energy) throws InterruptedException {
		c.println("\n=== Zimbabwe Path ===");

		// Question 1
		c.println("You find yourself in an open savannah with tall grass. What do you do?");
		c.println("1. Look for high ground to scout the area.");
		c.println("2. Stay hidden in the grass.");
		c.print("> ");
		int choice1 = c.readInt();
		if (choice1 == 1) {
			c.println("You spot a water source in the distance.");
			energy += 5;
		} else {
			c.println("You stay hidden but gain no useful information.");
		}

		// Question 2
		c.println("You come across a watering hole with animals nearby. What do you do?");
		c.println("1. Approach cautiously to drink water.");
		c.println("2. Wait for the animals to leave.");
		c.print("> ");
		int choice2 = c.readInt();
		if (choice2 == 1) {
			c.println("You quench your thirst but risk an encounter with predators.");
			health -= 5;
		} else {
			c.println("You stay safe but remain thirsty.");
		}

		// Question 3
		c.println("A herd of elephants blocks your path. What do you do?");
		c.println("1. Wait for them to pass.");
		c.println("2. Try to find a way around them.");
		c.print("> ");
		int choice3 = c.readInt();
		if (choice3 == 1) {
			c.println("The elephants pass peacefully, and you continue safely.");
		} else {
			c.println("You expend extra energy navigating around them.");
			energy -= 10;
		}

		// Question 4
		c.println("You find a small abandoned camp. What do you do?");
		c.println("1. Search the camp for supplies.");
		c.println("2. Avoid it and move on.");
		c.print("> ");
		int choice4 = c.readInt();
		if (choice4 == 1) {
			c.println("You find some food and a map.");
			energy += 10;
		} else {
			c.println("You avoid any potential dangers but miss useful resources.");
		}

		// Question 5
		c.println("You hear roaring in the distance. What do you do?");
		c.println("1. Investigate the source of the sound.");
		c.println("2. Stay away and move in the opposite direction.");
		c.print("> ");
		int choice5 = c.readInt();
		if (choice5 == 1) {
			c.println("You encounter a lion and barely escape, losing health.");
			health -= 15;
		} else {
			c.println("You avoid danger but lose time.");
		}

		// Question 6
		c.println("Night falls, and you need shelter. What do you do?");
		c.println("1. Build a shelter from nearby materials.");
		c.println("2. Sleep in the open.");
		c.print("> ");
		int choice6 = c.readInt();
		if (choice6 == 1) {
			c.println("You build a shelter and rest safely.");
			energy += 10;
		} else {
			c.println("You are exposed to the elements and lose health.");
			health -= 10;
		}

		// Question 7
		c.println("You find a river teeming with fish. What do you do?");
		c.println("1. Try to catch some fish.");
		c.println("2. Use the river to refill your water supply.");
		c.print("> ");
		int choice7 = c.readInt();
		if (choice7 == 1) {
			c.println("You catch fish and restore energy.");
			energy += 15;
		} else {
			c.println("You refill water and stay hydrated.");
			energy += 10;
		}

		// Question 8
		c.println("You see a distant village. What do you do?");
		c.println("1. Head toward the village for help.");
		c.println("2. Stay hidden and observe from afar.");
		c.print("> ");
		int choice8 = c.readInt();
		if (choice8 == 1) {
			c.println("The villagers provide food and water.");
			energy += 20;
		} else {
			c.println("You avoid potential risks but gain nothing.");
		}

		// Question 9
		c.println("A thunderstorm begins. What do you do?");
		c.println("1. Find shelter immediately.");
		c.println("2. Continue moving to avoid losing time.");
		c.print("> ");
		int choice9 = c.readInt();
		if (choice9 == 1) {
			c.println("You find a safe spot and avoid getting drenched.");
			health += 5;
		} else {
			c.println("You are caught in the storm and lose energy.");
			energy -= 10;
		}

		int rescueAttempts = 3;
		boolean rescued = false;

		while (rescueAttempts > 0 && !rescued) {
		    c.println("A helicopter flies overhead. What do you do?");
		    c.println("1. Signal for help.");
		    c.println("2. Hide to avoid detection.");
		    c.print("> ");
		    int choice = c.readInt();

		    if (choice == 1) {
		        c.println("The helicopter spots you and rescues you!");
		        rescued = true; // Exit the loop
		    } else {
		        c.println("You miss the chance. Try again.");
		        rescueAttempts--;
		    }
		}

		if (!rescued) {
		    c.println("You missed all your chances for rescue.");
		}

		displayStats(c, health, energy);
	}
		public static void clearScreen() {  

	}
}
