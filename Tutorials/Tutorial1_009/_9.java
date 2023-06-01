import java.util.*;

public class _9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting range:- ");
        int s = scan.nextInt();
        System.out.println("Enter the ending range :- ");
        int e = scan.nextInt();
        for (int i = s; i <= e; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        scan.close();
    }
}
