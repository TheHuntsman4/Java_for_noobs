import java.util.Scanner;

public class _7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the range of numbers
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the ending number: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        printArmstrongNumbers(start, end);
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Method to print Armstrong numbers within a given range
    public static void printArmstrongNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

