import java.util.*;

public class _6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        for (int i = 0; i < numberString.length(); i++) {
            System.out.print(numberString.charAt(i) + " ");
        }
    }
}

