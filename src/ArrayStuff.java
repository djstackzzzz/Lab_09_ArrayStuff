import java.util.Random;
import java.util.Scanner;

class Lab_09_ArrayStuff {

    public static void main(String[] args) {
        // Task 1: Declare an array of type int named dataPoints with length 100
        int[] dataPoints = new int[100];

        // Task 2: Initialize each element in dataPoints with a random value between 1 and 100
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3: Display dataPoints values in a single line separated by " | "
        System.out.println("Generated Random Data Points:");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println(); // Move to the next line

        // Task 4: Calculate and display sum and average
        int sum = 0;
        for (int val : dataPoints) {
            sum += val;
        }
        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the dataPoints array is: " + sum);
        System.out.println("The average of the dataPoints array is: " + average);

        // Task 5: Prompt user to input an integer between 1 and 100
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 100 to search in the array: ");
        int userInput = scanner.nextInt();

        // Task 6: Count occurrences of user's value in the array
        int count = 0;
        for (int value : dataPoints) {
            if (value == userInput) {
                count++;
            }
        }
        System.out.println("The number " + userInput + " was found " + count + " times in the array.");

        // Task 7: Find the first occurrence of user's value
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                position = i;
                break; // Stop after finding the first match
            }
        }
        if (position != -1) {
            System.out.println("The number " + userInput + " was found at index position " + position + ".");
        } else {
            System.out.println("The number " + userInput + " was not found in the array.");
        }

        // Task 8: Find the minimum and maximum values in dataPoints
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("The minimum value in the array is: " + min);
        System.out.println("The maximum value in the array is: " + max);

        // Task 9: Call the getAverage method and print the result
        System.out.println("The average of dataPoints is: " + getAverage(dataPoints));
    }

    // Task 9: Static method to calculate average
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return (double) sum / values.length;
    }
}
