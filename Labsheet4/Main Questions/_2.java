import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Perform operations using methods
        double sum = calculateSum(num1, num2);
        double product = calculateProduct(num1, num2);
        double average = calculateAverage(num1, num2);
        double minimum = findMinimum(num1, num2);
        double maximum = findMaximum(num1, num2);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
    }

    // Method to calculate the sum of two numbers
    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }

    // Method to calculate the product of two numbers
    public static double calculateProduct(double num1, double num2) {
        return num1 * num2;
    }

    // Method to calculate the average of two numbers
    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    // Method to find the minimum value among two numbers
    public static double findMinimum(double num1, double num2) {
        return Math.min(num1, num2);
    }

    // Method to find the maximum value among two numbers
    public static double findMaximum(double num1, double num2) {
        return Math.max(num1, num2);
    }
}

