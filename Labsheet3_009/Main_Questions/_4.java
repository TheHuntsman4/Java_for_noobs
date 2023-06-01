import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter number1 and number2
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();
        
        System.out.print("Enter number2: ");
        int number2 = input.nextInt();
        
        // Make sure number1 is smaller than number2
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        // Print even numbers between number1 and number2
        System.out.println("Even numbers between " + number1 + " and " + number2 + ":");
        for (int i = number1; i <= number2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

