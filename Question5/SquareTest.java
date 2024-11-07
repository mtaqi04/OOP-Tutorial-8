package Question5;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class SquareTest {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("magicData"));
        int count = 1; // Counter for square number
        int size = scan.nextInt(); // Size of the next square

        // Process each square until we encounter -1
        while (size != -1) {
            // Create a new Square of the given size
            Square square = new Square(size);

            // Read values into the square
            square.readSquare(scan);

            System.out.println("\n******** Square " + count + " ********");

            // Print the square
            square.printSquare();

            // Print the sums of its rows
            for (int i = 0; i < size; i++) {
                System.out.println("Sum of row " + i + ": " + square.sumRow(i));
            }

            // Print the sums of its columns
            for (int i = 0; i < size; i++) {
                System.out.println("Sum of column " + i + ": " + square.sumCol(i));
            }

            // Print the sum of the main diagonal
            System.out.println("Sum of the main diagonal: " + square.sumMainDiag());

            // Print the sum of the other diagonal
            System.out.println("Sum of the other diagonal: " + square.sumOtherDiag());

            // Determine and print whether it is a magic square
            if (square.magic()) {
                System.out.println("This square is magic!");
            } else {
                System.out.println("This square is not magic.");
            }

            // Get size of the next square
            size = scan.nextInt();
            count++;
        }

        scan.close();
    }
}
