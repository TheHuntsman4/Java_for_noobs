import java.util.Scanner;

public class _1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 4-digit integer: ");
        int num = scanner.nextInt();

        boolean allEven = true;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                allEven = false;
                break;
            }
            num /= 10;
        }

        System.out.println(allEven);
    }
}
