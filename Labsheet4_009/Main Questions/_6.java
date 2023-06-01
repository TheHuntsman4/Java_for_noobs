import java.util.Scanner;

public class _6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = checkArmstrong(number);

        System.out.println(result);
    }

    // Method to check if a number is an Armstrong number
    public static String checkArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        if (sum == originalNumber) {
            return originalNumber + " is an Armstrong number.";
        } else {
            return originalNumber + " is not an Armstrong number.";
        }
    }
}

