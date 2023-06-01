import java.util.Scanner;

public class _4{
    public static void main(String[] args) {
        final double CARROTS_PRICE = 50.0;
        final double ORANGES_PRICE = 10.0;
        final double APPLES_PRICE = 25.0;
        final double CABBAGE_PRICE = 20.0;
        final double BANANA_PRICE = 30.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight of carrots (in kg): ");
        double carrotsWeight = scanner.nextDouble();

        System.out.print("Enter number of oranges: ");
        int orangesCount = scanner.nextInt();

        System.out.print("Enter number of apples: ");
        int applesCount = scanner.nextInt();

        System.out.print("Enter weight of cabbage (in kg): ");
        double cabbageWeight = scanner.nextDouble();

        System.out.print("Enter weight of banana (in kg): ");
        double bananaWeight = scanner.nextDouble();

        double carrotsAmount = carrotsWeight * CARROTS_PRICE;
        double orangesAmount = orangesCount * ORANGES_PRICE;
        double applesAmount = applesCount * APPLES_PRICE;
        double cabbageAmount = cabbageWeight * CABBAGE_PRICE;
        double bananaAmount = bananaWeight * BANANA_PRICE;

        double totalAmount = carrotsAmount + orangesAmount + applesAmount + cabbageAmount + bananaAmount;

        System.out.println("\nGrocery Shop Bill");
        System.out.println("-----------------");
        System.out.printf("Carrots  : %.2f kg x %.2f rs/kg = %.2f rs\n", carrotsWeight, CARROTS_PRICE, carrotsAmount);
        System.out.printf("Oranges  : %d x %.2f rs/item = %.2f rs\n", orangesCount, ORANGES_PRICE, orangesAmount);
        System.out.printf("Apples   : %d x %.2f rs/item = %.2f rs\n", applesCount, APPLES_PRICE, applesAmount);
        System.out.printf("Cabbage  : %.2f kg x %.2f rs/kg = %.2f rs\n", cabbageWeight, CABBAGE_PRICE, cabbageAmount);
        System.out.printf("Banana   : %.2f kg x %.2f rs/kg = %.2f rs\n", bananaWeight, BANANA_PRICE, bananaAmount);
        System.out.println("-----------------");
        System.out.printf("Total amount: %.2f rs\n", totalAmount);
    }
}
