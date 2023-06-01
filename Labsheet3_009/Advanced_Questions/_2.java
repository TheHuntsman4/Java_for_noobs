import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter positive integers
        System.out.print("Enter a sequence of positive integers (enter a negative value to stop): ");

        int number = input.nextInt();
        int max = number;
        int min = number;

        // Read and process the sequence of positive integers
        while (number >= 0) {
            // Update the maximum and minimum values
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }

            number = input.nextInt();
        }

        // Display the maximum and minimum values
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}

