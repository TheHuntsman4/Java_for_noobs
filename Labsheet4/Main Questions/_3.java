import java.util.Scanner;

public class _3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = input.nextDouble();

        // Perform operations using methods
        double sum1 = calculateSum(num1, num2);
        double product1 = calculateProduct(num1, num2);
        double average1 = calculateAverage(num1, num2);
        double minimum1 = findMinimum(num1, num2);
        double maximum1 = findMaximum(num1, num2);

        double sum2 = calculateSum(num1, num3);
        double product2 = calculateProduct(num1, num3);
        double average2 = calculateAverage(num1, num3);
        double minimum2 = findMinimum(num1, num3);
        double maximum2 = findMaximum(num1, num3);

        double sum3 = calculateSum(num1, num2, num3);
        double product3 = calculateProduct(num1, num2, num3);
        double average3 = calculateAverage(num1, num2, num3);

        // Display the results
        System.out.println("Sum (1st and 2nd numbers): " + sum1);
        System.out.println("Product (1st and 2nd numbers): " + product1);
        System.out.println("Average (1st and 2nd numbers): " + average1);
        System.out.println("Minimum (1st and 2nd numbers): " + minimum1);
        System.out.println("Maximum (1st and 2nd numbers): " + maximum1);

        System.out.println("Sum (1st and 3rd numbers): " + sum2);
        System.out.println("Product (1st and 3rd numbers): " + product2);
        System.out.println("Average (1st and 3rd numbers): " + average2);
        System.out.println("Minimum (1st and 3rd numbers): " + minimum2);
        System.out.println("Maximum (1st and 3rd numbers): " + maximum2);

        System.out.println("Sum (all three numbers): " + sum3);
        System.out.println("Product (all three numbers): " + product3);
        System.out.println("Average (all three numbers): " + average3);
    }

    // Method overloading for two numbers
    public static double calculateSum(double num1, double num2) {
        return num1 + num2;
    }

    public static double calculateProduct(double num1, double num2) {
        return num1 * num2;
    }

    public static double calculateAverage(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double findMinimum(double num1, double num2) {
        return Math.min(num1, num2);
    }

    public static double findMaximum(double num1, double num2) {
        return Math.max(num1, num2);
    }

    // Method overloading for three numbers
    public static double calculateSum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static double calculateProduct(double num1, double num2, double num3) {
        return num1 * num2 * num3;
    }

    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}

