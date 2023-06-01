import java.util.*;

public class _10 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int a = read.nextInt();
        int result = sum(a);
        System.out.print("The sum of the digits is : " +result);
    }
    public static int sum(int x){
        if(x<10){
            return x;
        }
        else{
            int lastdigit = x%10;
            int remainingdigits = x/10;
            return lastdigit + sum(remainingdigits);
        }
    }
}