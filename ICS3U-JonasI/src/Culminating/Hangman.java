package Culminating;
/**
 * Description: This program is a fun interactive hangman game
 * Date: Jan 16, 2025
 * @author Jonas Im
 */
import hsa_new.Console;
import hsa_new.Message;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Entry point for the Hangman game.
 */
public class Hangman {
    private Console console; // Console object for user interaction
    private String randomWord; // The randomly selected word for the game
    private char[] guessedWord; // The current state of the guessed word
    private ArrayList<Character> wrongLetters; // List of incorrectly guessed letters
    private int incorrectGuesses; // Count of incorrect guesses made
    private final int maxGuesses = 6; // Maximum allowed incorrect guesses
    private int score; // Player's current score
    private int highestScore = 0; // Highest score achieved in the session

    // Word banks for different difficulty levels
    private final String[] easyWords = {"cat", "dog", "bat", "rat", "hat"};
    private final String[] mediumWords = {"elephant", "crocodile", "pineapple", "galaxy", "hangman"};
    private final String[] hardWords = {"strawberry", "university", "knowledge", "javascript", "adventure"};

    private String difficulty; // Current difficulty level

    public static void main(String[] args) {
        // Start the Hangman game
        new Hangman().playGame();
    }

    /**
     * Constructor initializes the game console and player score.
     */
    public Hangman() {
        console = new Console(40, 120, 24, "Ultimate Hangman: Hero's Quest");
        score = 0;
    }

    /**
     * Main game loop that controls the flow of the game.
     */
    public void playGame() {
        setDifficulty(); // Let the player choose the difficulty level
        do {
            initializeGame(); // Set up the game for a new round
            gameLoop(); // Run the main gameplay loop
            updateHighestScore(); // Update the session's highest score
        } while (playAgain()); // Check if the player wants to play again

        // End of the game session
        console.clear();
        console.setTextColor(Color.BLUE);
        console.println("Thanks for playing! Your final score: " + score + " points.");
        console.println("Your highest score this session: " + highestScore + " points. Goodbye, Champion!");
        console.close();
    }

    /**
     * Allows the player to choose the difficulty level.
     */
    private void setDifficulty() {
        console.clear();
        console.setTextColor(Color.BLUE);
        console.println("Welcome to Hangman: Hero's Quest!");
        console.println("Choose your difficulty level:");
        console.println("1. Easy (Warm-Up)");
        console.println("2. Medium (Challenge)");
        console.println("3. Hard (Legend)");
        console.setTextColor(Color.BLACK);

        int choice;
        do {
            console.print("Enter your choice (1, 2, or 3): ");
            choice = console.readInt();
        } while (choice < 1 || choice > 3); // Validate the player's choice

        switch (choice) {
            case 1 -> difficulty = "Easy";
            case 2 -> difficulty = "Medium";
            case 3 -> difficulty = "Hard";
        }

        console.clear();
        console.setTextColor(Color.GREEN);
        console.println("You have chosen: " + difficulty + " mode. Prepare for glory!");
        console.setTextColor(Color.BLACK);
    }

    /**
     * Initializes the game state for a new round.
     */
    private void initializeGame() {
        randomWord = getRandomWord().toUpperCase(); // Select a random word
        guessedWord = new char[randomWord.length()];
        Arrays.fill(guessedWord, '_'); // Fill guessedWord with underscores
        wrongLetters = new ArrayList<>(); // Reset wrong letters list
        incorrectGuesses = 0; // Reset incorrect guesses count

        // Display the initial game state
        console.clear();
        console.setTextColor(Color.BLUE);
        console.println("Welcome to the battlefield, Hero!");
        console.println("Guess the word to defeat the hangman and claim your victory!");
        console.setTextColor(Color.BLACK);
    }

    /**
     * Selects a random word based on the chosen difficulty level.
     * @return A randomly selected word
     */
    private String getRandomWord() {
        String[] wordBank;
        switch (difficulty) {
            case "Easy" -> wordBank = easyWords;
            case "Medium" -> wordBank = mediumWords;
            case "Hard" -> wordBank = hardWords;
            default -> throw new IllegalStateException("Unexpected value: " + difficulty);
        }
        return wordBank[(int) (Math.random() * wordBank.length)];
    }

    /**
     * Main gameplay loop where the player makes guesses.
     */
    private void gameLoop() {
        while (true) {
            console.clear();
            drawHangman(); // Draw the current hangman state
            displayGameState(); // Show the current game state

            char guess;
            do {
                console.print("Enter your letter of choice: ");
                guess = Character.toUpperCase(console.readChar());
                console.readLine(); // Consume the newline character
                if (!isValidGuess(guess)) {
                    console.println("You already guessed that letter or it is invalid. Try again.");
                }
            } while (!isValidGuess(guess)); // Validate the player's guess

            if (processGuess(guess)) {
                if (checkWin()) { // Check if the player has won
                    guessedWord = randomWord.toCharArray();
                    console.clear();
                    drawHangman();
                    displayGameState();
                    score += 10; // Award points for a win
                    new Message("Heroic Victory! You guessed the word! +10 points.", "Triumph");
                    break;
                }
            } else {
                if (checkLoss()) { // Check if the player has lost
                    console.clear();
                    drawHangman();
                    new Message("You have fallen! The word was: " + randomWord, "Defeat");
                    break;
                }
            }
        }
    }

    /**
     * Displays the current state of the game, including guessed letters and remaining guesses.
     */
    private void displayGameState() {
        console.setTextColor(Color.DARK_GRAY);
        console.println();
        console.println("Current Word: " + new String(guessedWord)); // Show the guessed word
        console.println("Wrong Attempts: " + wrongLetters); // Show wrong guesses
        console.println("Guesses Remaining: " + (maxGuesses - incorrectGuesses)); // Show remaining guesses
        console.println("Your Score: " + score); // Show current score
        console.setTextColor(Color.BLACK);
    }

    /**
     * Draws the hangman figure based on the number of incorrect guesses.
     */
    private void drawHangman() {
        console.setColor(Color.BLACK);
        int baseY = 500;
        int headY = baseY - 300;

        // Draw the gallows
        console.drawLine(50, baseY, 300, baseY);
        console.drawLine(150, baseY, 150, baseY - 400);
        console.drawLine(150, baseY - 400, 250, baseY - 400);
        console.drawLine(250, baseY - 400, 250, headY);

        // Draw the hangman figure step by step
        if (incorrectGuesses > 0) {
            console.setColor(Color.ORANGE);
            console.fillOval(225, headY, 50, 50);
            console.drawString("O", 240, headY + 30);
        }
        if (incorrectGuesses > 1) console.drawLine(250, headY + 50, 250, headY + 150); // Body
        if (incorrectGuesses > 2) console.drawLine(250, headY + 70, 200, headY + 100); // Left arm
        if (incorrectGuesses > 3) console.drawLine(250, headY + 70, 300, headY + 100); // Right arm
        if (incorrectGuesses > 4) console.drawLine(250, headY + 150, 220, headY + 200); // Left leg
        if (incorrectGuesses > 5) {
            console.drawLine(250, headY + 150, 280, headY + 200); // Right leg
            console.setTextColor(Color.RED);
            console.drawString("DEFEATED!", 100, baseY - 150);
            console.setTextColor(Color.BLACK);
        }
    }

    /**
     * Validates the player's guess.
     * @param guess The guessed character
     * @return True if the guess is valid, false otherwise
     */
    private boolean isValidGuess(char guess) {
        return Character.isLetter(guess) && !wrongLetters.contains(guess) && !new String(guessedWord).contains(String.valueOf(guess));
    }

    /**
     * Processes the player's guess and updates the game state.
     * @param guess The guessed character
     * @return True if the guess is correct, false otherwise
     */
    private boolean processGuess(char guess) {
        boolean correct = false;
        for (int i = 0; i < randomWord.length(); i++) {
            if (randomWord.charAt(i) == guess) {
                guessedWord[i] = guess; // Update guessed word
                correct = true;
            }
        }
        if (!correct) {
            wrongLetters.add(guess); // Add to wrong guesses
            incorrectGuesses++; // Increment incorrect guesses
            score = Math.max(0, score - 2); // Deduct points for wrong guesses
        }
        return correct;
    }

    /**
     * Checks if the player has won the game.
     * @return True if all letters are guessed, false otherwise
     */
    private boolean checkWin() {
        for (char c : guessedWord) {
            if (c == '_') return false;
        }
        return true;
    }

    /**
     * Checks if the player has lost the game.
     * @return True if the maximum number of guesses is reached, false otherwise
     */
    private boolean checkLoss() {
        return incorrectGuesses >= maxGuesses;
    }

    /**
     * Prompts the player to decide if they want to play another round.
     * @return True if the player wants to play again, false otherwise
     */
    private boolean playAgain() {
        while (true) {
            console.print("Will you challenge again? (yes/no): ");
            String input = console.readLine().trim().toLowerCase();
            if (input.equals("yes")) return true;
            if (input.equals("no")) return false;
        }
    }

    /**
     * Updates the highest score achieved in the session.
     */
    private void updateHighestScore() {
        if (score > highestScore) {
            highestScore = score;
        }
    }
}
