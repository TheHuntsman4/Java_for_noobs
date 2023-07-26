import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the weight of the product: ");
            int weight = scanner.nextInt();
            productCheck(weight);
            System.out.println("Product weight is valid.");
        } catch (myException ex) {
            System.out.println("Caught myException: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Caught an unexpected exception: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void productCheck(int weight) throws myException {
        if (weight < 100) {
            throw new myException();
        }
    }
}

class myException extends Exception {
    public myException() {
        super("Product invalid");
    }
}
