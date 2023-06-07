import java.util.*;

public class _9 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the starting range : ");
        int x = read.nextInt();
        System.out.print("Enter the ending range : ");
        int y = read.nextInt();
        System.out.print("***** PERFECT NUMBERS *****\n");
        System.out.print(perfect(x,y));
    }
    public static int perfect(int x, int y){
        int num = 0;
        for(int i = x+1; i<y; i++){
            int original = i;
            int sum = 0;
            for(int j = 1; j<i; j++){
                if(i%j == 0){
                    sum = sum + j;
                }
            }
            if(sum == original){
                System.out.print(original + " ");
                num = num + 1;
            }
        }
        return 0;
    }
}
