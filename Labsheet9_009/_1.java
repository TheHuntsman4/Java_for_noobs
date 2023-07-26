import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Check if the size is negative
            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative");
            }

            int[] arr = new int[size];
            System.out.println("Array created successfully!");
        } catch (NegativeArraySizeException ex) {
            System.out.println("Caught NegativeArraySizeException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Caught an unexpected exception: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
