import java.util.Scanner;

public class _8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Fibonacci series from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to calculate the Fibonacci number at a given position
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

