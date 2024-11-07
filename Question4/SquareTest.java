package Question4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        try {
            Scanner fileScanner = new Scanner(new File("Question5/magicData"));

            while (fileScanner.hasNextInt()) {
                int size = fileScanner.nextInt();
                Square square = new Square(size);
                square.readSquare(fileScanner);

                System.out.println("Square:");
                square.printSquare();

                if (square.isMagic()) {
                    System.out.println("This square is magic!");
                } else {
                    System.out.println("This square is not magic.");
                }
                System.out.println();
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}

