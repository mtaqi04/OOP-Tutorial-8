package Question4;

import java.util.Scanner;

public class Square {
    private int[][] square;

    public Square(int size) {
        square = new int[size][size];
    }

    public void readSquare(Scanner scan) {
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                square[row][col] = scan.nextInt();
            }
        }
    }

    public void printSquare() {
        for (int[] row : square) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public int sumRow(int row) {
        int sum = 0;
        for (int value : square[row]) {
            sum += value;
        }
        return sum;
    }

    public int sumColumn(int col) {
        int sum = 0;
        for (int[] row : square) {
            sum += row[col];
        }
        return sum;
    }

    public int sumMainDiagonal() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][i];
        }
        return sum;
    }

    public int sumOtherDiagonal() {
        int sum = 0;
        for (int i = 0; i < square.length; i++) {
            sum += square[i][square.length - 1 - i];
        }
        return sum;
    }

    public boolean isMagic() {
        int targetSum = sumMainDiagonal();

        if (sumOtherDiagonal() != targetSum) return false;

        for (int i = 0; i < square.length; i++) {
            if (sumRow(i) != targetSum || sumColumn(i) != targetSum) return false;
        }
        return true;
    }
}

