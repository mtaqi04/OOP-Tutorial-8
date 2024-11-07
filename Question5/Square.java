package Question5;

import java.util.Scanner;

public class Square {
    int[][] square;

    // Constructor to create a new square of given size
    public Square(int size) {
        square = new int[size][size];
    }

    // Method to return the sum of the values in the given row
    public int sumRow(int row) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[row][i];
        }
        return sum;
    }

    // Method to return the sum of the values in the given column
    public int sumCol(int col) {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][col];
        }
        return sum;
    }

    // Method to return the sum of the values in the main diagonal
    public int sumMainDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    // Method to return the sum of the values in the other ("reverse") diagonal
    public int sumOtherDiag() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - 1 - i];
        }
        return sum;
    }

    // Method to check if the square is magic (all rows, cols, and diags have same sum)
    public boolean magic() {
        int magicSum = sumMainDiag();

        // Check all rows and columns
        for (int i = 0; i < square.length; i++) {
            if (sumRow(i) != magicSum || sumCol(i) != magicSum) {
                return false;
            }
        }

        // Check both diagonals
        return sumOtherDiag() == magicSum;
    }

    // Method to read info into the square from the input stream associated with the Scanner parameter
    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    // Method to print the contents of the square, neatly formatted
    public void printSquare() {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square.length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
