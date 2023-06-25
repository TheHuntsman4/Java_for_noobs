import java.util.Arrays;
import java.util.Scanner;

public class _4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        sortArrayDescending(array);

        System.out.println("Sorted array (descending order): " + Arrays.toString(array));
    }

    public static void sortArrayDescending(int[] array) {
        Arrays.sort(array);

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }
}
