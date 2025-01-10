/**
 * 
 */
package Culminating;

/**
 * 
 */
import java.util.*;

public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            // Display the welcome screen and explain the game rules
            displayWelcomeScreen();

            // Word bank for the game
            String[] wordBank = {
                "apple", "banana", "cherry", "grape", "orange", "peach", "mango", "strawberry", "blueberry", "watermelon",
                "pineapple", "kiwi", "lemon", "pear", "coconut", "plum", "raspberry", "blackberry", "pomegranate"
            };

            // Select a random word from the word bank
            String randomWord = selectRandomWord(wordBank);
            char[] guessedWord = new char[randomWord.length()];
            Arrays.fill(guessedWord, '_');
            ArrayList<Character> guessedLetters = new ArrayList<>();
            ArrayList<Character> wrongLetters = new ArrayList<>();
            int incorrectGuesses = 0;
            final int maxGuesses = 6;

            // Gameplay loop
            while (true) {
                clearScreen(); // Clear the console for better visibility
                displayGameState(guessedWord, guessedLetters, wrongLetters, incorrectGuesses);
                System.out.print("Enter a letter: ");
                String input = scanner.next().toLowerCase();

                if (input.length() != 1) {
                    System.out.println("Please enter a single letter.");
                    continue;
                }

                char guess = input.charAt(0);

                if (isGuessValid(guess, guessedLetters)) {
                    guessedLetters.add(guess);

                    if (updateGuessedWord(guessedWord, randomWord, guess)) {
                        System.out.println("Correct guess!");
                    } else {
                        incorrectGuesses++;
                        wrongLetters.add(guess);
                        System.out.println("Incorrect guess!");
                    }

                    // Check for win or loss conditions
                    if (checkWin(guessedWord)) {
                        clearScreen();
                        displayGameState(guessedWord, guessedLetters, wrongLetters, incorrectGuesses);
                        displayWinMessage(randomWord);
                        break;
                    }

                    if (checkLoss(incorrectGuesses, maxGuesses)) {
                        clearScreen();
                        displayGameState(guessedWord, guessedLetters, wrongLetters, incorrectGuesses);
                        displayLossMessage(randomWord);
                        break;
                    }
                } else {
                    System.out.println("Invalid guess or already guessed. Try again.");
                }
            }

            // Ask the player if they want to play again
            playAgain = askReplay(scanner);

        } while (playAgain);

        // Exit message
        System.out.println("Thank you for playing Hangman! Goodbye.");
        scanner.close();
    }

    // Clears the console for better visibility (simulated with newlines)
    public static void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    // Displays the welcome screen with instructions
    public static void displayWelcomeScreen() {
        System.out.println("=========================");
        System.out.println("    WELCOME TO HANGMAN   ");
        System.out.println("=========================");
        System.out.println("Rules:");
        System.out.println("1. Try to guess the word one letter at a time.");
        System.out.println("2. You have 6 chances to guess incorrectly before the hangman is complete.");
        System.out.println("3. If you guess all the letters in the word before running out of chances, you win!");
        System.out.println("Good luck!");
    }

    // Selects a random word from the word bank
    public static String selectRandomWord(String[] wordBank) {
        Random random = new Random();
        return wordBank[random.nextInt(wordBank.length)];
    }

    // Displays the current state of the game
    public static void displayGameState(char[] guessedWord, ArrayList<Character> guessedLetters, ArrayList<Character> wrongLetters, int incorrectGuesses) {
        System.out.println("\n=========================");
        System.out.println("       HANGMAN GAME      ");
        System.out.println("=========================");
        displayHangman(incorrectGuesses);
        System.out.print("Word: ");
        for (char c : guessedWord) {
            System.out.print(c + " ");
        }
        System.out.println("\n\nWrong Letters: " + wrongLetters);
        System.out.println("Guessed Letters: " + guessedLetters);
    }

    // Validates whether a guess is valid
    public static boolean isGuessValid(char guess, ArrayList<Character> guessedLetters) {
        return Character.isLetter(guess) && !guessedLetters.contains(guess);
    }

    // Updates the guessed word with correct letters
    public static boolean updateGuessedWord(char[] guessedWord, String actualWord, char guess) {
        boolean correct = false;
        for (int i = 0; i < actualWord.length(); i++) {
            if (actualWord.charAt(i) == guess) {
                guessedWord[i] = guess;
                correct = true;
            }
        }
        return correct;
    }

    // Checks if the player has won
    public static boolean checkWin(char[] guessedWord) {
        for (char c : guessedWord) {
            if (c == '_') {
                return false;
            }
        }
        return true;
    }

    // Checks if the player has lost
    public static boolean checkLoss(int incorrectGuesses, int maxGuesses) {
        return incorrectGuesses >= maxGuesses;
    }

    // Displays the hangman graphic based on the number of incorrect guesses
    public static void displayHangman(int incorrectGuesses) {
        switch (incorrectGuesses) {
            case 0:
                System.out.println("\n   +---+\n       |\n       |\n       |\n       |\n       |\n    =====");
                break;
            case 1:
                System.out.println("\n   +---+\n   O   |\n       |\n       |\n       |\n       |\n    =====");
                break;
            case 2:
                System.out.println("\n   +---+\n   O   |\n   |   |\n       |\n       |\n       |\n    =====");
                break;
            case 3:
                System.out.println("\n   +---+\n   O   |\n  /|   |\n       |\n       |\n       |\n    =====");
                break;
            case 4:
                System.out.println("\n   +---+\n   O   |\n  /|\\  |\n       |\n       |\n       |\n    =====");
                break;
            case 5:
                System.out.println("\n   +---+\n   O   |\n  /|\\  |\n  /    |\n       |\n       |\n    =====");
                break;
            case 6:
                System.out.println("\n   +---+\n   O   |\n  /|\\  |\n  / \\  |\n       |\n       |\n    =====");
                break;
        }
    }

    // Displays the win message
    public static void displayWinMessage(String word) {
        System.out.println("\n=========================");
        System.out.println("    CONGRATULATIONS!     ");
        System.out.println("=========================");
        System.out.println("You guessed the word: " + word);
        System.out.println("Great job! You saved the hangman.");
    }

    // Displays the loss message
    public static void displayLossMessage(String word) {
        System.out.println("\n=========================");
        System.out.println("        GAME OVER        ");
        System.out.println("=========================");
        System.out.println("The word was: " + word);
        System.out.println("Better luck next time!");
    }

    // Asks the player if they want to replay the game
    public static boolean askReplay(Scanner scanner) {
        while (true) {
            System.out.print("Would you like to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();
           
        }
    }
}
