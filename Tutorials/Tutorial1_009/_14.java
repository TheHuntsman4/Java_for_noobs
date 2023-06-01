import java.util.*;

public class _14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows = ");
        int num = sc.nextInt();
        for(int i = 1;i<=num;i++){
            for(int j =1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.println();
        for(int i = 1;i<=num;i++){
            for(int j =1;j<=i;j++){
                System.out.printf("%d",i);
            }
            System.out.printf("\n");
        }
        System.out.println();
        for(int i = 1;i<=num;i++){
            for(int j =1;j<=i;j++){
                System.out.printf("%d",j);
            }
            System.out.printf("\n");
        }
    }
}
