import java.util.Scanner;

public class _5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Prime numbers between 1 and " + number + ":");
        printPrimeNumbers(number);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // It's divisible by a number other than 1 and itself
            }
        }

        return true; // It's only divisible by 1 and itself (prime number)
    }

    // Method to print prime numbers between 1 and a given number
    public static void printPrimeNumbers(int number) {
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

