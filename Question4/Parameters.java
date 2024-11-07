package Question4;

import java.util.Scanner;

public class Parameters {

    //-----------------------------------------------
    // Calls the average and minimum methods with
    // different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args) {
        double mean1, mean2, mean3, mean4;
        mean1 = average(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);
        mean3 = average(13); // Call with a single integer
        mean4 = average(); // Call with no parameters

        System.out.println("mean1 = " + mean1);
        System.out.println("mean2 = " + mean2);
        System.out.println("mean3 = " + mean3);
        System.out.println("mean4 = " + mean4);

        // Interactive part
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter up to 20 non-negative integers (enter a negative number to stop):");
        int[] numbers = new int[20];
        int count = 0;

        while (count < 20) {
            int num = scanner.nextInt();
            if (num < 0) break;
            numbers[count++] = num;
        }

        // Invoke average method with entered numbers
        double userMean = average(getValidArray(numbers, count));
        System.out.println("User-entered numbers mean = " + userMean);

        // Testing the minimum method
        System.out.println("Minimum for (42, 69, 37) = " + minimum(42, 69, 37));
        System.out.println("Minimum for (35, 43, 93, 23, 40, 21, 75) = " + minimum(35, 43, 93, 23, 40, 21, 75));
        System.out.println("Minimum for (13) = " + minimum(13));
        System.out.println("Minimum for () = " + minimum()); // Edge case with no parameters
    }

    //----------------------------------------------
    // Returns the average of its parameters.
    //----------------------------------------------
    public static double average(int... list) {
        double result = 0.0;
        if (list.length != 0) {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            result = (double) sum / list.length;
        }
        return result;
    }

    //----------------------------------------------
    // Returns the minimum of its parameters.
    //----------------------------------------------
    public static int minimum(int... list) {
        if (list.length == 0) {
            return Integer.MAX_VALUE; // Return a high value if no parameters are given
        }
        int min = list[0];
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Helper method to retrieve the valid portion of the array
    public static int[] getValidArray(int[] numbers, int count) {
        int[] validArray = new int[count];
        System.arraycopy(numbers, 0, validArray, 0, count);
        return validArray;
    }
}

