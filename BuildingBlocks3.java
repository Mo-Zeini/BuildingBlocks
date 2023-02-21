package BuildingBlocks;

/*
 * This program builds blocks by asking the user for input for the height, the width, and the symbol. This class uses for loop.
 */

import java.util.Scanner; // Add the Scanner class to the program.

public class BuildingBlocks3 {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in); // Create the Scanner.
		
		System.out.print("Enter the length of height: ");
		int height = stdin.nextInt();
		
		System.out.print("Enter the length of the depth: ");
		int depth = stdin.nextInt();
		
		System.out.print("Enter the symbol: ");
		String symbol = stdin.next();
		
		int x, y;
		
		for ( x = 1; x <= height; x++ ) {
			for ( y = 1; y <= depth; y++ ) {
				System.out.print(symbol);
			}
			System.out.println();
		} 
	}
}

