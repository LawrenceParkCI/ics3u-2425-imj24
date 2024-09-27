package unit1;

public class BingoCard {

	public void print() {
		System.out.println("Bingo Rules:");
		System.out.println("1. Each player receives a card with 5 columns labeled B, I, N, G, and O.");
		System.out.println("2. Each column contains 5 different numbers from a specific range.");
		System.out.println("3. A number will be called out and if you have that number you place a chip");
		System.out.println("4. The goal is to complete a row, column, or diagonal to win.");
		System.out.println("5. Once you have a line of 5 you yell bingo");
		System.out.println();
		
		
		System.out.format("   %-3s  %-3s  %-3s  %-3s  %-3s%n", "B", "I", "N", "G", "O");
        System.out.format("+----+----+----+----+---------+%n");

        // Row 1
        System.out.format("| %-2d | %-2d | %-2d | %-2d | %-3d    |%n", 5, 17, 33, 47, 66);
        System.out.format("+----+----+----+----+---------+%n");

        // Row 2
        System.out.format("| %-2d | %-2d | %-2d | %-2d | %-3d    |%n", 10, 24, 36, 55, 61);
        System.out.format("+----+----+----+----+---------+%n");

        // Row 3 (Free space in the center)
        System.out.format("| %-2d | %-2d | %-4s| %-2d | %-3d    |%n", 14, 19, "FREE", 50, 73);
        System.out.format("+----+----+----+----+---------+%n");

        // Row 4
        System.out.format("| %-2d | %-2d | %-2d | %-2d | %-3d    |%n", 3, 21, 44, 56, 70);
        System.out.format("+----+----+----+----+---------+%n");

        // Row 5
        System.out.format("| %-2d | %-2d | %-2d | %-2d | %-3d    |%n", 12, 29, 31, 60, 67);
        System.out.format("+----+----+----+----+---------+%n");
	}
}