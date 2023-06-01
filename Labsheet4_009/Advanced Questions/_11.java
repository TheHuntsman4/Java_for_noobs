import java.util.*;

public class _11 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int a = read.nextInt();
        double result = factsum(a);
        System.out.print("The sum of the factorial series is : " +result);
    }
    public static double fact(int x){
        
        if(x == 1){
            return 1;
        }
        
        else{
            return x * fact(x-1);
        }
    }
    public static double factsum(int x){
        if(x == 1){
            return 1;
        }
        else{
            return fact(x)/x + factsum(x-1);
        }
    }
}