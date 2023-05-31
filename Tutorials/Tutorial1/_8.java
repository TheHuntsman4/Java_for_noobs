import java.util.*;

public class _8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the weight o the melon:- ");
        int w = scan.nextInt();
        int flag = 0;
        for (int i = 0; i <= w / 2; i++) {
            if (i % 2 == 0 && (w - i) % 2 == 0) {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
