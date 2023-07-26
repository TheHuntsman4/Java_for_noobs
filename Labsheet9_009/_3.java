import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a dividend: ");
            int dividend = scanner.nextInt();

            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();

            // Perform division
            int result = dividend / divisor;
            System.out.println("Result: " + result);

        } catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (Exception ex) {
            System.out.println("Caught an unexpected exception: " + ex.getMessage());
        } finally {
            System.out.println("Exting program");
            scanner.close();
        }
    }
}
