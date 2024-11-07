package Question2;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of values
        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        // Initialize the array with the given number of elements
        int[] array = new int[n];

        // Prompt the user to enter each value
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Display the original array
        System.out.println("Original array:");
        printArray(array);

        // Reverse the array in place
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        // Display the reversed array
        System.out.println("Reversed array:");
        printArray(array);

        scanner.close();
    }

    // Helper method to print the array elements
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
