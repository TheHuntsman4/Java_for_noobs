import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] arr = {10, 20, 30, 40, 50};

            System.out.print("Enter the index of the array to get the number: ");
            String userInput = scanner.nextLine();

            // Parsing user input to integer
            int index = Integer.parseInt(userInput);

            // Accessing the array element at the given index
            int number = arr[index];
            System.out.println("Number at index " + index + ": " + number);

        } catch (NumberFormatException ex) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Index out of bounds. Please enter a valid index within the array size.");
        } catch (Exception ex) {
            System.out.println("Caught an unexpected exception: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}
